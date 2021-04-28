package com.zfirm.fishingtest.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zfirm.fishingtest.entity.UserEntity;
import com.zfirm.fishingtest.utils.PageUtils;


import java.util.Map;

/**
 * 
 *
 * @author zy
 * @email zy@gmail.com
 * @date 2021-04-22 23:22:54
 */
public interface UserService extends IService<UserEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void login(UserEntity userEntity);
}

