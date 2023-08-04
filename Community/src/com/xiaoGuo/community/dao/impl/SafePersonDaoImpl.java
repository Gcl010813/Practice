package com.xiaoGuo.community.dao.impl;

import com.xiaoGuo.community.dao.SafePersonDao;
import com.xiaoGuo.community.pojo.SafePerson;
import com.xiaoGuo.community.utils.JDBCUtil;
import com.xiaoGuo.community.utils.PageUtil;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class SafePersonDaoImpl implements SafePersonDao {
    JdbcTemplate jdbcTemplate=JDBCUtil.getJdbcTemplate();
    @Override
    public boolean insertSafePerson(SafePerson safePerson) {
        String sql="insert into t_safeperson(safe_nick, safe_name, safe_phone, createTime, updateTime, status) values (?,?,?,?,?,?)";
        return jdbcTemplate.update(sql,safePerson.getSafeNick(),safePerson.getSafeName(),safePerson.getSafePhone(),safePerson.getCreateTime(),safePerson.getUpdateTime(),safePerson.getStatus())>0;
    }

    @Override
    public boolean deleteSafePerson(int id) {
        String sql="delete from t_safeperson where id=?";
        return jdbcTemplate.update(sql,id)>0;
    }

    @Override
    public boolean updateSafePerson(SafePerson safePerson) {
        String sql="update t_safeperson set safe_nick=?,safe_name=?,safe_phone=?,updateTime=?,status=? where id=?";
        return jdbcTemplate.update(sql,safePerson.getSafeNick(),safePerson.getSafeName(),safePerson.getSafePhone(),safePerson.getUpdateTime(),safePerson.getStatus(),safePerson.getId())>0;
    }

    @Override
    public SafePerson querySafePersonById(int id) {
        String sql="select id, safe_nick, safe_name, safe_phone, createTime, updateTime, status from t_safeperson where id=?";
        List<SafePerson> safePersonList=jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(SafePerson.class),id);
        return safePersonList.isEmpty()?null:safePersonList.get(0);
    }

    @Override
    public List<SafePerson> queryAllSafePerson() {
        String sql="select id, safe_nick, safe_name, safe_phone, createTime, updateTime, status from t_safeperson";
        List<SafePerson> safePersonList=jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(SafePerson.class));
        return safePersonList;
    }

    @Override
    public List<SafePerson> queryAllSafePersonByPage(PageUtil pageUtil) {
        String sql="select id, safe_nick, safe_name, safe_phone, createTime, updateTime, status from t_safeperson limit ?,?";
        List<SafePerson> safePersonList=jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(SafePerson.class),pageUtil.getBeginIndex(),pageUtil.getPageSize());
        return safePersonList;
    }

    @Override
    public List<SafePerson> queryAllName() {
        String sql="select distinct safe_name from t_safeperson";
        List<SafePerson> safePersonNameList=jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(SafePerson.class));
        return safePersonNameList;
    }
}
