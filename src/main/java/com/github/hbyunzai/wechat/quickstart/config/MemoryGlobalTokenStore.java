/*
 * @Date: 2020-02-03 13:18:50
 * @Author: ferried
 * @Email: harlancui@outlook.com
 * @LastEditors  : ferried
 * @LastEditTime : 2020-02-03 15:15:35
 * @Editor: Visual Studio Code
 * @Desc: nil
 * @License: nil
 */
package com.github.hbyunzai.wechat.quickstart.config;

import lombok.Data;

@Data
public class MemoryGlobalTokenStore{
    String wechat_global_token;
    String wechat_js_ticket;
}