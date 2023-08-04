package com.xiaoGuo.community.dao;

import com.xiaoGuo.community.pojo.SafePerson;
import com.xiaoGuo.community.utils.PageUtil;

import java.util.List;

public interface SafePersonDao {
        public boolean insertSafePerson(SafePerson safePerson);
        public boolean deleteSafePerson(int id);
        public boolean updateSafePerson(SafePerson safePerson);
        public SafePerson querySafePersonById(int id);
        public List<SafePerson> queryAllSafePerson();
        public List<SafePerson> queryAllSafePersonByPage(PageUtil pageUtil);
        public List<SafePerson> queryAllName();
}
