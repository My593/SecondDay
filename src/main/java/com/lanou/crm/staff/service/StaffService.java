package com.lanou.crm.staff.service;

import com.lanou.crm.base.BaseDao;
import com.lanou.crm.staff.domain.Staff;

import java.io.Serializable;
import java.util.List;

/**
 * Created by dllo on 17/11/10.
 */
public interface StaffService extends BaseDao  {
    @Override
    public boolean save(Object o);

    @Override
    public boolean update(Object o);

    @Override
    public boolean delete(Object o);

    @Override
    public boolean saveOrUpdate(Object o);

    @Override
    public Object findById(Serializable id);

    @Override
    public List<Staff> findAll();

    @Override
    public List<Staff> findAll(String condition, Object... params);

    @Override
    public int getTotalrecord(String condition, Object[] params);


}
