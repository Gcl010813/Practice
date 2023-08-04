/**
 * author: xiaoGuo
 * Date: 2023-07-27 17:12:54
 */
package com.xiaoGuo.Student.controller;

import com.xiaoGuo.Student.pojo.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;

@WebServlet("/setSession")
public class setSession extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession httpSession=request.getSession();

        httpSession.setAttribute("session1","小郭1");
        Student student=new Student("HeT","小郭","17550228932",1,100.00,1,new Date());
        httpSession.setAttribute("student",student);
    }
}
