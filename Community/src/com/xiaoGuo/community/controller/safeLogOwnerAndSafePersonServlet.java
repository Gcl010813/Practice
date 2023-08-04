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

@WebServlet("/safeLogOwnerAndSafePerson")
public class safeLogOwnerAndSafePersonServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        String ownName=request.getParameter("ownName");

        List<SafeLog> safeLogByOwnerList=new SafeLogServiceImpl().queryByOwnName(ownName);
        String safeLogByOwnerListJsonStr=new ObjectMapper().writeValueAsString(safeLogByOwnerList);
        response.getWriter().println(safeLogByOwnerListJsonStr);
    }
}
