package com.xiaoGuo.Student.service;

import com.xiaoGuo.Student.pojo.Student;

import java.util.List;

public interface StudentServiceDao {
    public boolean addStudent(Student student);
    public boolean deleteStudent(int id);
    public boolean updateStudent(Student student);
    public Student selectById(int id);
    public List<Student> selectByNickNameAndNameAndMobile(Student student);
    public List<Student> selectAll();
}
