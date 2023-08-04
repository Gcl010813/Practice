package com.xiaoGuo.community.controller;

import com.xiaoGuo.community.pojo.SafeLog;
import com.xiaoGuo.community.service.impl.SafeLogServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
@WebServlet("/safeLogUpdate")
public class SafeLogUpdateServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        int id=Integer.parseInt(request.getParameter("id"));
        String safeName=request.getParameter("safeName");
        String ownName=request.getParameter("ownName");
        String ownPhone=request.getParameter("ownPhone");
        String comAddress=request.getParameter("comAddress");
        String houseNumber=request.getParameter("houseNumber");
        String notes=request.getParameter("notes");
        String ownSignature=request.getParameter("ownSignature");
        int isPass=Integer.parseInt(request.getParameter("isPass"));

        SafeLog safeLog=new SafeLog(id,safeName,ownName,ownPhone,comAddress,houseNumber,notes,ownSignature,isPass,/*更新时间*/new Date());
        if(new SafeLogServiceImpl().updateSafeLog(safeLog)){
            response.getWriter().print("ok");
        }
    }
}
