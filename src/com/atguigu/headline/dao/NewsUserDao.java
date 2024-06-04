package com.atguigu.headline.dao;

import com.atguigu.headline.pojo.NewsUser;

/**
 * @author LiHongFei
 * @since 2024/6/4
 */
public interface NewsUserDao {

    /**
     *
     * @param username
     * @return
     */
    NewsUser findByUsername(String username);
}
