package com.wangzefeng.controller;

import com.wangzefeng.pojo.TestExamination;
import com.wangzefeng.pojo.TestProblems;
import com.wangzefeng.pojo.TestType;
import com.wangzefeng.pojo.model.TestProblemOptionModel;
import com.wangzefeng.service.ExamService;
import com.wangzefeng.tools.ValidateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
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

    @RequestMapping(value="/startExam/{type}/{testExaminationId}")
    public ModelAndView startExam(@PathVariable("type")String type,ModelAndView modelAndView,@PathVariable("testExaminationId") String testExaminationId){

        if(ValidateUtil.validateString(testExaminationId)) {
            modelAndView.addObject("testExaminationId",testExaminationId);
        }else if(ValidateUtil.validateString(type)){
            String uUid = ValidateUtil.getUUid();
            TestExamination examination = examService.startExam(type);
            examination.setSysUserId(getSysUser().getSysUserId());
            examination.setTestExaminationId(uUid);
            int save = examService.save(examination);
            if(save==1)
            modelAndView.addObject("testExaminationId",uUid);
        }
        modelAndView.setViewName("exam/exam");
        return modelAndView;
    }


    @ResponseBody
    @RequestMapping(value="/nextProblem")
    public TestProblems nextProblem(String testExaminationId){

        List<TestProblems> testProblems = examService.selectRandProblems(1);
//        modelAndView.addObject("problems",testProblems.get(0));
//        modelAndView.setViewName("exam/exam");
        return testProblems.get(0);
    }

    @RequestMapping(value="/problemManage")
    public ModelAndView problemManage(ModelAndView modelAndView){
        List<TestType> testTypes = examService.selectAllType();
        modelAndView.addObject("testTypes",testTypes);
        modelAndView.setViewName("problem/problemManage");
        return modelAndView;
    }


    @ResponseBody
    @RequestMapping(value="/problems")
    public List<TestProblems> problems(){
        List<TestProblems> testProblems = examService.selectRandProblems(1);
        return testProblems;
    }

    @ResponseBody
    @RequestMapping(value="/addProblem")
    public String addProblem(TestProblems testProblems, TestProblemOptionModel options){
        testProblems.setPropositionalUserId(getSysUser().getSysUserId());
        testProblems.setPropositionalDate(new Date());
        examService.addProblem(testProblems,options);
        return "1";
    }



}
