package newsportalpackage;

import com.bean.Category;
import com.pool.ConnectionPool;
import com.utility.FileUploader;
import com.utility.SmsSender;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.lang.StringEscapeUtils;

public class MainController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        String op = request.getParameter("op");
        if (op != null && op.equals("getcontact")) {
            String username = request.getParameter("username");
            ConnectionPool cp = ConnectionPool.getInstance();
            cp.initialize();
            Connection con = cp.getConnection();
            if (con != null) {
                String sql = "select * from reporter where username=?";
                PreparedStatement smt;
                try {
                    smt = con.prepareStatement(sql);
                    smt.setString(1, username);
                    ResultSet res = smt.executeQuery();
                    if (res.next()) {
                        String mobile = res.getString("contact");
                        String email = res.getString("");
                        int otp = ThreadLocalRandom.current().nextInt(100000, 999999);

                        String message = "OTP: " + otp;
                        String output = SmsSender.sendCampaign("UP6TJHWDA6E78A7O99VQFLUDIYO4MRHD", "RTF9N9MV3SAH083O", "stage", mobile, message, "Aarima");
                        HttpSession session = request.getSession();
                        if (output.contains("200")) {
                            out.println("<b>OTP Sent to your registered Mobile Number!!<br/>Enter OTP in 2 Minutes!!</b>");
                            session.setAttribute("cotp", message);
                        } else {
                            out.println("OTP could not be Sent!!");
                        }
                        smt.close();

                    } else {
                        out.println("Your Username is not registered!!");
                    }

                } catch (SQLException e) {
                    System.out.println(e);
                }
                cp.putConnection(con);
            }

        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        String op = request.getParameter("op");

        if (op != null && op.equals("add")) {
            String encodedPassword = "";
            String photo = "";
            String imagepath = "";
            HttpSession session = request.getSession();
            com.bean.Reporter reporter = (com.bean.Reporter) session.getAttribute("reporter");
            Boolean isMultipart = ServletFileUpload.isMultipartContent(request);
            FileUploader fu = new FileUploader();
            if (isMultipart) {
                imagepath = fu.uploadFile(request, getServletContext(), "media/reporter");
                reporter.setPhoto(imagepath);
            }

            encodedPassword = Base64.getEncoder().encodeToString(reporter.getPassword().getBytes("UTF-8"));
            reporter.setPassword(encodedPassword);
            com.dao.ReporterDao ud = new com.dao.ReporterDao();
            if (ud.addReporter(reporter)) {
                session.removeAttribute("reporter");
                response.sendRedirect("login.jsp");
            }

        }

        if (op != null && op.equals("addnews")) {

            String title = "";
            String description = "";
            String photo = "";
            int postedby =-1;
            String postdate = "";
            String status = "";
            String status_text = "";
            String imagepath = "";
            ArrayList<String> catlist=new ArrayList();
            Boolean isMultipart = ServletFileUpload.isMultipartContent(request);
            if (!isMultipart) {
            } else {
                FileItemFactory factory = new DiskFileItemFactory();
                ServletFileUpload upload = new ServletFileUpload(factory);
                List items = null;
                try {
                    items = upload.parseRequest(request);
                } catch (Exception e) {
                    System.out.println(e);
                }
                Iterator itr = items.iterator();
                while (itr.hasNext()) {
                    FileItem item = (FileItem) itr.next();
                    if (item.isFormField()) {
                        String fieldname = item.getFieldName();
                        String fieldvalue = item.getString();
                        if (fieldname.equals("title")) {
                            title = fieldvalue;
                        } else if (fieldname.equals("description")) {
                            description = fieldvalue;
                        } else if (fieldname.equals("postedby")) {
                            postedby = Integer.parseInt(fieldvalue);
                        }else if(fieldname.equals("postdate")){
                            postdate=fieldvalue;
                        }else if (fieldname.equals("status")) {
                            status = fieldvalue;
                        } else if (fieldname.equals("status_text")) {
                            status_text = fieldvalue;
                        }else if(fieldname.equals("category")){
                            catlist.add(fieldvalue);  
                        }
                    } else {
                        try {
                            photo = item.getName();
                            if (item.getName().isEmpty()) {
                            } else {
                                imagepath = "media/news/" + photo;
                                File savedFile = new File(getServletContext().getRealPath("/") + imagepath);
                                item.write(savedFile);
                            }

                        } catch (Exception e) {
                            System.out.println(e);
                        }
                    }
                }

            }

            ConnectionPool cp = ConnectionPool.getInstance();
            cp.initialize();
            Connection con = cp.getConnection();
            if (con != null) {
                PreparedStatement smt = null;
                try {
                    String sql = "insert into news(title,description,photos,postedby,postdate,status,status_text) values(?,?,?,?,?,?,?)";
                    smt = con.prepareStatement(sql);
                    smt.setString(1,StringEscapeUtils.escapeHtml(title));
                    smt.setString(2,StringEscapeUtils.escapeHtml(description));
                    smt.setString(3,imagepath);
                    smt.setInt(4,postedby);
                    smt.setString(5,postdate);
                    smt.setString(6, status);
                    smt.setString(7,status_text);
                    if(smt.executeUpdate()>0){
                        int userid=-1;
                        String sql1="SELECT * from news order by id desc limit 1";
                        PreparedStatement smt1=con.prepareStatement(sql1);
                        ResultSet res1=smt1.executeQuery();
                        if(res1.next()){
                            userid=res1.getInt("id");
                        }
                        smt1.close();
                        String sql2="insert into ncr(catid,newsid) values(?,?)";
                        PreparedStatement smt2=con.prepareStatement(sql2);
                        for(String cat:catlist){
                            smt2.setInt(1,Integer.parseInt(cat));
                            smt2.setInt(2,userid);
                            smt2.executeUpdate();
                        }
                        smt2.close();
                    }
                    smt.close();
                    cp.putConnection(con);
                    System.out.println("News Added!!");
                    response.sendRedirect("../reporter/dashboard.jsp");
                } catch (Exception e) {
                    System.out.println(e);
                }

            }

        }

    }

}
