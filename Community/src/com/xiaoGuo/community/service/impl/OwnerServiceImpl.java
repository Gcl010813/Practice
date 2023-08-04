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
        //��ȡȫ������
        List<Owner> list = ownerDao.queryAllOwner();
        //�����ݵ���������װ����ҳ������
        pageUtil.setDataCount(list.size());
        //������ҳ�� = (������+ÿҳ��ʾ������ -1)/ÿҳ��ʾ������
        int totalPages = (pageUtil.getDataCount() + pageUtil.getPageSize() - 1) / pageUtil.getPageSize();
        pageUtil.setTotalPages(totalPages);
        //���㿪ʼ�±�
        int beginIndex = (pageUtil.getPageNumber() - 1) * pageUtil.getPageSize();
        pageUtil.setBeginIndex(beginIndex);
        //���ݷ�ҳ�Ŀ�ʼ�±��ÿҳ��ʾ���������в�ѯ��Ӧҳ������
        List<Owner> ownerList = ownerDao.queryAllOwnerByPage(pageUtil);
        //����ѯ�����ݷ�װ����Ӧ�Ĺ�������
        pageUtil.setList(ownerList);
        return pageUtil;
    }
}
