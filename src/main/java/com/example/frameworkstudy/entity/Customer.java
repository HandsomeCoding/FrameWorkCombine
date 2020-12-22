package com.example.frameworkstudy.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import io.swagger.annotations.ApiModelProperty;


/**
 * <p>
 * 客户表
 * </p>
 *
 * @author Caratacus
 */
@TableName("customer")
public class Customer extends BaseEntity{

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "客户名称")
    private String customerName;
    @ApiModelProperty(value = "客户简称")
    private String shortName;
    @ApiModelProperty(value = "客户总公司")
    private String customerCorporation;
    @ApiModelProperty(value = "所属公司")
    private String theirCompany;
    @ApiModelProperty(value = "客户状态")
    private String customerStatus;
    @ApiModelProperty(value = "客户来源")
    private String customerSource;
    @ApiModelProperty(value = "客户商业类型")
    private String customerBusinessType;
    @ApiModelProperty(value = "客户等级")
    private String customerLevel;
    @ApiModelProperty(value = "人员规模")
    private String staffSize;
    @ApiModelProperty(value = "信用等级")
    private String creditLevel;
    @ApiModelProperty(value = "付款方式")
    private String payType;
    @ApiModelProperty(value = "传真号码")
    private String faxNo;
    @ApiModelProperty(value = "座机号码")
    private String machineNo;
    @ApiModelProperty(value = "网址")
    private String webSite;
    @ApiModelProperty(value = "邮编")
    private String postcode;
    @ApiModelProperty(value = "地址")
    private String address;
    @ApiModelProperty(value = "客户类型")
    private String customerType;
    @ApiModelProperty(value = "质量打分")
    private Integer qualityScore;
    @ApiModelProperty(value = "备注")
    private String remark;
    @ApiModelProperty(value = "数据状态")
    private String deleteStatus;

    public String getCustomerName(){
        return this.customerName;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public String getShortName(){
        return this.shortName;
    }
    public void setShortName(String shortName){
        this.shortName = shortName;
    }
    public String getCustomerCorporation(){
        return this.customerCorporation;
    }
    public void setCustomerCorporation(String customerCorporation){
        this.customerCorporation = customerCorporation;
    }
    public String getTheirCompany(){
        return this.theirCompany;
    }
    public void setTheirCompany(String theirCompany){
        this.theirCompany = theirCompany;
    }
    public String getCustomerStatus(){
        return this.customerStatus;
    }
    public void setCustomerStatus(String customerStatus){
        this.customerStatus = customerStatus;
    }
    public String getCustomerSource(){
        return this.customerSource;
    }
    public void setCustomerSource(String customerSource){
        this.customerSource = customerSource;
    }
    public String getCustomerBusinessType(){
        return this.customerBusinessType;
    }
    public void setCustomerBusinessType(String customerBusinessType){
        this.customerBusinessType = customerBusinessType;
    }
    public String getCustomerLevel(){
        return this.customerLevel;
    }
    public void setCustomerLevel(String customerLevel){
        this.customerLevel = customerLevel;
    }
    public String getStaffSize(){
        return this.staffSize;
    }
    public void setStaffSize(String staffSize){
        this.staffSize = staffSize;
    }
    public String getCreditLevel(){
        return this.creditLevel;
    }
    public void setCreditLevel(String creditLevel){
        this.creditLevel = creditLevel;
    }
    public String getPayType(){
        return this.payType;
    }
    public void setPayType(String payType){
        this.payType = payType;
    }
    public String getFaxNo(){
        return this.faxNo;
    }
    public void setFaxNo(String faxNo){
        this.faxNo = faxNo;
    }
    public String getMachineNo(){
        return this.machineNo;
    }
    public void setMachineNo(String machineNo){
        this.machineNo = machineNo;
    }
    public String getWebSite(){
        return this.webSite;
    }
    public void setWebSite(String webSite){
        this.webSite = webSite;
    }
    public String getPostcode(){
        return this.postcode;
    }
    public void setPostcode(String postcode){
        this.postcode = postcode;
    }
    public String getAddress(){
        return this.address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getCustomerType(){
        return this.customerType;
    }
    public void setCustomerType(String customerType){
        this.customerType = customerType;
    }
    public Integer getQualityScore(){
        return this.qualityScore;
    }
    public void setQualityScore(Integer qualityScore){
        this.qualityScore = qualityScore;
    }
    public String getRemark(){
        return this.remark;
    }
    public void setRemark(String remark){
        this.remark = remark;
    }
    public String getDeleteStatus(){
        return this.deleteStatus;
    }
    public void setDeleteStatus(String deleteStatus){
        this.deleteStatus = deleteStatus;
    }
}
