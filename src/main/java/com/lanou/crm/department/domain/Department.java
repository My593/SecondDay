package com.lanou.crm.department.domain;

import com.lanou.crm.post.domain.Post;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by dllo on 17/11/10.
 */
public class Department {

    private int deptId;
    private String depName;

    private Set<Post> posts = new HashSet<>();


    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public Set<Post> getPosts() {
        return posts;
    }

    public void setPosts(Set<Post> posts) {
        this.posts = posts;
    }
}
