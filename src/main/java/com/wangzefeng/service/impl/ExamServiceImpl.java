package com.wangzefeng.service.impl;

import com.wangzefeng.dao.TestExaminationMapper;
import com.wangzefeng.dao.TestProblemsMapper;
import com.wangzefeng.dao.TestTypeMapper;
import com.wangzefeng.pojo.TestExamination;
import com.wangzefeng.pojo.TestProblems;
import com.wangzefeng.pojo.TestType;
import com.wangzefeng.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by wangzefeng on 2019/6/17 0017.
 */
@Service("examService")
public class ExamServiceImpl implements ExamService {

    @Autowired
    private TestTypeMapper testTypeMapper;
    @Autowired
    private TestExaminationMapper testExaminationMapper;
    @Autowired
    private TestProblemsMapper testProblemsMapper;

    public TestExamination startExam(String type){
        TestType testType = testTypeMapper.selectByTypeClass(type);
        TestExamination examination=new TestExamination();
        examination.setStartTime(new Date());
        examination.setTestTypeId(testType.getTestTypeId());
        return examination;
    }

    @Override
    public int save(TestExamination examination) {
        int i = testExaminationMapper.insertSelective(examination);
        return i;
    }

    @Override
    public List<TestProblems> selectRandProblems(int limit) {
        List<TestProblems> testProblems = testProblemsMapper.selectByRand(limit);
        return testProblems;
    }

    @Override
    public List<TestExamination> selectByUser(String sysUserId) {
        List<TestExamination> testExaminations = testExaminationMapper.selectByUser(sysUserId);
        return testExaminations;
    }
}
