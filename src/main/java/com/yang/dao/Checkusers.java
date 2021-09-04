package com.yang.dao;


import com.yang.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Checkusers {
    public int Login(String username,String password) throws SQLException {
        Connection conn = DBUtil.getConnection();
        PreparedStatement preparedStatement = conn.prepareStatement("select * from users where usernames = \'"+username+"\' and password = \'"+password +"\'" );

        ResultSet rs = preparedStatement.executeQuery();
        int a=0;
        while(rs.next()){
            a=1;
        }
        if(a==0)
            return 0;
        else
            return 1;
    }
}
