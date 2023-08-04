package com.xiaoGuo.community.service;

import com.xiaoGuo.community.pojo.SafePerson;
import com.xiaoGuo.community.utils.PageUtil;

import java.util.List;

public interface SafePersonService {
    public boolean addSafePerson(SafePerson safePerson);
    public boolean removeSafePerson(int id);
    public boolean updateSafePerson(SafePerson safePerson);
    public SafePerson querySafePersonById(int id);
    public List<SafePerson> queryAll();

    public PageUtil<SafePerson> queryAllByPage(PageUtil pageUtil);
    public List<SafePerson> queryAllName();
}
