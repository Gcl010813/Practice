package com.xiaoGuo.community.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xiaoGuo.community.service.impl.CommunityServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/communityEdit")
public class CommunityEditServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        int id=Integer.parseInt(request.getParameter("id"));
        String communityJsonStr=new ObjectMapper().writeValueAsString(new CommunityServiceImpl().queryCommunityById(id));
        response.getWriter().print(communityJsonStr);
    }
}
