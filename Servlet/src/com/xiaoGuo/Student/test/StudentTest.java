/**
 * author: xiaoGuo
 * Date: 2023-07-26 17:44:16
 */
package com.xiaoGuo.Student.test;

import com.xiaoGuo.Student.pojo.Student;
import com.xiaoGuo.Student.service.StudentServiceDao;
import com.xiaoGuo.Student.service.impl.StudentServiceDaoImpl;

import java.util.Date;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        StudentServiceDao studentServiceDao = new StudentServiceDaoImpl();
//        studentServiceDao.addStudent(new Student("1","1","2",1,10.11,1,new Date()));

//        studentServiceDao.deleteStudent(1008);

//        List<Student> studentList=studentServiceDao.selectAll();
//        for (Student s:studentList) {
//            System.out.println(s);
//        }

//        System.out.println(studentServiceDao.selectById(1017));

        List<Student> studentList=new StudentServiceDaoImpl().selectByNickNameAndNameAndMobile(new Student("小","孙","15"));
        System.out.println(studentList);
    }
}
