package com.xiaoGuo.community.service.impl;

import com.xiaoGuo.community.dao.SafeLogDao;
import com.xiaoGuo.community.dao.impl.SafeLogDaoImpl;
import com.xiaoGuo.community.pojo.Community;
import com.xiaoGuo.community.pojo.SafeLog;
import com.xiaoGuo.community.service.SafeLogService;
import com.xiaoGuo.community.utils.PageUtil;

import java.util.List;

public class SafeLogServiceImpl implements SafeLogService {
    SafeLogDao safeLogDao=new SafeLogDaoImpl();
    @Override
    public boolean addSafeLog(SafeLog safeLog) {
        return safeLogDao.insertSafeLog(safeLog);
    }

    @Override
    public boolean removeSafeLog(int id) {
        return safeLogDao.deleteSafeLog(id);
    }

    @Override
    public boolean updateSafeLog(SafeLog safeLog) {
        return safeLogDao.updateSafeLog(safeLog);
    }

    @Override
    public SafeLog querySafeLogById(int id) {
        return safeLogDao.querySafeLogById(id);
    }

    @Override
    public List<SafeLog> queryAll() {
        return safeLogDao.queryAllSafeLog();
    }

    @Override
    public PageUtil<SafeLog> queryAllByPage(PageUtil pageUtil) {
        //获取全部数据
        List<SafeLog> list = safeLogDao.queryAllSafeLog();
        //将数据的总条数封装到分页对象中
        pageUtil.setDataCount(list.size());
        //计算总页数 = (总条数+每页显示的条数 -1)/每页显示的条数
        int totalPages = (pageUtil.getDataCount() + pageUtil.getPageSize() - 1) / pageUtil.getPageSize();
        pageUtil.setTotalPages(totalPages);
        //计算开始下标
        int beginIndex = (pageUtil.getPageNumber() - 1) * pageUtil.getPageSize();
        pageUtil.setBeginIndex(beginIndex);
        //根据分页的开始下标和每页显示的条数进行查询对应页的数据
        List<SafeLog> safeLogList = safeLogDao.queryAllByPage(pageUtil);
        //将查询的数据封装到对应的工具类中
        pageUtil.setList(safeLogList);
        return pageUtil;
    }

    @Override
    public List<SafeLog> queryByOwnName(String ownName) {
        return safeLogDao.queryByOwnName(ownName);
    }

    @Override
    public List<SafeLog> queryBySafePersonName(String safeName) {
        return safeLogDao.queryBySafePersonName(safeName);
    }
}
