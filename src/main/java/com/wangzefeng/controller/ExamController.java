package com.wangzefeng.controller;

import com.wangzefeng.pojo.TestExamination;
import com.wangzefeng.pojo.TestProblems;
import com.wangzefeng.service.ExamService;
import com.wangzefeng.tools.ValidateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by wangzefeng on 2019/6/17 0017.
 */
@Controller
@RequestMapping("/exam")
public class ExamController extends BaseController {

    @Autowired
    private ExamService examService;

    @RequestMapping("/uprightMan")
    public ModelAndView uprightMan(ModelAndView modelAndView){
        List<TestExamination> testExaminations = examService.selectByUser(getSysUser().getSysUserId());
        modelAndView.addObject("testExaminations",testExaminations);
        modelAndView.setViewName("exam/upright_man");
        return modelAndView;
    }

    @RequestMapping(value="/startExam/{type}")
    public ModelAndView startExam(@PathVariable("type")String type,ModelAndView modelAndView){

        if(ValidateUtil.validateString(type)){
            String uUid = ValidateUtil.getUUid();
            TestExamination examination = examService.startExam(type);
            examination.setSysUserId(getSysUser().getSysUserId());
            examination.setTestExaminationId(uUid);
            int save = examService.save(examination);
            if(save==1)
            modelAndView.addObject("testExaminationId",uUid);
        }
        List<TestProblems> testProblems = examService.selectRandProblems(1);
        modelAndView.addObject("problems",testProblems.get(0));
        modelAndView.setViewName("exam/exam");
        return modelAndView;
    }



}
