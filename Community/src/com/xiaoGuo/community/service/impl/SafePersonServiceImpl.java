package com.xiaoGuo.community.service.impl;

import com.xiaoGuo.community.dao.SafePersonDao;
import com.xiaoGuo.community.dao.impl.SafePersonDaoImpl;
import com.xiaoGuo.community.pojo.SafePerson;
import com.xiaoGuo.community.service.SafePersonService;
import com.xiaoGuo.community.utils.PageUtil;

import java.util.List;

public class SafePersonServiceImpl implements SafePersonService {
    SafePersonDao safePersonDao=new SafePersonDaoImpl();
    @Override
    public boolean addSafePerson(SafePerson safePerson) {
        return safePersonDao.insertSafePerson(safePerson);
    }

    @Override
    public boolean removeSafePerson(int id) {
        return safePersonDao.deleteSafePerson(id);
    }

    @Override
    public boolean updateSafePerson(SafePerson safePerson) {
        return safePersonDao.updateSafePerson(safePerson);
    }

    @Override
    public SafePerson querySafePersonById(int id) {
        return safePersonDao.querySafePersonById(id);
    }

    @Override
    public List<SafePerson> queryAll() {
        return safePersonDao.queryAllSafePerson();
    }

    @Override
    public PageUtil<SafePerson> queryAllByPage(PageUtil pageUtil) {
        //获取全部数据
        List<SafePerson> list = safePersonDao.queryAllSafePerson();
        //将数据的总条数封装到分页对象中
        pageUtil.setDataCount(list.size());
        //计算总页数 = (总条数+每页显示的条数 -1)/每页显示的条数
        int totalPages = (pageUtil.getDataCount() + pageUtil.getPageSize() - 1) / pageUtil.getPageSize();
        pageUtil.setTotalPages(totalPages);
        //计算开始下标
        int beginIndex = (pageUtil.getPageNumber() - 1) * pageUtil.getPageSize();
        pageUtil.setBeginIndex(beginIndex);
        //根据分页的开始下标和每页显示的条数进行查询对应页的数据
        List<SafePerson> safePersonList = safePersonDao.queryAllSafePersonByPage(pageUtil);
        //将查询的数据封装到对应的工具类中
        pageUtil.setList(safePersonList);
        return pageUtil;
    }

    @Override
    public List<SafePerson> queryAllName() {
        return safePersonDao.queryAllName();
    }
}
