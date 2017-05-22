package com.formicine.weaver.controller;

import com.formicine.weaver.utils.JavaFileUtil;
import com.formicine.weaver.utils.resultHandler.Result;
import com.formicine.weaver.utils.resultHandler.ResultEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.util.StringUtils;

/**
 * Created by zli on 2017/5/22.
 * <p>
 * Examples of use redis
 * 使用redis范例
 */
@RestController
@RequestMapping("/redis")
public class RedisController {
    private static final Logger logger = LoggerFactory.getLogger(RedisController.class);

    @Autowired
    private StringRedisTemplate redisTemplate;

    @GetMapping(value = "set", produces = MediaType.APPLICATION_JSON_VALUE)
    public Result set(String key) {
        if (StringUtils.isEmpty(key)) {
            return Result.error(ResultEnum.PARAMS_LACK);
        }
        try {
            redisTemplate.opsForValue().set(key, "hello");
            String value = redisTemplate.opsForValue().get(key);
            return Result.success(value);
        } catch (Exception e) {
            logger.error("{} exception {}", JavaFileUtil.getMethodName());
        }
        return Result.error(ResultEnum.INTERNAL_ERROR);
    }
}
