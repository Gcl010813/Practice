package com.xiaoGuo.community.controller;

import com.xiaoGuo.community.dao.impl.SafePersonDaoImpl;
import com.xiaoGuo.community.pojo.SafePerson;
import com.xiaoGuo.community.service.impl.SafePersonServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/communityAddSafePersonName")
public class CommunityAddSafePersonNameServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        List<SafePerson> SafePersonNameList=new SafePersonServiceImpl().queryAllName();
        List<String> nameList=new ArrayList<>();
        for (SafePerson s:SafePersonNameList) {
            nameList.add(s.getSafeName());
        }
        response.getWriter().print(nameList);
    }
}
