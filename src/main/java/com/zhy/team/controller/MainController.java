package com.zhy.team.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.zhy.team.bean.User;
import com.zhy.team.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
/**
 * Created by zhy on 2017/12/27 0027.
 */
@Controller
public class MainController {

    private static final Logger logger = LogManager.getLogger(MainController.class);

    @Resource
    private UserService userService;

    /***
     *
     * @Description: 跳转到主界面
     * @date 2017-12-27 11:04:21
     */
    @RequestMapping("main.do")
    public String goMainPage(){
        return "index";
    }



    /**
     *Description : 用户登录接口 可以get免登陆
     *@return
     */
    @RequestMapping("login.do")
    public String go(String userAccount, String password, HttpServletRequest request, HttpServletResponse response,
                     HttpSession session) {

        return userAccount;
    }
}
