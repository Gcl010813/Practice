/**
 * author: xiaoGuo
 * Date: 2023-07-26 16:47:33
 */
package com.xiaoGuo.Student.dao;

import com.xiaoGuo.Student.pojo.Student;

import java.util.List;

public interface StudentDao {
    public boolean insertStudent(Student student);
    public boolean deleteStudent(int id);
    public boolean updateStudent(Student student);
    public Student querySelectById(int id);

    public List<Student> querySelectByNickNameAndNameAndMobile(Student student);
    public List<Student> querySelectAll();
}
