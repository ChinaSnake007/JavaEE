package com.yang.dao;

import com.yang.pojo.Hero;

import java.sql.SQLException;
import java.util.List;

// dao:DataAccessObject
public interface HeroDao {
    public List<Hero> listAll() throws SQLException;

}
