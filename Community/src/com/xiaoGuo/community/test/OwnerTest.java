package com.xiaoGuo.community.test;

import com.xiaoGuo.community.pojo.Owner;
import com.xiaoGuo.community.service.OwnerService;
import com.xiaoGuo.community.service.impl.OwnerServiceImpl;

import java.util.Date;
import java.util.List;

public class OwnerTest {
    public static void main(String[] args) {
        OwnerService ownerService=new OwnerServiceImpl();

//        ownerService.addOwner(new Owner("小郭","17550228932","牛寨","13-01-1104",5,1,1,1,0,"notes",new Date(),new Date()));
//        ownerService.addOwner(new Owner());
//        ownerService.removeOwner(40);

//        ownerService.updateOwner(new Owner(39,"小小郭","17550228932","牛寨","13-01-1104",5,1,1,1,0,"notes",new Date(),new Date()));
//        System.out.println(ownerService.queryOwnerById(39));

        List<Owner> ownerList=ownerService.queryAll();
        for (Owner o:ownerList) {
            System.out.println(o);
        }
    }
}
