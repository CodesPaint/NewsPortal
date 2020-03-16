package com.dao;

import com.bean.News;
import com.bean.Reporter;
import com.pool.ConnectionPool;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Base64;

public class ReporterDao {

    public Reporter getReporterByNewsId(int newsid){
        Reporter reporter = null;
        ConnectionPool cp = ConnectionPool.getInstance();
        cp.initialize();
        Connection con = cp.getConnection();
        if (con != null) {
            String sql = "select * from reporter where id in(select postedby from news where id=?);";
            try {
                PreparedStatement smt = con.prepareStatement(sql);
                smt.setInt(1, newsid);
                ResultSet res = smt.executeQuery();
                if (res.next()) {
                    reporter = new Reporter();
                    reporter.setId(res.getInt("id"));
                    reporter.setName(res.getString("name"));
                    reporter.setUsername(res.getString("username"));
                    reporter.setPassword(res.getString("password"));
                    reporter.setAddress(res.getString("address"));
                    reporter.setDob(res.getString("dob"));
                    reporter.setGender(res.getString("gender"));
                    reporter.setContact(res.getString("contact"));
                    reporter.setEmail(res.getString("email"));
                    reporter.setQualification(res.getString("qualification"));
                    reporter.setPhoto(res.getString("photo"));
                    reporter.setStatus(res.getString("status"));
                }
                smt.close();
                cp.putConnection(con);
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
        return reporter;
    }
    
    public Reporter validReporter(String username, String password) throws UnsupportedEncodingException{
        Reporter reporter = null;
        String encodedPassword = "";
        encodedPassword = Base64.getEncoder().encodeToString(password.getBytes("UTF-8"));
        ConnectionPool cp = ConnectionPool.getInstance();
        cp.initialize();
        Connection con = cp.getConnection();
        if (con != null) {
            String sql = "select * from reporter where username=? and password=? and status='Approved'";
            try {
                PreparedStatement smt = con.prepareStatement(sql);
                smt.setString(1, username);
                smt.setString(2, encodedPassword);
                ResultSet res = smt.executeQuery();
                int flg = 0;
                if (res.next()) {
                    reporter = new Reporter();
                    reporter.setId(res.getInt("id"));
                    reporter.setName(res.getString("name"));
                    reporter.setUsername(res.getString("username"));
                    reporter.setPassword(res.getString("password"));
                    reporter.setAddress(res.getString("address"));
                    reporter.setDob(res.getString("dob"));
                    reporter.setGender(res.getString("gender"));
                    reporter.setContact(res.getString("contact"));
                    reporter.setEmail(res.getString("email"));
                    reporter.setQualification(res.getString("qualification"));
                    reporter.setPhoto(res.getString("photo"));
                    reporter.setStatus(res.getString("status"));
                }
                smt.close();
                cp.putConnection(con);
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
        return reporter;
    }
    
    public int changePassword(int userid,String oldpassword,String newpassword) throws UnsupportedEncodingException {
        int status = -1;
        String encodedoldpassword=Base64.getEncoder().encodeToString(oldpassword.getBytes("UTF-8"));
        String encodednewpassword=Base64.getEncoder().encodeToString(newpassword.getBytes("UTF-8"));        
        ConnectionPool cp = ConnectionPool.getInstance();
        cp.initialize();
        Connection con = cp.getConnection();
        if (con != null) {
            try{
            String sql="select * from reporter where id=? and password=?";
            PreparedStatement smt=con.prepareStatement(sql);
            smt.setInt(1,userid);
            smt.setString(2, encodedoldpassword);
            ResultSet res=smt.executeQuery();
            if(res.next()){
                status=0;
                String sql1="update reporter set password=? where id=?";
                PreparedStatement smt1=con.prepareStatement(sql1);
                smt1.setString(1, encodednewpassword);
                smt1.setInt(2,userid);
                if(smt1.executeUpdate()!=0){
                    status=1;
                }
                smt1.close();
            }
            smt.close();
            cp.putConnection(con);
            }catch(Exception e){
                System.out.println(e);
            }
        }
        return status;
    }

    public int validEmail(String email) {
        int userid = -1;
        ConnectionPool cp = ConnectionPool.getInstance();
        cp.initialize();
        Connection con = cp.getConnection();
        if (con != null) {
            try {
                String sql = "select * from reporter where email=?";
                PreparedStatement smt = con.prepareStatement(sql);
                smt.setString(1, email);
                ResultSet res = smt.executeQuery();
                if (res.next()) {
                    userid = res.getInt("id");
                }
                smt.close();
                cp.putConnection(con);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return userid;
    }

    public boolean addReporter(Reporter reporter) {
        boolean status = false;
        ConnectionPool cp = ConnectionPool.getInstance();
        cp.initialize();
        Connection con = cp.getConnection();
        if (con != null) {
            try {
                String sql = "insert into reporter(name,username,password,address,dob,gender,contact,email,qualification,photo) values(?,?,?,?,?,?,?,?,?)";
                PreparedStatement smt = con.prepareStatement(sql);
                smt.setString(1, reporter.getName());
                smt.setString(2, reporter.getUsername());
                smt.setString(3, reporter.getPassword());
                smt.setString(4, reporter.getAddress());
                smt.setString(5, reporter.getDob());
                smt.setString(5, reporter.getGender());
                smt.setString(6, reporter.getContact());
                smt.setString(7, reporter.getEmail());
                smt.setString(8, reporter.getQualification());
                smt.setString(9, reporter.getPhoto());

                if (smt.executeUpdate() > 0) {
                    status = true;
                }
                smt.close();
                cp.putConnection(con);

            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return status;
    }

    public int countAllReporter() {
        int count = 0;
        ConnectionPool cp = ConnectionPool.getInstance();
        cp.initialize();
        Connection con = cp.getConnection();

        if (con != null) {
            String sql = "select count(*) from reporter";
            try {
                PreparedStatement smt = con.prepareStatement(sql);

                ResultSet res = smt.executeQuery();
                if (res.next()) {
                    count = res.getInt(1);
                }
                smt.close();
                cp.putConnection(con);

            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return count;
    }

}
