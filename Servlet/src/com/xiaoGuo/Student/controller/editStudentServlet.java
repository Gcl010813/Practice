/**
 * author: xiaoGuo
 * Date: 2023-07-26 17:49:49
 */
package com.xiaoGuo.Student.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xiaoGuo.Student.pojo.Student;
import com.xiaoGuo.Student.service.impl.StudentServiceDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/editStudent")
public class editStudentServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("application/json");

        int id=Integer.parseInt(request.getParameter("id"));

        Student student=new StudentServiceDaoImpl().selectById(id);
        if(student!=null){
            String jsonStrStudent=new ObjectMapper().writeValueAsString(student);
            response.getWriter().println(jsonStrStudent);
        }
    }
}
