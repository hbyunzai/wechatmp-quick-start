/*
 * @Date: 2020-02-03 12:34:43
 * @Author: ferried
 * @Email: harlancui@outlook.com
 * @LastEditors: ferried
 * @LastEditTime: 2020-02-03 12:35:43
 * @Editor: Visual Studio Code
 * @Desc: nil
 * @License: nil
 */
package com.github.hbyunzai.wechat.quickstart.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

    @Bean
    public RestTemplate restTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new WechatMappingJackson2HttpMessageConverter());
        return restTemplate;
    }
}
