package com.yang.dao.impl;

import com.yang.dao.HeroDao;
import com.yang.pojo.Hero;
import com.yang.util.jdbcTemplate;

import java.sql.SQLException;
import java.util.List;

public class HeroDaoImpl implements HeroDao {
    @Override
    public List<Hero> listAll() throws SQLException {
        List<Hero> list = jdbcTemplate.executeQuery("select * from Shenmu",r->{
            Hero h = new Hero();
            h.setName1(r.getString(1));
            h.setTitle(r.getString(2));
            h.setAddress(r.getString(3));
            return h;
        },null);
        return list;
    }
}
