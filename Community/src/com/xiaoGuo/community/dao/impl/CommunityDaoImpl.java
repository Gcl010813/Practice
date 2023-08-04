package com.xiaoGuo.community.dao.impl;

import com.xiaoGuo.community.dao.CommunityDao;
import com.xiaoGuo.community.pojo.Community;
import com.xiaoGuo.community.utils.JDBCUtil;
import com.xiaoGuo.community.utils.PageUtil;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class CommunityDaoImpl implements CommunityDao {
    JdbcTemplate jdbcTemplate= JDBCUtil.getJdbcTemplate();
    @Override
    public boolean insertCommunity(Community community) {
        String sql="insert into t_community(com_name, com_type, safe_person, createTime, updateTime) values(?,?,?,?,?)";
        return jdbcTemplate.update(sql,community.getComName(),community.getComType(),community.getSafePerson(),community.getCreateTime(),community.getUpdateTime())>0;
    }

    @Override
    public boolean deleteCommunity(int id) {
        String sql="delete from t_community where id=?";
        return jdbcTemplate.update(sql,id)>0;
    }

    @Override
    public boolean updateCommunity(Community community) {
        String sql="update t_community set com_name=?,com_type=?,safe_person=?,updateTime=?where id=?";
        return jdbcTemplate.update(sql,community.getComName(),community.getComType(),community.getSafePerson(),community.getUpdateTime(),community.getId())>0;
    }

    @Override
    public Community queryCommunityById(int id) {
        String sql="select id, com_name, com_type, safe_person, createTime, updateTime from t_community where id=?";
        List<Community> communityList=jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Community.class),id);
        return communityList.isEmpty()?null:communityList.get(0);
    }

    @Override
    public List<Community> queryAllCommunity() {
        String sql="select id, com_name, com_type, safe_person, createTime, updateTime from t_community";
        List<Community> communityList=jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Community.class));
        return communityList;
    }

    @Override
    public List<Community> queryAllCommunityByPage(PageUtil pageUtil) {
        String sql="select id, com_name, com_type, safe_person, createTime, updateTime from t_community limit ?,?";
        List<Community> communityList=jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Community.class),pageUtil.getBeginIndex(),pageUtil.getPageSize());
        return communityList;
    }

    @Override
    public List<Community> queryAllName() {
        String sql="select distinct com_name from t_community";
        List<Community> communityNameList=jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Community.class));
        return communityNameList;
    }

    @Override
    public List<Community> querySearch(Community community) {
        String sql="select id, com_name, com_type, safe_person, createTime, updateTime from t_community where id=? and com_name=? and com_type=?";
        List<Community> communityList=jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Community.class),community.getId(),community.getComName(),community.getComType());
        return communityList;
    }
}