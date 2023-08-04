package com.xiaoGuo.community.service;

import com.xiaoGuo.community.pojo.SafeLog;
import com.xiaoGuo.community.utils.PageUtil;

import java.util.List;

public interface SafeLogService {
    public boolean addSafeLog(SafeLog safeLog);
    public boolean removeSafeLog(int id);
    public boolean updateSafeLog(SafeLog safeLog);
    public SafeLog querySafeLogById(int id);
    public List<SafeLog> queryAll();
    public PageUtil<SafeLog> queryAllByPage(PageUtil pageUtil);
    public List<SafeLog> queryByOwnName(String ownName);
    public List<SafeLog> queryBySafePersonName(String safeName);
}
