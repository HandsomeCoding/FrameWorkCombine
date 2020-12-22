package com.example.frameworkstudy.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotBlank;


import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * @ClassName platform
 * @Deacription
 * @Author lyn
 * @Date 14:15 2020/9/28
 **/
@ApiModel(description = "用户登录信息返回参数")
public class SysUserLoginReturnVo {

    @ApiModelProperty("主键")
    private Long id;

    /**
     * 姓名
     */
    @NotBlank(message = "姓名不能为空")
    @Size(max = 10,message = "姓名长度在1到10之间")
    @ApiModelProperty("姓名")
    private String name;

    /**
     * 电话号码
     */
    @ApiModelProperty("电话号码")
    private String telNo;

    /**
     * 电子邮件
     */
    @NotBlank(message = "邮箱不能为空")
    @Email(message = "非法邮箱",regexp = "^[A-Za-z0-9\\u4e00-\\u9fa5]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$")
    @ApiModelProperty("电子邮件")
    private String email;

    /**
     * 公司ID
     */
    @ApiModelProperty("公司ID")
    private Long companyId;

    /**
     * 公司
     */
    @ApiModelProperty("公司")
    private String companyName;

    /**
     * 职位
     */
    @ApiModelProperty("职位")
    private String postion;

    /**
     * 办公地点
     */
    @ApiModelProperty("办公地点")
    private String office;

    /**
     * 工号，也作为账号
     */
    @NotBlank(message = "工号不能为空")
    @ApiModelProperty("工号，也作为账号")
    private String workNo;

    /**
     * 删除标志，0表示不删除，1表示删除
     */
    @ApiModelProperty("删除标志，0表示不删除，1表示删除")
    private Byte isDelete;

    /**
     * 文件夹名‘logo’，文件名为工号
     */
    @ApiModelProperty("文件夹名‘logo’，文件名为工号")
    private String logo;

    /**
     * 用户的部门信息
     */
    @ApiModelProperty("用户的部门信息")
    private List<SysDept> sysDeptList;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getPostion() {
        return postion;
    }

    public void setPostion(String postion) {
        this.postion = postion;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getWorkNo() {
        return workNo;
    }

    public void setWorkNo(String workNo) {
        this.workNo = workNo;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public List<SysDept> getSysDeptList() {
        return sysDeptList;
    }

    public void setSysDeptList(List<SysDept> sysDeptList) {
        this.sysDeptList = sysDeptList;
    }
}
