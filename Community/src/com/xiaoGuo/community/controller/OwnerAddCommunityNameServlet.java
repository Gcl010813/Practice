package com.xiaoGuo.community.controller;

import com.xiaoGuo.community.pojo.Community;
import com.xiaoGuo.community.service.impl.CommunityServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/ownerAddCommunityName")
public class OwnerAddCommunityNameServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        List<Community> communityNameList=new CommunityServiceImpl().queryAllName();
        List<String> nameList=new ArrayList<String>();
        for (Community c:communityNameList) {
            nameList.add(c.getComName());
        }
        response.getWriter().print(nameList);
    }
}
