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
        //��ȡȫ������
        List<Community> list = communityDao.queryAllCommunity();
        //�����ݵ���������װ����ҳ������
        pageUtil.setDataCount(list.size());
        //������ҳ�� = (������+ÿҳ��ʾ������ -1)/ÿҳ��ʾ������
        int totalPages = (pageUtil.getDataCount() + pageUtil.getPageSize() - 1) / pageUtil.getPageSize();
        pageUtil.setTotalPages(totalPages);
        //���㿪ʼ�±�
        int beginIndex = (pageUtil.getPageNumber() - 1) * pageUtil.getPageSize();
        pageUtil.setBeginIndex(beginIndex);
        //���ݷ�ҳ�Ŀ�ʼ�±��ÿҳ��ʾ���������в�ѯ��Ӧҳ������
        List<Community> communityList = communityDao.queryAllCommunityByPage(pageUtil);
        //����ѯ�����ݷ�װ����Ӧ�Ĺ�������
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
