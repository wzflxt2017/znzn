package com.wangzefeng.controller;

import com.wangzefeng.pojo.AllFile;
import com.wangzefeng.pojo.SysUser;
import com.wangzefeng.service.FileService;
import com.wangzefeng.service.IndexService;
import com.wangzefeng.tools.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by wangzefeng on 2019/6/13 0013.
 */
@Controller
@RequestMapping("/index")
public class IndexController extends BaseController {

    @Autowired
    private IndexService indexService;

    @Autowired
    private FileService fileService;

    @RequestMapping("/outLogin")
    public String outLogin(){
        session.removeAttribute(Constants.SESSION_USER);
        return "page-login";
    }
    @RequestMapping("/profile")
    public ModelAndView profile(ModelAndView modelAndView){
        modelAndView.addObject("user",getSysUser());
        AllFile allFile = fileService.selectById(getSysUser().getUserPhoto());
        modelAndView.addObject("image",allFile);
        modelAndView.setViewName("app-profile");
        return modelAndView;
    }
}
