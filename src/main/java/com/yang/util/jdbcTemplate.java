package com.yang.util;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class jdbcTemplate {
    public static int executeUpdate(){

        return -1;
    }

    public static void setParams(PreparedStatement pstmt,Object ...params) throws SQLException{
        if(params!=null&&params.length>0){
            for(int i=0;i<params.length;i++){
                pstmt.setObject(i+1,params[i]);
            }
        }
    }
    //返回结果集合
    public static <T> List<T> executeQuery(String sql, IObjectMap<T> iObjectMap,Object ...params) throws SQLException {
        Connection conn = DBUtil.getConnection();
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        setParams(preparedStatement,params);

        ResultSet rs = preparedStatement.executeQuery();

        List<T> list = new ArrayList<T>();

        while(rs.next()){
            list.add(iObjectMap.getInstaceByResultSet(rs));
        }

        return list;
    }
}

