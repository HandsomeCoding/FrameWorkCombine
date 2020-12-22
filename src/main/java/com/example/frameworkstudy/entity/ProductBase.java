package com.example.frameworkstudy.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import io.swagger.annotations.ApiModelProperty;


/**
 * <p>
 * 产品表
 * </p>
 *
 * @author Caratacus
 */
@TableName("product_base")
public class ProductBase extends BaseEntity {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "产品名称")
    private String productName;
    @ApiModelProperty(value = "产品英文名称")
    private String englishName;
    @ApiModelProperty(value = "大类编码")
    private String categoryOne;
    @ApiModelProperty(value = "小类编码")
    private String categoryTwo;
    @ApiModelProperty(value = "产品描述")
    private String productDesc;
    @ApiModelProperty(value = "产品状态")
    private String productStatus;
    @ApiModelProperty(value = "删除状态")
    private String deleteStatus;

    public String getProductName(){
        return this.productName;
    }
    public void setProductName(String productName){
        this.productName = productName;
    }
    public String getEnglishName(){
        return this.englishName;
    }
    public void setEnglishName(String englishName){
        this.englishName = englishName;
    }
    public String getCategoryOne(){
        return this.categoryOne;
    }
    public void setCategoryOne(String categoryOne){
        this.categoryOne = categoryOne;
    }
    public String getCategoryTwo(){
        return this.categoryTwo;
    }
    public void setCategoryTwo(String categoryTwo){
        this.categoryTwo = categoryTwo;
    }
    public String getProductDesc(){
        return this.productDesc;
    }
    public void setProductDesc(String productDesc){
        this.productDesc = productDesc;
    }
    public String getProductStatus(){
        return this.productStatus;
    }
    public void setProductStatus(String productStatus){
        this.productStatus = productStatus;
    }
    public String getDeleteStatus(){
        return this.deleteStatus;
    }
    public void setDeleteStatus(String deleteStatus){
        this.deleteStatus = deleteStatus;
    }
}
