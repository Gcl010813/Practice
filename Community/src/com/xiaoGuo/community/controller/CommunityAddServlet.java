package com.xiaoGuo.community.controller;

import com.xiaoGuo.community.pojo.Community;
import com.xiaoGuo.community.service.impl.CommunityServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
@WebServlet("/communityAdd")
public class CommunityAddServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        String comName=request.getParameter("comName");
        String comType=request.getParameter("comType");
        String safePerson=request.getParameter("safePerson");

        Community community=new Community(comName,comType,safePerson,/*创建时间*/new Date(),/*更新时间*/new Date());
        if(new CommunityServiceImpl().addCommunity(community)){
            response.getWriter().print("ok");
        }
    }
}
