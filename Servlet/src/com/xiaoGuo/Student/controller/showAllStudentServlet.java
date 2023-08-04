/**
 * author: xiaoGuo
 * Date: 2023-07-26 19:07:47
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
import java.util.List;
@WebServlet("/showAllStudent")
public class showAllStudentServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("application/json");

        List<Student> studentList = new StudentServiceDaoImpl().selectAll();

        if (studentList != null) {
            String jsonStrStudentAll = new ObjectMapper().writeValueAsString(studentList);
            response.getWriter().println(jsonStrStudentAll);
        }
    }
}
