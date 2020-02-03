/*
 * @Date: 2020-02-03 12:37:44
 * @Author: ferried
 * @Email: harlancui@outlook.com
 * @LastEditors  : ferried
 * @LastEditTime : 2020-02-03 15:16:56
 * @Editor: Visual Studio Code
 * @Desc: nil
 * @License: nil
 */
package com.github.hbyunzai.wechat.quickstart.task;

import com.github.hbyunzai.wechat.quickstart.config.MemoryGlobalTokenStore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
import me.chanjar.weixin.common.error.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.enums.TicketType;

@Slf4j
@Configuration
@EnableScheduling
public class WechatRefreshTokenTask {

    @Autowired
    WxMpService wechatService;

    @Autowired
    MemoryGlobalTokenStore memoryGlobalTokenStore;

    // 1小时57分钟
    @Scheduled(fixedRate = 7020000)
    private void configureTasks() {
        try {
            String token = wechatService.getAccessToken(true);
            String ticket = wechatService.getTicket(TicketType.JSAPI, true);
            log.info("---------------------" + token + "----------------------");
            memoryGlobalTokenStore.setWechat_global_token(token);
            log.info("---------------------" + ticket + "----------------------");
            memoryGlobalTokenStore.setWechat_js_ticket(ticket);

        } catch (WxErrorException e) {
            e.printStackTrace();
        }
    }

}
