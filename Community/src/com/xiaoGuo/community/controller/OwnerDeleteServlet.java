package com.xiaoGuo.community.controller;

import com.xiaoGuo.community.service.OwnerService;
import com.xiaoGuo.community.service.impl.OwnerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ownerDelete")
public class OwnerDeleteServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        String[] ids=request.getParameter("ids").split(",");
        OwnerService ownerService=new OwnerServiceImpl();
        for (String id:ids) {
            ownerService.removeOwner(Integer.parseInt(id));
        }
        response.getWriter().print("ok");
    }
}
