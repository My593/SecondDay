package com.lanou.crm.staff.dao.impl;

import com.lanou.crm.staff.dao.StaffDao;
import com.lanou.crm.staff.domain.Staff;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by dllo on 17/11/10.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-config.xml")
public class StaffDaoImplTest {

    @Resource
    private StaffDao staffDao;

    @Test
    public void test(){
        Staff staff = new Staff("www","ww","ww","ww","2017-11-11");

        staffDao.save(staff);

    }


}