package com.xiaoGuo.community.test;

import com.xiaoGuo.community.pojo.SafePerson;
import com.xiaoGuo.community.service.SafePersonService;
import com.xiaoGuo.community.service.impl.SafePersonServiceImpl;

import java.util.Date;
import java.util.List;

public class SafePersonTest {
    public static void main(String[] args) {
        SafePersonService safePersonService=new SafePersonServiceImpl();

//        safePersonService.addSafePerson(new SafePerson("xiaoguo","小郭","17550228932",new Date(),new Date(),1));
//        safePersonService.addSafePerson(new SafePerson());

//        safePersonService.removeSafePerson(7);

//        safePersonService.updateSafePerson(new SafePerson(6,"daguo","大郭","17550228932",new Date(),new Date(),1));

        System.out.println(safePersonService.querySafePersonById(6));
//        List<SafePerson> safePersonList=safePersonService.queryAll();
//        for (SafePerson s:safePersonList) {
//            System.out.println(s);
//        }
    }
}
