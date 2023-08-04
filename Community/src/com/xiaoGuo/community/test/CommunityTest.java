package com.xiaoGuo.community.test;

import com.xiaoGuo.community.dao.impl.CommunityDaoImpl;
import com.xiaoGuo.community.pojo.Community;
import com.xiaoGuo.community.service.CommunityService;
import com.xiaoGuo.community.service.impl.CommunityServiceImpl;

import java.util.Date;
import java.util.List;

public class CommunityTest {
    public static void main(String[] args) {
        CommunityService  communityService=new CommunityServiceImpl();

//        communityService.addCommunity(new Community("牛寨","住宅","小郭",new Date(),new Date()));
//communityService.addCommunity(new Community());
//communityService.removeCommunity(13);

//        communityService.updateCommunity(new Community(12,"牛寨","住宅","小小郭",new Date(),new Date()));

//        System.out.println(communityService.queryCommunityById(12));


        List<Community> communityList=communityService.querySearch(new Community(0,"一号院","住宅"));
        for (Community c:communityList) {
            System.out.println(c);
        }
    }
}
