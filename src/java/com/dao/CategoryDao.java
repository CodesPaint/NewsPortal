package com.dao;

import com.bean.Category;
import com.pool.ConnectionPool;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CategoryDao {
    public ArrayList<Category> getCategoryForNews(int id){
        ArrayList<Category> catlist=new ArrayList();
        Category cat;
        ConnectionPool cp=ConnectionPool.getInstance();
        cp.initialize();
        Connection con=cp.getConnection();
        if(con!=null){
            try{
            String sql="select * from category where id in(select catid from ncr where newsid=?)";
            PreparedStatement smt=con.prepareStatement(sql);
            smt.setInt(1,id);
            ResultSet res=smt.executeQuery();
            while(res.next()){
                cat=new Category();
                cat.setId(res.getInt("id"));
                cat.setName(res.getString("name"));
                catlist.add(cat);
            }
            System.out.println(catlist);
            }catch(Exception e){
                System.out.println(e);
            }
        }
        return catlist;
    }
    public ArrayList<Category> getAllRecords(){
        ArrayList<Category> catlist=new ArrayList();
        ConnectionPool cp=ConnectionPool.getInstance();
        cp.initialize();
        Connection con=cp.getConnection();
        if(con!=null){
            String sql="select * from category";
            try{
                PreparedStatement smt=con.prepareStatement(sql);
                ResultSet res=smt.executeQuery();
                while(res.next()){
                    Category cat=new Category();
                    cat.setId(res.getInt("id"));
                    cat.setName(res.getString("name"));
                    catlist.add(cat);
                }
            }catch(Exception e){
                System.out.println(e);
            }
        }
        return catlist;
    }
}
