package com.jackson0714.passjava.channel.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jackson0714.common.utils.PageUtils;
import com.jackson0714.passjava.channel.entity.AccessTokenEntity;

import java.util.Map;

/**
 * 渠道-认证表
 *
 * @author jackson0714
 * @email jackson0585@163.com
 * @date 2021-07-03 22:52:56
 */
public interface AccessTokenService extends IService<AccessTokenEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

