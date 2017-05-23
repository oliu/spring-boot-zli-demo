package com.formicine.weaver.service.mybatis.impl;

import com.formicine.weaver.dao.mapper.BsAdvertMapper;
import com.formicine.weaver.domain.model.BsAdvert;
import com.formicine.weaver.service.mybatis.BsAdvertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by zli on 2017/5/23.
 */
@Service
public class BsAdvertServiceImpl implements BsAdvertService {

    @Resource
    private BsAdvertMapper bsAdvertMapper;

    @Override
    public BsAdvert selectById(Long id) {
        return bsAdvertMapper.selectByPrimaryKey(id);
    }
}
