package com.moxi.project.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * 用户接口信息服务测试
 *
 * @author <a href="https://github.com/moxi">墨兮</a>
 * 
 */
@SpringBootTest
public class UserInterfaceInfoServiceTest {

    @Resource
    private com.moxi.project.service.UserInterfaceInfoService userInterfaceInfoService;

    @Test
    public void invokeCount() {
        boolean b = userInterfaceInfoService.invokeCount(1L, 1L);
        Assertions.assertTrue(b);
    }
}