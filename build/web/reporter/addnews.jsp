

<%@page import="com.bean.Reporter"%>
<%@page import="com.bean.Category"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.dao.CategoryDao"%>
<% 
    Reporter reporter=(Reporter) session.getAttribute("currentreporter"); 
%>
<div class="card card-outline-secondary">
    <div class="card-header">
        <h3 class="mb-0">Add News</h3>
    </div>
    <div class="card-body">
        <form class="form" role="form" action="MainController?op=addnews" autocomplete="off" method="post" enctype="multipart/form-data">
            <div class="form-group">
                <label for="title">Title</label>
                <input type="text" class="form-control" id="title" name="title" required="">
            </div>
            <div class="form-group">
                <label for="description">Description</label>
                <textarea class="form-control" rows="8" cols="20" id="description" name="description" required="" ></textarea>
                <span class="form-text small text-muted">
                    News Between 1000 words!!
                </span>
            </div>
            <div class="form-group">
                <table class="border-0">
                    <td>Select Categories</td>
                    <td>
                        <%
                            CategoryDao cd = new CategoryDao();
                            ArrayList<Category> catList = cd.getAllRecords();
                               for (Category cat : catList) {%>
                        <input type="checkbox" name="category" value="<%= cat.getId()%>"/> <%= cat.getName()%>
                        <%}%>                        
                    </td>
                </table>
            </div>
            <div class="form-group">
                <label for="postdate">Select Uploaded Date</label>
                <input type="date" name="postdate" value=""/>
            </div>


            <div class="form-group">
                <label for="photos">Photo</label>
                <img scr="" style="width:200px; height: 200px;" id="preview" class="form-control"/> <br/>
                <input type="file" name="photos" id="image" onchange="readURL(this, preview);" class="form-control border-0"/>                
            </div>

            <input type="hidden" name="postedby" value="<%= reporter.getId() %>"/>
            <input type="hidden" name="status" value="pending"/>
            <input type="hidden" name="status_text" value="Pending for Approval By Admin"/>

            <div class="form-group">
                <button type="submit" value="Save" name="submit" id ="submit" class="btn btn-success btn-lg float-right">Save</button>
            </div>
        </form>
    </div>
</div>
