package com.xiaoGuo.community.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xiaoGuo.community.service.impl.SafePersonServiceImpl;
import com.xiaoGuo.community.utils.PageUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/safePersonShowAll")
public class SafePersonShowAllServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

//        ����ҳ�洫�ݵĵ�ǰҳ������
        String pageNumberStr = request.getParameter("pageNumber");
        int pageNumber;
        if (pageNumberStr != null && !pageNumberStr.equals("") && !pageNumberStr.equals("undefined")) {
            pageNumber = Integer.parseInt(pageNumberStr);
        } else {
            // ����һ��Ĭ��ֵ
            pageNumber = 1;
        }

//        ������ҳ����
        PageUtil pageUtil = new PageUtil();
        pageUtil.setPageNumber(pageNumber);         //���õ�ǰҳΪ��һҳ
        pageUtil.setPageSize(10);          //����ÿҳ��ʾ������
        pageUtil = new SafePersonServiceImpl().queryAllByPage(pageUtil);
//        ��list����תΪjson�ַ���
        String safePersonListJsonStr = new ObjectMapper().writeValueAsString(pageUtil);
        response.getWriter().print(safePersonListJsonStr);
    }
}
