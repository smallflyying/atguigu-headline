package com.atguigu.headline.service.impl;

import com.atguigu.headline.dao.NewsUserDao;
import com.atguigu.headline.dao.impl.NewsUserDaoImpl;
import com.atguigu.headline.pojo.NewsUser;
import com.atguigu.headline.service.NewsUserService;

/**
 * @author LiHongFei
 * @since 2024/6/4
 */
public class NewsUserServiceImpl implements NewsUserService {

    private NewsUserDao userDao = new NewsUserDaoImpl();
    @Override
    public NewsUser findByUsername(String username) {
        return userDao.findByUsername(username);
    }
}
