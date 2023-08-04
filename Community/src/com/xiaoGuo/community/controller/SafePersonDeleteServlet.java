package com.xiaoGuo.community.controller;

import com.xiaoGuo.community.service.SafePersonService;
import com.xiaoGuo.community.service.impl.SafePersonServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/safePersonDelete")
public class SafePersonDeleteServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        String[] ids=request.getParameter("ids").split(",");
        SafePersonService safePersonService=new SafePersonServiceImpl();
        for (String id:ids) {
            safePersonService.removeSafePerson(Integer.parseInt(id));
        }
        response.getWriter().print("ok");
    }
}
