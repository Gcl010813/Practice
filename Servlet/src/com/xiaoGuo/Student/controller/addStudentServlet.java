/**
 * author: xiaoGuo
 * Date: 2023-07-26 19:39:37
 */
package com.xiaoGuo.Student.controller;

import com.xiaoGuo.Student.pojo.Student;
import com.xiaoGuo.Student.service.impl.StudentServiceDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@WebServlet("/addStudent")
public class addStudentServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

        String nickName=request.getParameter("nickName");
        String name=request.getParameter("name");
        String mobile=request.getParameter("mobile");
        int gender= Integer.parseInt(request.getParameter("gender"));
        Double balance= Double.valueOf(request.getParameter("balance"));
        int status=Integer.parseInt(request.getParameter("status"));
        System.out.println(nickName);
        System.out.println(name);
        System.out.println(mobile);

        boolean addFlag=new StudentServiceDaoImpl().addStudent(new Student(nickName,name,mobile,gender,balance,status,new Date()));
        if(addFlag){
            response.getWriter().println("ok");
        }
    }
}
