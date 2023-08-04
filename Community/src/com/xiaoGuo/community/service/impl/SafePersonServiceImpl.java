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
        //��ȡȫ������
        List<SafePerson> list = safePersonDao.queryAllSafePerson();
        //�����ݵ���������װ����ҳ������
        pageUtil.setDataCount(list.size());
        //������ҳ�� = (������+ÿҳ��ʾ������ -1)/ÿҳ��ʾ������
        int totalPages = (pageUtil.getDataCount() + pageUtil.getPageSize() - 1) / pageUtil.getPageSize();
        pageUtil.setTotalPages(totalPages);
        //���㿪ʼ�±�
        int beginIndex = (pageUtil.getPageNumber() - 1) * pageUtil.getPageSize();
        pageUtil.setBeginIndex(beginIndex);
        //���ݷ�ҳ�Ŀ�ʼ�±��ÿҳ��ʾ���������в�ѯ��Ӧҳ������
        List<SafePerson> safePersonList = safePersonDao.queryAllSafePersonByPage(pageUtil);
        //����ѯ�����ݷ�װ����Ӧ�Ĺ�������
        pageUtil.setList(safePersonList);
        return pageUtil;
    }

    @Override
    public List<SafePerson> queryAllName() {
        return safePersonDao.queryAllName();
    }
}
