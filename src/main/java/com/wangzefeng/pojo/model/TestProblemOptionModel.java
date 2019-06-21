package com.wangzefeng.pojo.model;

import com.wangzefeng.pojo.TestProblemOption;

import java.util.List;

/**
 * Created by wangzefeng on 2019/6/21 0021.
 */
public class TestProblemOptionModel {
    private List<TestProblemOption> options;


    public TestProblemOptionModel() {

    }

    public TestProblemOptionModel(List<TestProblemOption> options) {
        this.options = options;
    }


    public List<TestProblemOption> getOptions() {
        return options;
    }

    public void setOptions(List<TestProblemOption> options) {
        this.options = options;
    }
}
