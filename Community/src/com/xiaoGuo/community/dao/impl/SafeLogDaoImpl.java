package com.xiaoGuo.community.dao.impl;

import com.xiaoGuo.community.dao.SafeLogDao;
import com.xiaoGuo.community.pojo.SafeLog;
import com.xiaoGuo.community.utils.JDBCUtil;
import com.xiaoGuo.community.utils.PageUtil;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class SafeLogDaoImpl implements SafeLogDao {

    JdbcTemplate jdbcTemplate= JDBCUtil.getJdbcTemplate();
    @Override
    public boolean insertSafeLog(SafeLog safeLog) {
        String sql="insert into t_safelog(safe_name, own_name, own_phone, com_address, house_number, notes, own_signature, is_pass, safeTime) values (?,?,?,?,?,?,?,?,?)";
        return jdbcTemplate.update(sql,safeLog.getSafeName(),safeLog.getOwnName(),safeLog.getOwnPhone(),safeLog.getComAddress(),safeLog.getHouseNumber(),safeLog.getNotes(),safeLog.getOwnSignature(),safeLog.getIsPass(),safeLog.getSafeTime())>0;
    }

    @Override
    public boolean deleteSafeLog(int id) {
        String sql="delete from t_safelog where id=?";
        return jdbcTemplate.update(sql,id)>0;
    }

    @Override
    public boolean updateSafeLog(SafeLog safeLog) {
        String sql="update t_safelog set safe_name=?,own_name=?,own_phone=?,com_address=?,house_number=?,notes=?,own_signature=?,is_pass=?,safeTime=? where id=?";
        return jdbcTemplate.update(sql,safeLog.getSafeName(),safeLog.getOwnName(),safeLog.getOwnPhone(),safeLog.getComAddress(),safeLog.getHouseNumber(),safeLog.getNotes(),safeLog.getOwnSignature(),safeLog.getIsPass(),safeLog.getSafeTime(),safeLog.getId())>0;
    }

    @Override
    public SafeLog querySafeLogById(int id) {
        String sql="select id, safe_name, own_name, own_phone, com_address, house_number, notes, own_signature, is_pass, safeTime from t_safelog where id=?";
        List<SafeLog> safeLogList=jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(SafeLog.class),id);
        return safeLogList.isEmpty()?null:safeLogList.get(0);
    }

    @Override
    public List<SafeLog> queryAllSafeLog() {
        String sql="select id, safe_name, own_name, own_phone, com_address, house_number, notes, own_signature, is_pass, safeTime from t_safelog";
        List<SafeLog> safeLogList=jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(SafeLog.class));
        return safeLogList;
    }

    @Override
    public List<SafeLog> queryAllByPage(PageUtil pageUtil) {
        String sql="select id, safe_name, own_name, own_phone, com_address, house_number, notes, own_signature, is_pass, safeTime from t_safelog limit ?,?";
        List<SafeLog> safeLogList=jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(SafeLog.class),pageUtil.getBeginIndex(),pageUtil.getPageSize());
        return safeLogList;
    }

    @Override
    public List<SafeLog> queryByOwnName(String ownName) {
        String sql="select id, safe_name, own_name, own_phone, com_address, house_number, notes, own_signature, is_pass, safeTime from t_safelog where own_name=?";
        List<SafeLog> safeLogByOwnNameList=jdbcTemplate.query(sql,new Object[]{ownName},new BeanPropertyRowMapper<>(SafeLog.class));
        return safeLogByOwnNameList;
    }

    @Override
    public List<SafeLog> queryBySafePersonName(String safeName) {
        String sql="select id, safe_name, own_name, own_phone, com_address, house_number, notes, own_signature, is_pass, safeTime from t_safelog where safe_name=?";
        List<SafeLog> safeLogBySafePersonNameList=jdbcTemplate.query(sql,new Object[]{safeName},new BeanPropertyRowMapper<>(SafeLog.class));
        return safeLogBySafePersonNameList;
    }
}
