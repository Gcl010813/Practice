/**
 * author: xiaoGuo
 * Date: 2023-07-31 10:41:25
 */
package com.xiaoGuo.community.controller;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.LineCaptcha;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/checkCode")
public class checkCode extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //定义图形验证码的长和宽
        LineCaptcha lineCaptcha = CaptchaUtil.createLineCaptcha(60, 30,4,50);
        //获取验证码的验证信息
        String checkCode=lineCaptcha.getCode();

        //存入session
        HttpSession session=request.getSession();
        session.setAttribute("checkCode",checkCode);

        lineCaptcha.write(response.getOutputStream());
    }
}
