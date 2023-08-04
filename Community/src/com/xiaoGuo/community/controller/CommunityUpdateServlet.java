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
@WebServlet("/communityUpdate")
public class CommunityUpdateServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        int id=Integer.parseInt(request.getParameter("id"));
        String comName=request.getParameter("comName");
        String comType=request.getParameter("comType");
        String safePerson=request.getParameter("safePerson");


        Community community=new Community(id,comName,comType,safePerson,/*更新时间*/new Date());
        if(new CommunityServiceImpl().updateCommunity(community)){
            response.getWriter().print("ok");
        }
    }
}
