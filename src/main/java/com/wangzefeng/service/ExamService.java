package com.wangzefeng.service;

import com.wangzefeng.pojo.TestExamination;
import com.wangzefeng.pojo.TestProblemOption;
import com.wangzefeng.pojo.TestProblems;
import com.wangzefeng.pojo.TestType;
import com.wangzefeng.pojo.model.TestProblemOptionModel;

import java.util.List;

/**
 * Created by wangzefeng on 2019/6/17 0017.
 */
public interface ExamService {
    TestExamination startExam(String type);
    int save(TestExamination examination);
    List<TestProblems> selectRandProblems(int limit);
    List<TestProblems> selectProblemsByLimit(int start,int count);
    List<TestExamination> selectByUser(String sysUserId);
    List<TestType> selectAllType();
    String addProblem(TestProblems testProblems, TestProblemOptionModel optionModel);
    String deleteProblems(String problems);
}
