/**
 * author: xiaoGuo
 * Date: 2023-07-25 19:43:31
 */
package com.xiaoGuo.community.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String userName = request.getParameter("username");
        String passWord = request.getParameter("password");
        String checkCode = request.getParameter("checkCode");
        String sessionCheckCode = (String) session.getAttribute("checkCode");

        if (checkCode.equals(sessionCheckCode)) {
            if (userName.equals("xiaoGuo") && passWord.equals("0813")) {
                session.setAttribute("userName", userName);
                response.getWriter().print("ok");
            }
            else {
                response.getWriter().print("login error");
            }
        }
        else {
            response.getWriter().print("checkCode error");
        }
    }
}
