package com.yang.controller;




import com.alibaba.fastjson.JSONArray;
import com.yang.factory.ServiceFactory;
import com.yang.pojo.Hero;
import com.yang.service.HeroService;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


@WebServlet(value = "/hello")
public class HelloServelet extends  HttpServlet  {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        HeroService service = ServiceFactory.getHeroServiceInstance();
        List<Hero> list = service.queryAll();
        out = response.getWriter();
        String array = null;
        try{
            array = JSONArray.toJSONString(list);
        }catch (Exception e){
            e.printStackTrace();
        }
        out.println(array);
    }
}
