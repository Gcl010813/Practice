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
@WebServlet("/safePersonUpdate")
public class SafePersonUpdateServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        int id=Integer.parseInt(request.getParameter("id"));
        String safeNick=request.getParameter("safeNick");
        String safeName=request.getParameter("safeName");
        String safePhone=request.getParameter("safePhone");
        int status=Integer.parseInt(request.getParameter("status"));

        SafePerson safePerson=new SafePerson(id,safeNick,safeName,safePhone,/*更新时间*/new Date(),status);
        if(new SafePersonServiceImpl().updateSafePerson(safePerson)){
            response.getWriter().print("ok");
        }
    }
}
