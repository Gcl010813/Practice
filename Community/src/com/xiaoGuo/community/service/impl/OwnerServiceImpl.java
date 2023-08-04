package com.xiaoGuo.community.service.impl;

import com.xiaoGuo.community.dao.OwnerDao;
import com.xiaoGuo.community.dao.impl.OwnerDaoImpl;
import com.xiaoGuo.community.pojo.Owner;
import com.xiaoGuo.community.service.OwnerService;
import com.xiaoGuo.community.utils.PageUtil;

import java.util.List;

public class OwnerServiceImpl implements OwnerService {
    OwnerDao ownerDao=new OwnerDaoImpl();
    @Override
    public boolean addOwner(Owner owner) {
        return ownerDao.insertOwner(owner);
    }

    @Override
    public boolean removeOwner(int id) {
        return ownerDao.deleteOwner(id);
    }

    @Override
    public boolean updateOwner(Owner owner) {
        return ownerDao.updateOwner(owner);
    }

    @Override
    public Owner queryOwnerById(int id) {
        return ownerDao.queryOwnerById(id);
    }

    @Override
    public List<Owner> queryAll() {
        return ownerDao.queryAllOwner();
    }

    @Override
    public PageUtil<Owner> queryAllByPage(PageUtil pageUtil) {
        //获取全部数据
        List<Owner> list = ownerDao.queryAllOwner();
        //将数据的总条数封装到分页对象中
        pageUtil.setDataCount(list.size());
        //计算总页数 = (总条数+每页显示的条数 -1)/每页显示的条数
        int totalPages = (pageUtil.getDataCount() + pageUtil.getPageSize() - 1) / pageUtil.getPageSize();
        pageUtil.setTotalPages(totalPages);
        //计算开始下标
        int beginIndex = (pageUtil.getPageNumber() - 1) * pageUtil.getPageSize();
        pageUtil.setBeginIndex(beginIndex);
        //根据分页的开始下标和每页显示的条数进行查询对应页的数据
        List<Owner> ownerList = ownerDao.queryAllOwnerByPage(pageUtil);
        //将查询的数据封装到对应的工具类中
        pageUtil.setList(ownerList);
        return pageUtil;
    }
}
