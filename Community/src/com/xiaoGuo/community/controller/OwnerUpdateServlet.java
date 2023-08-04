package com.xiaoGuo.community.controller;

import com.xiaoGuo.community.pojo.Owner;
import com.xiaoGuo.community.service.impl.OwnerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@WebServlet("/ownerUpdate")
public class OwnerUpdateServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        int id=Integer.parseInt(request.getParameter("id"));
        String ownerName=request.getParameter("ownName");
        String ownPhone=request.getParameter("ownPhone");
        String comAddress=request.getParameter("comAddress");
        String houseNumber=request.getParameter("houseNumber");
        int peopleCount= Integer.parseInt(request.getParameter("peopleCount"));
        int isSafe=Integer.parseInt(request.getParameter("isSafe"));
        int isCheck=Integer.parseInt(request.getParameter("isCheck"));
        int houseCount=Integer.parseInt(request.getParameter("houseCount"));
        int sort=Integer.parseInt(request.getParameter("sort"));
        String notes=request.getParameter("notes");

        Owner owner=new Owner(id,ownerName,ownPhone,comAddress,houseNumber,peopleCount,isSafe,isCheck,houseCount,sort,notes,/*更新时间*/new Date());

        if(new OwnerServiceImpl().updateOwner(owner)){
            response.getWriter().print("ok");
        }
    }
}
