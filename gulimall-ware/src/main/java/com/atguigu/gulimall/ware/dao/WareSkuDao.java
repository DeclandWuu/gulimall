package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author lynsay
 * @email woodiq1000@gmail.com
 * @date 2020-09-05 17:50:10
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
