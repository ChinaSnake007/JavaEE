package com.yang.service.impl;

import com.yang.dao.HeroDao;
import com.yang.factory.DaoFactory;
import com.yang.pojo.Hero;
import com.yang.service.HeroService;

import java.sql.SQLException;
import java.util.List;
// 构建一个工厂，来完成对象创建操
public class HeroServicelmpl implements HeroService {
    //通过工厂方法获得对象的实例
    private HeroDao dao = DaoFactory.getHeroDaoInstance();

    @Override
    public List<Hero> queryAll() {
        try{
            return dao.listAll();
        }catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }
}














