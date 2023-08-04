/**
 * author: xiaoGuo
 * Date: 2023-07-26 16:54:39
 */
package com.xiaoGuo.Student.dao.impl;

import com.xiaoGuo.Student.dao.StudentDao;
import com.xiaoGuo.Student.pojo.Student;
import com.xiaoGuo.Student.utils.JDBCUtil;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
public class StudentDaoImpl implements StudentDao {
    JdbcTemplate jdbcTemplate = JDBCUtil.getJdbcTemplate();

    @Override
    public boolean insertStudent(Student student) {
        String sql="insert into t_student(nickName, name, mobile, gender, balance, status, createTime) values (?,?,?,?,?,?,?)";
        return jdbcTemplate.update(sql,student.getNickName(),student.getName(),student.getMobile(),student.getGender(),student.getBalance(),student.getStatus(),student.getCreateTime())>0;
    }

    @Override
    public boolean deleteStudent(int id) {
        String sql="delete from t_student where id=?";
        return jdbcTemplate.update(sql,id)>0;
    }

    @Override
    public boolean updateStudent(Student student) {
        String sql="update t_student set nickName=?,name=?,mobile=?,gender=?,balance=?,status=?,createTime=? where id=?";
        return jdbcTemplate.update(sql,student.getNickName(),student.getName(),student.getMobile(),student.getGender(),student.getBalance(),student.getStatus(),student.getCreateTime(),student.getId())>0;
    }

    @Override
    public Student querySelectById(int id) {
        String sql="select id, nickName, name, mobile, gender, balance, status, createTime from t_student where id=?";
        List<Student> studentList= jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Student.class),id);
        return studentList.isEmpty()?null:studentList.get(0);
    }

    @Override
    public List<Student> querySelectByNickNameAndNameAndMobile(Student student) {
        String sql="select id, nickName, name, mobile, gender, balance, status, createTime from t_student where nickName like '%"+student.getNickName()+"%' or name like '%"+student.getName()+"%' or mobile like '%"+student.getMobile()+"%'";
        List<Student> studentList=jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Student.class));
        return studentList;
    }

    @Override
    public List<Student> querySelectAll() {
        String sql="select id, nickName, name, mobile, gender, balance, status, createTime from t_student";
        List<Student> studentList= jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Student.class));
        return studentList;
    }
}
