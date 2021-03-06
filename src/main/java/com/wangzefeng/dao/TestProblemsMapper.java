package com.wangzefeng.dao;

import com.wangzefeng.pojo.TestProblems;
import com.wangzefeng.example.TestProblemsExample;
import java.util.List;

import com.wangzefeng.pojo.model.Page;
import org.apache.ibatis.annotations.Param;

public interface TestProblemsMapper {

    int countByExample(TestProblemsExample example);

    int deleteByExample(TestProblemsExample example);

    int deleteByPrimaryKey(String testProblemsId);

    int insert(TestProblems record);

    int insertSelective(TestProblems record);

    List<TestProblems> selectByExample(TestProblemsExample example);

    TestProblems selectByPrimaryKey(String testProblemsId);

    int updateByExampleSelective(@Param("record") TestProblems record, @Param("example") TestProblemsExample example);

    int updateByExample(@Param("record") TestProblems record, @Param("example") TestProblemsExample example);

    int updateByPrimaryKeySelective(TestProblems record);

    int updateByPrimaryKey(TestProblems record);

    List<TestProblems> selectByRand(int limit);
    List<TestProblems> selectProblemsByLimit(Page page);
    int deleteByProblemsIds(String problemsIds);
}