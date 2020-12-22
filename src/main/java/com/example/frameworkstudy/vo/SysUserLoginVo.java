package com.example.frameworkstudy.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;

/**
 * @ClassName platform
 * @Deacription
 * @Author lyn
 * @Date 15:33 2020/9/17
 **/
@ApiModel(description = "用户登录信息入参")
public class SysUserLoginVo {

    /**
     * 工号，也作为账号
     */
    @NotBlank(message = "工号不能为空")
    @ApiModelProperty("工号，也作为账号")
    private String workNo;

    /**
     * 密码
     */
    @ApiModelProperty("密码")
    @NotBlank(message = "密码不能为空")
    private String pwd;

    /**
     * token值
     */
    @ApiModelProperty("token值")
    private Long token;

    /**
     * 用户返回信息
     */
    @ApiModelProperty("用户返回信息")
    private SysUserLoginReturnVo sysUserLoginReturnVo;

    public String getWorkNo() {
        return workNo;
    }

    public void setWorkNo(String workNo) {
        this.workNo = workNo;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Long getToken() {
        return token;
    }

    public void setToken(Long token) {
        this.token = token;
    }

    public SysUserLoginReturnVo getSysUserLoginReturnVo() {
        return sysUserLoginReturnVo;
    }

    public void setSysUserLoginReturnVo(SysUserLoginReturnVo sysUserLoginReturnVo) {
        this.sysUserLoginReturnVo = sysUserLoginReturnVo;
    }

    public SysUserLoginVo() {
    }
}


