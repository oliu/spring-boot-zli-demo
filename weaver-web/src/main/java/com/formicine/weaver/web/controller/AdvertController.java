package com.formicine.weaver.web.controller;

import com.formicine.weaver.common.utils.JavaFileUtil;
import com.formicine.weaver.common.utils.exception.Exceptions;
import com.formicine.weaver.common.utils.resultHandler.Result;
import com.formicine.weaver.common.utils.resultHandler.ResultEnum;
import com.formicine.weaver.domain.model.BsAdvert;
import com.formicine.weaver.service.mybatis.BsAdvertService;
import org.apache.logging.log4j.core.impl.ReusableLogEventFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by zli on 2017/5/23.
 */
@RestController
@RequestMapping("/ad")
public class AdvertController {
    private static final Logger logger = LoggerFactory.getLogger(AdvertController.class);
    @Resource
    private BsAdvertService bsAdvertService;

    @GetMapping("/one")
    public Result getAdvert(Long id) {
        if (id != null) {
            try{

                BsAdvert bsAdvert = bsAdvertService.selectById(id);
                logger.info("{} result is {}", JavaFileUtil.getMethodName(),bsAdvert);
                return Result.success("OK");
            }catch (Exception e){
                logger.error("{} error {}",JavaFileUtil.getMethodName(), Exceptions.getStackTraceAsString(e));
                return Result.error(ResultEnum.EXCEPTION);
            }
        }
        return Result.error(ResultEnum.PARAMS_LACK);
    }
}
