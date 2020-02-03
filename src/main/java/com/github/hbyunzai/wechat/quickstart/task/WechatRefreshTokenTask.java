/*
 * @Date: 2020-02-03 12:37:44
 * @Author: ferried
 * @Email: harlancui@outlook.com
 * @LastEditors  : ferried
 * @LastEditTime : 2020-02-03 13:29:02
 * @Editor: Visual Studio Code
 * @Desc: nil
 * @License: nil
 */
package com.github.hbyunzai.wechat.quickstart.task;

import com.github.hbyunzai.wechat.quickstart.config.GlobalBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
import me.chanjar.weixin.common.error.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpService;

@Slf4j
@Component
@Configuration
@EnableScheduling
public class WechatRefreshTokenTask {

    @Autowired
    WxMpService wechatService;

    @Autowired
    GlobalBean GlobalBean;

    // 1小时57分钟
    @Scheduled(fixedRate = 7020000)
    private void configureTasks() {
        try {
            String token = wechatService.getAccessToken(true);
            log.info("---------------------"+token+"----------------------");
            GlobalBean.setWECHAT_GLOBAL_TOKEN(token);
        } catch (WxErrorException e) {
            e.printStackTrace();
        }
    }

}
