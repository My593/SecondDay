package com.lanou.crm.staff.action;

import com.lanou.crm.base.BaseAction;
import com.lanou.crm.staff.domain.Staff;
import com.lanou.crm.staff.service.StaffService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dllo on 17/11/10.
 */
@Controller("staffAction")
@Scope("prototype")
public class StaffAction extends BaseAction<Staff, StaffService>  {

    private String loginName;
    private String loginPwd;

    @Resource
    private StaffService service;

    private Staff staff = getModel();

    public String login() {

        List<Staff> all = service.findAll();
        for (Staff staff1 : all) {
            if (staff1.getLoginName().equals(staff.getLoginName()) && staff1.getLoginPwd().equals(staff.getLoginPwd())) {
                return SUCCESS;
            }
            break;
        }

        return INPUT;
    }




    @Override
    public void validate() {
        super.validate();
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }
}
