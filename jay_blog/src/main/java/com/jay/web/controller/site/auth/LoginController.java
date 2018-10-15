package com.jay.web.controller.site.auth;

import com.jay.web.controller.BaseController;
import com.jay.web.controller.site.Views;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 登录页
 * Created by xiang.wei on 2018/10/14
 *
 * @author xiang.wei
 */
@Controller
public class LoginController extends BaseController {
    /**
     * 提交登录
     * @param username 用户名
     * @param password 密码
     * @param rememberMe
     * @param model
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(String username, String password,
                        @RequestParam(value = "rememberMe", defaultValue = "0") int rememberMe,
                        ModelMap model) {
        String ret = view(Views.LOGIN);
        if (StringUtils.isBlank(username) || StringUtils.isBlank(password)) {
            return ret;
        }
        AuthenticationToken token = createToken(username, password);
        if (token==null) {
            model.put("message", "用户名或密码错误");
            return ret;
        }
        if (rememberMe == 1) {
            ((UsernamePasswordToken) token).setRememberMe(true);
        }
        try {
            SecurityUtils.getSubject().login(token);
            ret = Views.REDIRECT_USER;
        } catch (AuthenticationException e) {
            if (e instanceof UnknownAccountException) {
                model.put("message", "用户不存在");
            } else if (e instanceof LockedAccountException) {
                model.put("message", "用户被禁用");
            } else {
                model.put("message","用户认证失败");
            }
        }
        return ret;
    }
}
