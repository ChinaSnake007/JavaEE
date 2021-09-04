package com.yang.factory;

import com.yang.service.HeroService;
import com.yang.service.impl.HeroServicelmpl;

public class ServiceFactory {
    public static HeroService getHeroServiceInstance(){
        return new HeroServicelmpl();
    }

}
