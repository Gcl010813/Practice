package com.xiaoGuo.community.dao;

import com.xiaoGuo.community.pojo.Owner;
import com.xiaoGuo.community.utils.PageUtil;

import java.util.List;

public interface OwnerDao {
    public boolean insertOwner(Owner owner);
    public boolean deleteOwner(int id);
    public boolean updateOwner(Owner owner);
    public Owner queryOwnerById(int id);
    public List<Owner> queryAllOwner();
    public List<Owner> queryAllOwnerByPage(PageUtil pageUtil);

}
