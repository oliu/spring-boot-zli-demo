package com.formicine.weaver.dao.mapper;

import com.formicine.weaver.dao.base.MyMapper;
import com.formicine.weaver.domain.model.BsAdvert;
import org.apache.ibatis.annotations.Param;

/**
 * Created by zli on 2017/5/23.
 */
public interface BsAdvertMapper extends MyMapper<BsAdvert> {
    BsAdvert selectById(@Param("id") Long id);
}
