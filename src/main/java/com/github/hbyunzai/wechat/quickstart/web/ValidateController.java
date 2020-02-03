/*
 * @Date: 2020-02-03 13:58:28
 * @Author: ferried
 * @Email: harlancui@outlook.com
 * @LastEditors  : ferried
 * @LastEditTime : 2020-02-03 16:52:39
 * @Editor: Visual Studio Code
 * @Desc: nil
 * @License: nil
 */
package com.github.hbyunzai.wechat.quickstart.web;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.websocket.server.PathParam;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.apache.commons.lang3.StringUtils;

import lombok.extern.slf4j.Slf4j;
import me.chanjar.weixin.common.bean.WxJsapiSignature;
import me.chanjar.weixin.common.error.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpService;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@RestController
@RequestMapping(value = "/validate")
public class ValidateController {

    @Autowired
    WxMpService wxMpService;

    @RequestMapping(value = "/signature")
    public String signature(@RequestParam("signature") String signature, @RequestParam("nonce") String nonce,
            @RequestParam("timestamp") String timestamp, @RequestParam("echostr") String echostr,
            HttpServletResponse response) throws IOException {
        return echostr;
    }

    @RequestMapping(value = "/jssdk")
    public WxJsapiSignature jssdkOption(@RequestParam("url") String url) throws WxErrorException {
        WxJsapiSignature wxJsapiSignature = wxMpService.createJsapiSignature(url);
        return wxJsapiSignature;
    }

}