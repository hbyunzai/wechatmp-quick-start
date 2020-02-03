/*
 * @Date: 2020-02-03 12:35:32
 * @Author: ferried
 * @Email: harlancui@outlook.com
 * @LastEditors  : ferried
 * @LastEditTime : 2020-02-03 13:15:44
 * @Editor: Visual Studio Code
 * @Desc: nil
 * @License: nil
 */
package com.github.hbyunzai.wechat.quickstart.config;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import java.util.ArrayList;
import java.util.List;

/**
 * 微信midaTypes转换配置
 * @author ferried
 */
public class WechatMappingJackson2HttpMessageConverter extends MappingJackson2HttpMessageConverter {
    public WechatMappingJackson2HttpMessageConverter() {
        List<MediaType> mediaTypes = new ArrayList<>();
        mediaTypes.add(MediaType.TEXT_PLAIN);
        mediaTypes.add(MediaType.TEXT_HTML);
        setSupportedMediaTypes(mediaTypes);
    }

}
