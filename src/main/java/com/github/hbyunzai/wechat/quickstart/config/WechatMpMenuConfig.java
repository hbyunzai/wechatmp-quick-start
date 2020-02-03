/*
 * @Date: 2020-02-03 12:36:05
 * @Author: ferried
 * @Email: harlancui@outlook.com
 * @LastEditors  : ferried
 * @LastEditTime : 2020-02-03 12:39:08
 * @Editor: Visual Studio Code
 * @Desc: nil
 * @License: nil
 */
package com.github.hbyunzai.wechat.quickstart.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import me.chanjar.weixin.mp.api.WxMpMenuService;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.api.impl.WxMpMenuServiceImpl;

@Configuration
public class WechatMpMenuConfig {

  @Autowired
  WxMpService wxMpService;

  @Bean
  public WxMpMenuService generateWxMpMenuService() {
    return new WxMpMenuServiceImpl(wxMpService);
  }
}