package com.formicine.weaver.domain.model;

import lombok.Data;

import java.util.Date;

/**
 * 广告表
 */
@Data
public class BsAdvert {
    private Long id;
    private Integer status;
    private Integer version;
    private String createUser;
    private Date createTime;
    private String updateUser;
    private Date updateTime;

    /**
     * 广告标题
     */
    private String title;
    /**
     * 广告备注
     */
    private String remark;

    /**
     * 图片跳转地址
     */
    private String jumpUrl;

    /**
     * 是否启用（0:禁用，1:启用）
     */
    private byte enable;

}
