package com.yang.util;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface IObjectMap<T>{
    public T getInstaceByResultSet(ResultSet rs) throws SQLException;
}
