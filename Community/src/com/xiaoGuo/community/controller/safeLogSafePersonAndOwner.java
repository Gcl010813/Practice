package com.xiaoGuo.community.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xiaoGuo.community.pojo.SafeLog;
import com.xiaoGuo.community.service.impl.SafeLogServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/safeLogSafePersonAndOwner")
public class safeLogSafePersonAndOwner extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        String safeName=request.getParameter("safeName");

        List<SafeLog> safeLogBySafePersonList=new SafeLogServiceImpl().queryBySafePersonName(safeName);
        String safeLogBySafePersonListJsonStr=new ObjectMapper().writeValueAsString(safeLogBySafePersonList);
        response.getWriter().println(safeLogBySafePersonListJsonStr);
    }
}
