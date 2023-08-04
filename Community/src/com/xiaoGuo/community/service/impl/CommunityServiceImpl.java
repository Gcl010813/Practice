package com.xiaoGuo.community.service.impl;

import com.xiaoGuo.community.dao.CommunityDao;
import com.xiaoGuo.community.dao.impl.CommunityDaoImpl;
import com.xiaoGuo.community.pojo.Community;
import com.xiaoGuo.community.service.CommunityService;
import com.xiaoGuo.community.utils.PageUtil;

import java.util.List;

public class CommunityServiceImpl implements CommunityService {

    CommunityDao communityDao = new CommunityDaoImpl();

    @Override
    public boolean addCommunity(Community community) {
        return communityDao.insertCommunity(community);
    }

    @Override
    public boolean removeCommunity(int id) {
        return communityDao.deleteCommunity(id);
    }

    @Override
    public boolean updateCommunity(Community community) {
        return communityDao.updateCommunity(community);
    }

    @Override
    public Community queryCommunityById(int id) {
        return communityDao.queryCommunityById(id);
    }

    @Override
    public List<Community> queryAll() {
        return communityDao.queryAllCommunity();
    }

    @Override
    public PageUtil queryAllByPage(PageUtil pageUtil) {
        //获取全部数据
        List<Community> list = communityDao.queryAllCommunity();
        //将数据的总条数封装到分页对象中
        pageUtil.setDataCount(list.size());
        //计算总页数 = (总条数+每页显示的条数 -1)/每页显示的条数
        int totalPages = (pageUtil.getDataCount() + pageUtil.getPageSize() - 1) / pageUtil.getPageSize();
        pageUtil.setTotalPages(totalPages);
        //计算开始下标
        int beginIndex = (pageUtil.getPageNumber() - 1) * pageUtil.getPageSize();
        pageUtil.setBeginIndex(beginIndex);
        //根据分页的开始下标和每页显示的条数进行查询对应页的数据
        List<Community> communityList = communityDao.queryAllCommunityByPage(pageUtil);
        //将查询的数据封装到对应的工具类中
        pageUtil.setList(communityList);
        return pageUtil;
    }

    @Override
    public List<Community> queryAllName() {
        return communityDao.queryAllName();
    }

    @Override
    public List<Community> querySearch(Community community) {
        return communityDao.querySearch(community);
    }
}
