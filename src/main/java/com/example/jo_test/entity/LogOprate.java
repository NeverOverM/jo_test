package com.example.jo_test.entity;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (LogOprate)表实体类
 *
 * @author makejava
 * @since 2025-04-02 22:36:09
 */
@Data
@ApiModel("")
public class LogOprate implements Serializable {
    private static final long serialVersionUID = 350600838672710901L;

    @ApiModelProperty("主键")
    private Integer id;

    @ApiModelProperty("动作  1-导入  2-下载")
    private String action;

    @ApiModelProperty("文件名称")
    private String fileName;

    @ApiModelProperty("文件大小")
    private Integer fileSize;

    @ApiModelProperty("操作人")
    private Integer userId;

    @ApiModelProperty("操作时间")
    private Date time;

}

