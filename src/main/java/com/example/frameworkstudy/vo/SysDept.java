package com.example.frameworkstudy.vo;

import java.io.Serializable;
import java.util.List;

/**
 * sys_dept
 * @author 
 */
public class SysDept implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 部门名
     */
    private String name;

    /**
     * 备注
     */
    private String remark;

    /**
     * 路径，以id为拼接点，以/上级id/id 为格式拼接
     */
    private String path;

    /**
     * 父ID
     */
    private Integer pid;

    public List<SysDept> getChild() {
        return child;
    }

    public void setChild(List<SysDept> child) {
        this.child = child;
    }

    private List<SysDept> child;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public SysDept(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public SysDept() {
    }
}