package com.formicine.weaver.domain.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * 广告表
 */
@Data
public class BsAdvert implements Serializable{

    private static final long serialVersionUID = 7834189916342751375L;
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
