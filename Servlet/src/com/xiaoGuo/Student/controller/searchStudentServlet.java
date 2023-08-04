/**
 * author: xiaoGuo
 * Date: 2023-07-27 16:15:01
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

@WebServlet("/searchStudent")
public class searchStudentServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("application/json");

        String nickName=request.getParameter("nickName");
        String name=request.getParameter("name");
        String mobile=request.getParameter("mobile");

        List<Student> studentList=new StudentServiceDaoImpl().selectByNickNameAndNameAndMobile(new Student(nickName,name,mobile));
//        List<Student> studentList=new StudentServiceDaoImpl().selectByNickNameAndNameAndMobile(new Student("小","孙","15"));
        if(studentList!=null){
            String jsonStrStudentAll = new ObjectMapper().writeValueAsString(studentList);
            response.getWriter().println(jsonStrStudentAll);
        }
    }
}
