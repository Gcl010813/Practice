/**
 * author: xiaoGuo
 * Date: 2023-07-26 20:27:17
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

@WebServlet("/updateStudent")
public class updateStudentServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("application/json");

        int id=Integer.parseInt(request.getParameter("id"));
        String nickname=request.getParameter("nickName");
        String name=request.getParameter("name");
        String mobile=request.getParameter("mobile");
        int gender=Integer.parseInt(request.getParameter("gender"));
        Double balance= Double.valueOf(request.getParameter("balance"));
        int status=Integer.parseInt(request.getParameter("status"));

        boolean updateFlag=new StudentServiceDaoImpl().updateStudent(new Student(id,nickname,name,mobile,gender,balance,status,new Date()));
        if(updateFlag){
            response.getWriter().println("ok");
        }
    }
}
