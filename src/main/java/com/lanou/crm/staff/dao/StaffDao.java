package com.lanou.crm.staff.dao;

import com.lanou.crm.base.BaseDao;
import com.lanou.crm.staff.domain.Staff;

import java.io.Serializable;
import java.util.List;

/**
 * Created by dllo on 17/11/10.
 */
public interface StaffDao extends BaseDao<Staff>{


    @Override
    boolean delete(Staff staff);

    @Override
    boolean save(Staff staff);

    @Override
    boolean saveOrUpdate(Staff staff);

    @Override
    boolean update(Staff staff);

    @Override
    int getTotalrecord(String condition, Object[] params);

    @Override
    List<Staff> findAll();



    @Override
    List<Staff> findAll(String condition, Object... params);

    @Override
    Staff findById(Serializable id);
}
