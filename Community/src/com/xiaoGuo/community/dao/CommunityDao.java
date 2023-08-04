package com.xiaoGuo.community.dao;

import com.xiaoGuo.community.pojo.Community;
import com.xiaoGuo.community.utils.PageUtil;

import java.util.List;

public interface CommunityDao {
    public boolean insertCommunity(Community community);
    public boolean deleteCommunity(int id);
    public boolean updateCommunity(Community community);
    public Community queryCommunityById(int id);
    public List<Community> queryAllCommunity();
    public List<Community> queryAllCommunityByPage(PageUtil pageUtil);
    public List<Community> queryAllName();
    public List<Community> querySearch(Community community);
}
