package com.formicine.weaver.service.mybatis;


import com.formicine.weaver.domain.model.BsAdvert;

/**
 * Created by zli on 2017/5/23.
 */
public interface BsAdvertService {
    BsAdvert selectById(Long id);
}
