package com.xiaoGuo.community.controller;

import com.xiaoGuo.community.service.SafeLogService;
import com.xiaoGuo.community.service.impl.SafeLogServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/safeLogDelete")
public class SafeLogDeleteServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        String[] ids=request.getParameter("ids").split(",");
        SafeLogService safeLogService=new SafeLogServiceImpl();
        for (String id:ids) {
            safeLogService.removeSafeLog(Integer.parseInt(id));
        }
        response.getWriter().print("ok");
    }
}
