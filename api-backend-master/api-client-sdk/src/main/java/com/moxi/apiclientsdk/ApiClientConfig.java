package com.moxi.apiclientsdk;

import com.moxi.apiclientsdk.client.ApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Api 客户端配置
 *
 * @author <a href="https://github.com/moxi">墨兮</a>
 * @from <a href="https://moxi.icu"></a>
 */
@Configuration
@ConfigurationProperties("api.client")
@Data
@ComponentScan
public class ApiClientConfig {

    private String accessKey;

    private String secretKey;

    @Bean
    public ApiClient ApiClient() {
        return new ApiClient(accessKey, secretKey);
    }

}
