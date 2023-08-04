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
        //��ȡȫ������
        List<SafeLog> list = safeLogDao.queryAllSafeLog();
        //�����ݵ���������װ����ҳ������
        pageUtil.setDataCount(list.size());
        //������ҳ�� = (������+ÿҳ��ʾ������ -1)/ÿҳ��ʾ������
        int totalPages = (pageUtil.getDataCount() + pageUtil.getPageSize() - 1) / pageUtil.getPageSize();
        pageUtil.setTotalPages(totalPages);
        //���㿪ʼ�±�
        int beginIndex = (pageUtil.getPageNumber() - 1) * pageUtil.getPageSize();
        pageUtil.setBeginIndex(beginIndex);
        //���ݷ�ҳ�Ŀ�ʼ�±��ÿҳ��ʾ���������в�ѯ��Ӧҳ������
        List<SafeLog> safeLogList = safeLogDao.queryAllByPage(pageUtil);
        //����ѯ�����ݷ�װ����Ӧ�Ĺ�������
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
