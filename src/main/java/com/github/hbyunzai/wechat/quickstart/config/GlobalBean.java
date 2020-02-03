/*
 * @Date: 2020-02-03 13:18:50
 * @Author: ferried
 * @Email: harlancui@outlook.com
 * @LastEditors  : ferried
 * @LastEditTime : 2020-02-03 13:30:48
 * @Editor: Visual Studio Code
 * @Desc: nil
 * @License: nil
 */
package com.github.hbyunzai.wechat.quickstart.config;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Configuration
@Data
public class GlobalBean{
    String WECHAT_GLOBAL_TOKEN;
}