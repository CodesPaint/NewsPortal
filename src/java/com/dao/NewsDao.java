package com.dao;

import com.bean.News;
import com.pool.ConnectionPool;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class NewsDao {

    public ArrayList<News> getAllNews() {
        ArrayList<News> newslist = new ArrayList();
        News news;
        ConnectionPool cp = ConnectionPool.getInstance();
        cp.initialize();
        Connection con = cp.getConnection();
        if (con != null) {

            String sql = "select * from news";
            try {
                PreparedStatement smt = con.prepareStatement(sql);

                ResultSet res = smt.executeQuery();
                while (res.next()) {
                    news=new News();
                    news.setId(res.getInt("id"));
                    news.setTitle(res.getString("title"));
                    news.setDescription(res.getString("description"));
                    news.setPhotos(res.getString("photos"));
                    news.setPostedby(res.getInt("postedby"));
                    news.setPostdate(res.getString("postdate"));
                    news.setStatus(res.getString("status"));
                    news.setStatus_text(res.getString("status_text"));
                    newslist.add(news);
                }
                smt.close();
                cp.putConnection(con);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return newslist;
    }

    public ArrayList<News> getNewsByStatus(String status) {
        ArrayList<News> newslist = new ArrayList();
        News news;
        ConnectionPool cp = ConnectionPool.getInstance();
        cp.initialize();
        Connection con = cp.getConnection();
        if (con != null) {
            String sql = "select * from news where status=?";
            try {
                PreparedStatement smt = con.prepareStatement(sql);
                smt.setString(1, status);
                ResultSet res = smt.executeQuery();
                while (res.next()) {
                    news=new News();
                    news.setId(res.getInt("id"));
                    news.setTitle(res.getString("title"));
                    news.setDescription(res.getString("description"));
                    news.setPhotos(res.getString("photos"));
                    news.setPostedby(res.getInt("postedby"));
                    news.setPostdate(res.getString("postdate"));
                    news.setStatus(res.getString("status"));
                    news.setStatus_text(res.getString("status_text"));
                    newslist.add(news);
                }
                smt.close();
                cp.putConnection(con);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return newslist;
    }

    public ArrayList<News> getNewsByIdStatus(int id, String status) {
        ArrayList<News> newslist = new ArrayList();
        News news;
        ConnectionPool cp = ConnectionPool.getInstance();
        cp.initialize();
        Connection con = cp.getConnection();
        if (con != null) {
            String sql = "";
            if (status.equals("all")) {
                sql = "select * from news where postedby=?";
            } else {
                sql = "select * from news where postedby=? and status=?";
            }
            try {
                PreparedStatement smt = con.prepareStatement(sql);
                if (status.equals("all")) {
                    smt.setInt(1, id);
                } else {
                    smt.setInt(1, id);
                    smt.setString(2, status);
                }
                ResultSet res = smt.executeQuery();
                while (res.next()) {
                    news=new News();
                    news.setId(res.getInt("id"));
                    news.setTitle(res.getString("title"));
                    news.setDescription(res.getString("description"));
                    news.setPhotos(res.getString("photos"));
                    news.setPostedby(res.getInt("postedby"));
                    news.setPostdate(res.getString("postdate"));
                    news.setStatus(res.getString("status"));
                    news.setStatus_text(res.getString("status_text"));
                    newslist.add(news);
                }
                smt.close();
                cp.putConnection(con);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return newslist;
    }

    public int countAllNews() {
        int count = 0;
        ConnectionPool cp = ConnectionPool.getInstance();
        cp.initialize();
        Connection con = cp.getConnection();
        if (con != null) {
            String sql = "select count(*) from news";
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

    public int countPendingNews() {
        int count = 0;
        ConnectionPool cp = ConnectionPool.getInstance();
        cp.initialize();
        Connection con = cp.getConnection();
        if (con != null) {
            String sql = "select count(*) from news where status=?";
            try {
                PreparedStatement smt = con.prepareStatement(sql);
                smt.setString(1, "pending");
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
