package com.yang.test;

import java.sql.*;

public class TestJdbc {
    //执行
    public static void main(String[] args) throws SQLException {
        String username = "12345";
        String password = "123456";
        String RL="jdbc:sqlserver://localhost:1433;DatabaseName=yagnsen";
        String sqlStr="select * from users where usernames = \'"+username+"\' and password = \'"+password +"\'";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");	//驱动程序类
            System.out.println("驱动类加载成功");
            Connection con=DriverManager.getConnection(RL,"sa","123456");	//创建于数据库的连接
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(sqlStr);
            if(rs.next())
                System.out.println("存在");
            else
                System.out.println("不存在");

            rs.close();
            con.close();
        }
        catch(Exception err) {
            err.printStackTrace(System.out);
        }
    }
}
