package com.xiaoGuo.community.service;

import com.xiaoGuo.community.pojo.Community;
import com.xiaoGuo.community.utils.PageUtil;

import java.util.List;

public interface CommunityService {
    public boolean addCommunity(Community community);
    public boolean removeCommunity(int id);
    public boolean updateCommunity(Community community);
    public Community queryCommunityById(int id);
    public List<Community> queryAll();
    public PageUtil<Community> queryAllByPage(PageUtil pageUtil);
    public List<Community> queryAllName();
    public List<Community> querySearch(Community community);
}
