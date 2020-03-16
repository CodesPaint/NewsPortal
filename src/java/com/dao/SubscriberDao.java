package com.dao;

import com.pool.ConnectionPool;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SubscriberDao {
    public int countAllSubscriber() {
        int count = 0;
        ConnectionPool cp = ConnectionPool.getInstance();
        cp.initialize();
        Connection con = cp.getConnection();
       
        if (con != null) {
            String sql = "select count(*) from subscriber";
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
