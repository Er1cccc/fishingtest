package com.zfirm.fishingtest.dao;

import com.zfirm.fishingtest.entity.UserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author zy
 * @email zy@gmail.com
 * @date 2021-04-22 23:22:54
 */
@Mapper
public interface UserDao extends BaseMapper<UserEntity> {
	
}
