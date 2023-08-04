package com.xiaoGuo.community.controller;

import com.xiaoGuo.community.pojo.SafePerson;
import com.xiaoGuo.community.service.impl.SafePersonServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@WebServlet("/safePersonAdd")
public class SafePersonAddServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        String safeNick=request.getParameter("safeNick");
        String safeName=request.getParameter("safeName");
        String safePhone=request.getParameter("safePhone");
        int status=Integer.parseInt(request.getParameter("status"));

        SafePerson safePerson=new SafePerson(safeNick,safeName,safePhone,new Date(),new Date(),status);
        if (new SafePersonServiceImpl().addSafePerson(safePerson)){
            response.getWriter().print("ok");
        }
    }
}
