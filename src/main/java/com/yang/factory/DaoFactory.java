package com.yang.factory;

import com.yang.dao.HeroDao;
import com.yang.dao.impl.HeroDaoImpl;

/*工厂：*/
public class DaoFactory {
    public static HeroDao getHeroDaoInstance(){
        return new HeroDaoImpl();

    }
}
