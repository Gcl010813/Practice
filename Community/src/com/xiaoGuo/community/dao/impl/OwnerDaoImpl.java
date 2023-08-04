package com.xiaoGuo.community.dao.impl;

import com.xiaoGuo.community.dao.OwnerDao;
import com.xiaoGuo.community.utils.JDBCUtil;
import com.xiaoGuo.community.utils.PageUtil;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import com.xiaoGuo.community.pojo.Owner;
import java.util.List;

public class OwnerDaoImpl implements OwnerDao {
    JdbcTemplate jdbcTemplate= JDBCUtil.getJdbcTemplate();
    @Override
    public boolean insertOwner(Owner owner) {
        String sql="insert into t_owner(own_name, own_phone, com_address, house_number, people_count, is_safe, is_check, house_count, sort, notes, createTime, updateTime) values (?,?,?,?,?,?,?,?,?,?,?,?)";
        return jdbcTemplate.update(sql,owner.getOwnName(),owner.getOwnPhone(),owner.getComAddress(),owner.getHouseNumber(),owner.getPeopleCount(),owner.getIsSafe(),owner.getIsCheck(),owner.getHouseCount(),owner.getSort(),owner.getNotes(),owner.getCreateTime(),owner.getUpdateTime())>0;
    }

    @Override
    public boolean deleteOwner(int id) {
        String sql="delete from t_owner where id=?";
        return jdbcTemplate.update(sql,id)>0;
    }

    @Override
    public boolean updateOwner(Owner owner) {
       String sql="update t_owner set own_name=?,own_phone=?,com_address=?,house_number=?,people_count=?,is_safe=?,is_check=?,house_count=?,sort=?,notes=?,updateTime=? where id=?";
       return jdbcTemplate.update(sql,owner.getOwnName(),owner.getOwnPhone(),owner.getComAddress(),owner.getHouseNumber(),owner.getPeopleCount(),owner.getIsSafe(),owner.getIsCheck(),owner.getHouseCount(),owner.getSort(),owner.getNotes(),owner.getUpdateTime(),owner.getId())>0;
    }

    @Override
    public Owner queryOwnerById(int id) {
        String sql="select id, own_name, own_phone, com_address, house_number, people_count, is_safe, is_check, house_count, sort, notes, createTime, updateTime from t_owner where id=?";
        List<Owner> ownerList=jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Owner.class),id);
        return ownerList.isEmpty()?null:ownerList.get(0);
    }

    @Override
    public List<Owner> queryAllOwner() {
        String sql="select id, own_name, own_phone, com_address, house_number, people_count, is_safe, is_check, house_count, sort, notes, createTime, updateTime from t_owner";
        List<Owner> ownerList=jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Owner.class));
        return ownerList;
    }

    @Override
    public List<Owner> queryAllOwnerByPage(PageUtil pageUtil) {
        String sql="select id, own_name, own_phone, com_address, house_number, people_count, is_safe, is_check, house_count, sort, notes, createTime, updateTime from t_owner limit ?,?";
        List<Owner> ownerList=jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Owner.class),pageUtil.getBeginIndex(),pageUtil.getPageSize());
        return ownerList;
    }
}
