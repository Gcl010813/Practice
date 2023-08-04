package com.xiaoGuo.community.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xiaoGuo.community.pojo.Community;
import com.xiaoGuo.community.service.impl.CommunityServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/communitySearch")
public class CommunitySearchServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        int id=Integer.parseInt(request.getParameter("id"));
        String comName=request.getParameter("comName");
        String comType=request.getParameter("comType");
        String createTime=request.getParameter("createTime");
        String updateTime=request.getParameter("updateTime");

        List<Community> communityList=new CommunityServiceImpl().querySearch(new Community(id,comName,comType));
        String communityListJsonStr=new ObjectMapper().writeValueAsString(communityList);
        response.getWriter().println(communityListJsonStr);
    }
}
