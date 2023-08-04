/**
 * author: xiaoGuo
 * Date: 2023-07-26 16:59:06
 */
package com.xiaoGuo.Student.service.impl;

import com.xiaoGuo.Student.dao.StudentDao;
import com.xiaoGuo.Student.dao.impl.StudentDaoImpl;
import com.xiaoGuo.Student.pojo.Student;
import com.xiaoGuo.Student.service.StudentServiceDao;

import java.util.List;

public class StudentServiceDaoImpl implements StudentServiceDao {
    StudentDao studentDao=new StudentDaoImpl();
    @Override
    public boolean addStudent(Student student) {
        return studentDao.insertStudent(student);
    }
    @Override
    public boolean deleteStudent(int id) {
        return studentDao.deleteStudent(id);
    }

    @Override
    public boolean updateStudent(Student student) {
        return studentDao.updateStudent(student);
    }

    @Override
    public Student selectById(int id) {
        return studentDao.querySelectById(id);
    }

    @Override
    public List<Student> selectByNickNameAndNameAndMobile(Student student) {
        return studentDao.querySelectByNickNameAndNameAndMobile(student);
    }

    @Override
    public List<Student> selectAll() {
        return studentDao.querySelectAll();
    }
}
