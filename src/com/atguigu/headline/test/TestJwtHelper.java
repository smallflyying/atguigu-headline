package com.atguigu.headline.test;

import com.atguigu.headline.util.JwtHelper;
import org.junit.Test;

/**
 * @author LiHongFei
 * @since 2024/6/4
 */
public class TestJwtHelper {

    @Test
    public void testAllMethod() throws InterruptedException {
        String token = JwtHelper.createToken(1L);

        System.out.println(token);

        Long userId = JwtHelper.getUserId(token);
        System.out.println(userId);

        System.out.println(JwtHelper.isExpiration(token));

        Thread.sleep(6000);

        System.out.println(JwtHelper.isExpiration(token));
    }
}
