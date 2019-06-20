package com.wangzefeng.pojo;

public class TestProblemOption {

    private String testProblemOptionId;

    private String testProblemsId;

    private String optionTitle;

    private String optionContent;



    public String getTestProblemOptionId() {
        return testProblemOptionId;
    }


    public void setTestProblemOptionId(String testProblemOptionId) {
        this.testProblemOptionId = testProblemOptionId == null ? null : testProblemOptionId.trim();
    }


    public String getTestProblemsId() {
        return testProblemsId;
    }


    public void setTestProblemsId(String testProblemsId) {
        this.testProblemsId = testProblemsId == null ? null : testProblemsId.trim();
    }

    public String getOptionTitle() {
        return optionTitle;
    }

    public void setOptionTitle(String optionTitle) {
        this.optionTitle = optionTitle == null ? null : optionTitle.trim();
    }

    public String getOptionContent() {
        return optionContent;
    }

    public void setOptionContent(String optionContent) {
        this.optionContent = optionContent == null ? null : optionContent.trim();
    }

}