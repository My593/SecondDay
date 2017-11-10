package com.lanou.crm.staff.service.impl;

import com.lanou.crm.staff.dao.StaffDao;
import com.lanou.crm.staff.service.StaffService;

import java.io.Serializable;
import java.util.List;

/**
 * Created by dllo on 17/11/10.
 */
public class StaffServiceImpl implements StaffService {

    private StaffDao staffDao;

    public StaffDao getStaffDao() {
        return staffDao;
    }

    public void setStaffDao(StaffDao staffDao) {
        this.staffDao = staffDao;
    }


    @Override
    public boolean save(Object o) {
        return false;
    }

    @Override
    public boolean update(Object o) {
        return false;
    }

    @Override
    public boolean delete(Object o) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(Object o) {
        return false;
    }

    @Override
    public Object findById(Serializable id) {
        return null;
    }

    @Override
    public List findAll() {
        return staffDao.findAll();
    }

    @Override
    public List findAll(String condition, Object... params) {
        return null;
    }

    @Override
    public int getTotalrecord(String condition, Object[] params) {
        return 0;
    }


}
