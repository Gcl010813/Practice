package com.xiaoGuo.community.service;

import com.xiaoGuo.community.pojo.Owner;
import com.xiaoGuo.community.utils.PageUtil;

import java.util.List;

public interface OwnerService {
    public boolean addOwner(Owner owner);
    public boolean removeOwner(int id);
    public boolean updateOwner(Owner owner);
    public Owner queryOwnerById(int id);
    public List<Owner> queryAll();
    public PageUtil<Owner> queryAllByPage(PageUtil pageUtil);
}
