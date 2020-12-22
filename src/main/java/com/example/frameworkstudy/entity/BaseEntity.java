package com.example.frameworkstudy.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.store.tianmao.util.convert.Convert;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

public class BaseEntity extends Convert implements Serializable {

        @ApiModelProperty("主键ID")
        @TableId( type= IdType.INPUT)
        protected Long id;
        @ApiModelProperty("创建时间")
        protected Date createTime;
        @ApiModelProperty("创建人")
        protected Long createUser;
        @ApiModelProperty("创建人名称")
        protected String createUserName;
        @ApiModelProperty("修改时间")
        protected Date updateTime;
        @ApiModelProperty("修改人")
        protected Long updateUser;
        @ApiModelProperty("修改人名称")
        protected String updateUserName;

        public Long getId() {
        return id;
    }

        public void setId(Long id) {
        this.id = id;
    }

        public Date getCreateTime() {
        return createTime;
    }

        public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

        public Long getCreateUser() {
        return createUser;
    }

        public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

        public String getCreateUserName() {
        return createUserName;
    }

        public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

        public Date getUpdateTime() {
        return updateTime;
    }

        public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

        public Long getUpdateUser() {
        return updateUser;
    }

        public void setUpdateUser(Long updateUser) {
        this.updateUser = updateUser;
    }

        public String getUpdateUserName() {
        return updateUserName;
    }

        public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName;
    }
    }

