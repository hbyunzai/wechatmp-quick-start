/*
 * @Date: 2020-02-03 12:47:39
 * @Author: ferried
 * @Email: harlancui@outlook.com
 * @LastEditors  : ferried
 * @LastEditTime : 2020-02-03 13:10:01
 * @Editor: Visual Studio Code
 * @Desc: nil
 * @License: nil
 */
package com.github.hbyunzai.wechat.quickstart.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.api.impl.WxMpServiceImpl;
import me.chanjar.weixin.mp.config.impl.WxMpDefaultConfigImpl;

@Configuration
public class WechatMpConfig {

    @Autowired
    WechatConfig config;

    @Bean
    public WxMpService generateWxMpService() {
        MyWechatConfig wxMpConfigStorage = new MyWechatConfig();
        wxMpConfigStorage.setAppId(config.getAppid());
        wxMpConfigStorage.setSecret(config.getAppsecret());
        wxMpConfigStorage.setToken(config.getToken());
        wxMpConfigStorage.setAesKey(config.getAeskey());
        WxMpService wxMpService = new WxMpServiceImpl();
        wxMpService.setWxMpConfigStorage(wxMpConfigStorage);
        return wxMpService;
    }

}

class MyWechatConfig extends WxMpDefaultConfigImpl {

    private static final long serialVersionUID = 1L;

    @Override
    public void setAppId(String appId) {
        super.setAppId(appId);
    }

    @Override
    public void setSecret(String secret) {
        super.setSecret(secret);
    }

    @Override
    public void setAesKey(String aesKey) {
        super.setAesKey(aesKey);
    }

    @Override
    public void setToken(String token) {
        super.setToken(token);
    }

}