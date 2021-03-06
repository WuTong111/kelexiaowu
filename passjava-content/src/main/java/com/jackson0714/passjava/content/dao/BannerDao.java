package com.jackson0714.passjava.content.dao;

import com.jackson0714.passjava.content.entity.BannerEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 内容-横幅广告表
 * 
 * @author jackson0714
 * @email jackson0585@163.com
 * @date 2021-07-04 15:20:47
 */
@Mapper
public interface BannerDao extends BaseMapper<BannerEntity> {
	
}
