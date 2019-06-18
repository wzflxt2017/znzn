package com.wangzefeng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by wangzefeng on 2019/6/17 0017.
 */
@Controller
@RequestMapping("/exam")
public class ExamController extends BaseController {

    @RequestMapping("/uprightMan")
    public String uprightMan(){

        return "exam/upright_man";
    }

}
