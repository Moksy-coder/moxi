package com.moxi.apiinterface;

import com.moxi.apiclientsdk.client.ApiClient;
import com.moxi.apiclientsdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * 测试类
 *
 * @author <a href="https://github.com/moxi">墨兮</a>
 * 
 */
@SpringBootTest
class apiInterfaceApplicationTests {

    @Resource
    private ApiClient ApiClient;

    @Test
    void contextLoads() {
        String result = ApiClient.getNameByGet("moxi");
        User user = new User();
        user.setUsername("作_者 【_墨兮】 ");
        String usernameByPost = ApiClient.getUsernameByPost(user);
        System.out.println(result);
        System.out.println(usernameByPost);
    }

}
