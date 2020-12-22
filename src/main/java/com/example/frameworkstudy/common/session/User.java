package com.example.frameworkstudy.common.session;



import com.store.tianmao.vo.SysDept;
import com.store.tianmao.vo.SysUserLoginVo;

import java.util.List;

/**
 * session信息
 *
 * @author PC043
 */
public class User {
    private Long userId;

    private SysUserLoginVo sysUserLoginVo;

    /**
     * 工号
     */
    private String workNo;

    /**
     * 姓名
     */
    private String name;

    /**
     * 公司ID
     */
    private Long companyId;

    /**
     * 公司
     */
    private String companyName;
    /**
     * 头像
     */
    private String head;
    /**
     * 部门
     */
    private List<SysDept> depts;

    public List<SysDept> getDepts() {
        return depts;
    }

    public void setDepts(List<SysDept> depts) {
        this.depts = depts;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getWorkNo() {
        return workNo;
    }

    public void setWorkNo(String workNo) {
        this.workNo = workNo;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public SysUserLoginVo getSysUserLoginVo() {
        return sysUserLoginVo;
    }

    public void setSysUserLoginVo(SysUserLoginVo sysUserLoginVo) {
        this.sysUserLoginVo = sysUserLoginVo;
    }

    public User(Long userId) {
        this.userId = userId;
    }

    public User() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }
}
