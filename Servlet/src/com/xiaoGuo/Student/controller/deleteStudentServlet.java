/**
 * author: xiaoGuo
 * Date: 2023-07-26 20:11:47
 */
package com.xiaoGuo.Student.controller;

import com.xiaoGuo.Student.service.impl.StudentServiceDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/deleteStudent")
public class deleteStudentServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

        int id=Integer.parseInt(request.getParameter("id"));

        boolean deleteFlag=new StudentServiceDaoImpl().deleteStudent(id);
        if(deleteFlag){
            response.getWriter().println("ok");
        }
    }
}
