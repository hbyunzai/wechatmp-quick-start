/*
 * @Date: 2020-02-03 12:33:08
 * @Author: ferried
 * @Email: harlancui@outlook.com
 * @LastEditors  : ferried
 * @LastEditTime : 2020-02-03 12:34:24
 * @Editor: Visual Studio Code
 * @Desc: nil
 * @License: nil
 */
package com.github.hbyunzai.wechat.quickstart.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import lombok.Data;

@Data
@Component
public class WechatConfig {
    @Value("${wechat.token}")
    private String token;
    @Value("${wechat.appid}")
    private String appid;
    @Value("${wechat.appsecret}")
    private String appsecret;
    @Value("${wechat.aeskey}")
    private String aeskey;
}
