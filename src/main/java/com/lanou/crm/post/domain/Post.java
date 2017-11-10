package com.lanou.crm.post.domain;

import com.lanou.crm.department.domain.Department;
import com.lanou.crm.staff.domain.Staff;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by dllo on 17/11/10.
 */
public class Post {

    private String postId,postName;

    private Department dept;
    private Set<Staff> staffs = new HashSet<>();

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    public Set<Staff> getStaffs() {
        return staffs;
    }

    public void setStaffs(Set<Staff> staffs) {
        this.staffs = staffs;
    }
}
