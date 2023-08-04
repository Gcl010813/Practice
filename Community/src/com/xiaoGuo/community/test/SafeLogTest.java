package com.xiaoGuo.community.test;

import com.xiaoGuo.community.pojo.SafeLog;
import com.xiaoGuo.community.service.SafeLogService;
import com.xiaoGuo.community.service.impl.SafeLogServiceImpl;

import java.util.Date;
import java.util.List;

public class SafeLogTest {
    public static void main(String[] args) {
        SafeLogService safeLogService=new SafeLogServiceImpl();

//        safeLogService.addSafeLog(new SafeLog("小郭","小赵","13193","牛寨","13-1-1104","","tupian",1,new Date()));
//safeLogService.addSafeLog(new SafeLog());

//        safeLogService.removeSafeLog(76);

//        safeLogService.updateSafeLog(new SafeLog(75,"小小郭","小小赵","13193","牛寨","13-1-1104","","tupian",1,new Date()));

//        System.out.println(safeLogService.querySafeLogById(10));
        List<SafeLog> safeLogList=safeLogService.queryBySafePersonName("张三");
        System.out.println(safeLogList);
        for (SafeLog s:safeLogList) {
            System.out.println(s);
        }
    }
}
