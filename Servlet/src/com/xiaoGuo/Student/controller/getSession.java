/**
 * author: xiaoGuo
 * Date: 2023-07-27 17:15:39
 */
package com.xiaoGuo.Student.controller;

import com.xiaoGuo.Student.pojo.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class getSession extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession httpSession=request.getSession();

        String session1=(String) httpSession.getAttribute("session1");
        Student student=(Student) httpSession.getAttribute("student");

        System.out.println(session1);
        System.out.println(student);
    }
}
