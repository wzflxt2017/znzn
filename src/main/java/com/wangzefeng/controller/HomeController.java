package com.wangzefeng.controller;

import com.wangzefeng.pojo.SysUser;
import com.wangzefeng.service.CommonService;
import com.wangzefeng.tools.Constants;
import com.wangzefeng.tools.MD5Util;
import com.wangzefeng.tools.ValidateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;

/**
 * Created by wangzefeng on 2019/5/31 0031.
 */
@Controller
@RequestMapping("/home")
public class HomeController extends BaseController{

    @Autowired
    private CommonService commonService;

    @RequestMapping("/index")
    public ModelAndView index(ModelAndView view){
        view.setViewName("index");
        SysUser sysUser = getSysUser();
        if(sysUser!=null){
            view.addObject("sysUser",sysUser);
        }
        return view;
    }

    @RequestMapping("/toLogin")
    public String toLogin(){
        return "page-login";
    }

    @ResponseBody
    @RequestMapping(value = "/login",method =RequestMethod.POST)
    public String login(SysUser sysUser){
        String saveUser = request.getParameter("saveUser");
        String password=sysUser.getPassword();
        sysUser.setPassword(MD5Util.getMD5Str(sysUser.getPassword()));
        int i = commonService.validatePassword(sysUser);
        if(i==0){
            sysUser=commonService.getUserByUserName(sysUser.getUserName());
            session.setAttribute(Constants.SESSION_USER,sysUser);
            if(ValidateUtil.validateString(saveUser)&&"true".equals(saveUser)){
                Cookie userNameCookie=new Cookie(Constants.COOKIE_USER_NAME,sysUser.getUserName());
                Cookie passwordCookie=new Cookie(Constants.COOKIE_PASSWORD,password);
                userNameCookie.setMaxAge(30*24*60*60);
                userNameCookie.setPath("/");
                passwordCookie.setMaxAge(30*24*60*60);
                passwordCookie.setPath("/");
                response.addCookie(userNameCookie);
                response.addCookie(passwordCookie);
            }
        }
        return ""+i;
    }


    @RequestMapping("/toRegister")
    public String toRegister(){
        return "page-register";
    }

    @ResponseBody
    @RequestMapping("/register")
    public String register(SysUser sysUser){
        int i = commonService.registerUser(sysUser);
        return ""+i;
    }
}
