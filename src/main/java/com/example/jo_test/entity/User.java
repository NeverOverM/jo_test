package com.example.jo_test.entity;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (User)表实体类
 *
 * @author makejava
 * @since 2025-04-02 22:36:10
 */
@Data
@ApiModel("")
public class User implements Serializable {
    private static final long serialVersionUID = -19685011909830296L;

    @ApiModelProperty("用户名")
    private String username;

    @ApiModelProperty("密码")
    private String password;

    @ApiModelProperty("手机号")
    private String phone;

    @ApiModelProperty("录入时间")
    private Date createTime;

    @ApiModelProperty("用户编号")
    private Integer userId;

}

