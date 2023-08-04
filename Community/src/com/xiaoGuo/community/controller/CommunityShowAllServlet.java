package com.xiaoGuo.community.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xiaoGuo.community.service.impl.CommunityServiceImpl;
import com.xiaoGuo.community.utils.PageUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/communityShowAll")
public class CommunityShowAllServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        接受页面传递的当前页的数据
        String pageNumberStr = request.getParameter("pageNumber");
        int pageNumber;
        if (pageNumberStr != null && !pageNumberStr.equals("") && !pageNumberStr.equals("undefined")) {
            pageNumber = Integer.parseInt(pageNumberStr);
        } else {
            // 设置一个默认值
            pageNumber = 1;
        }

//        创建分页对象
        PageUtil pageUtil = new PageUtil();
        pageUtil.setPageNumber(pageNumber);         //设置当前页为第一页
        pageUtil.setPageSize(10);          //设置每页显示的条数
        pageUtil = new CommunityServiceImpl().queryAllByPage(pageUtil);
//        将list集合转为json字符串
        String communityListJsonStr = new ObjectMapper().writeValueAsString(pageUtil);
        response.getWriter().print(communityListJsonStr);
    }
}
