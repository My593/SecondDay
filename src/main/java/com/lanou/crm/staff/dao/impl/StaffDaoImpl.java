package com.lanou.crm.staff.dao.impl;

import com.lanou.crm.staff.dao.StaffDao;
import com.lanou.crm.staff.domain.Staff;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * Created by dllo on 17/11/10.
 */
@Repository("staffDao")
public class StaffDaoImpl extends HibernateDaoSupport implements StaffDao {


    @Override
    public boolean save(Staff staff) {
        getHibernateTemplate().save(staff);
        return false;
    }

    @Override
    public boolean update(Staff staff) {
        return false;
    }

    @Override
    public boolean delete(Staff staff) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(Staff staff) {
        return false;
    }

    @Override
    public Staff findById(Serializable id) {
        return null;
    }

    @Override
    public List<Staff> findAll() {
        List<Staff> list = (List<Staff>) getHibernateTemplate().find("from Staff crm_staff");

        return list;
    }

    @Override
    public List<Staff> findAll(String condition, Object... params) {
        return null;
    }

    @Override
    public int getTotalrecord(String condition, Object[] params) {
        return 0;
    }
}
