package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author lynsay
 * @email woodiq1000@gmail.com
 * @date 2020-09-05 17:43:25
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
