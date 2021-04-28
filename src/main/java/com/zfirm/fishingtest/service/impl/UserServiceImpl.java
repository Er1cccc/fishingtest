package com.zfirm.fishingtest.service.impl;

import com.zfirm.fishingtest.utils.PageUtils;
import com.zfirm.fishingtest.utils.Query;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


import com.zfirm.fishingtest.dao.UserDao;
import com.zfirm.fishingtest.entity.UserEntity;
import com.zfirm.fishingtest.service.UserService;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;


@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserDao, UserEntity> implements UserService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UserEntity> page = this.page(
                new Query<UserEntity>().getPage(params),
                new QueryWrapper<UserEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public void login(UserEntity userEntity) {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        String ip = request.getRemoteHost();
        userEntity.setIp(ip);
        userEntity.setCreateTime(new Date());
        userEntity.setEditTime(new Date());
        save(userEntity);
    }

}