package com.xiaoGuo.community.dao;

import com.xiaoGuo.community.pojo.SafeLog;
import com.xiaoGuo.community.utils.PageUtil;

import java.util.List;

public interface SafeLogDao {
    public boolean insertSafeLog(SafeLog safeLog);

    public boolean deleteSafeLog(int id);

    public boolean updateSafeLog(SafeLog safeLog);

    public SafeLog querySafeLogById(int id);

    public List<SafeLog> queryAllSafeLog();

    public List<SafeLog> queryAllByPage(PageUtil pageUtil);

    public List<SafeLog> queryByOwnName(String ownName);

    public List<SafeLog> queryBySafePersonName(String safeName);
}
