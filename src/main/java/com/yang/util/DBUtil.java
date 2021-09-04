package com.yang.util;


import org.apache.commons.dbcp.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil {
    public static DataSource dataSource;
    public static Properties properties = new Properties();
    //线程本地化变量
    public static ThreadLocal<Connection> threadLocal = new ThreadLocal<Connection>();
    //静态代码块
    static{
        try{
            properties.load(DBUtil.class.getClassLoader().getResourceAsStream("db.properties"));
            dataSource = BasicDataSourceFactory.createDataSource(properties);
        }catch(IOException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    // 创建连接的过程
    public static Connection getConnection() throws SQLException {
        Connection conn = threadLocal.get();
        if(conn==null){
            conn = dataSource.getConnection();
            threadLocal.set(conn);
        }

        return conn;
    }
    //关闭连接
    public  void closeConnection() throws SQLException {
        Connection conn = threadLocal.get();
        if(conn!=null){
            conn.close();
            threadLocal.set(null);
        }
    }

    //关闭资源操作
    public static void closeResources(ResultSet rs, PreparedStatement pstmt) throws  SQLException{
        if(rs!=null){
            rs.close();
        }
        if(pstmt!=null){
            pstmt.close();
        }
    }

}
