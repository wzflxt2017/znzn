package com.wangzefeng.example;

import java.util.ArrayList;
import java.util.List;

public class TestProblemOptionExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table test_problem_option
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table test_problem_option
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table test_problem_option
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_problem_option
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    public TestProblemOptionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_problem_option
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_problem_option
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_problem_option
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_problem_option
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_problem_option
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_problem_option
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_problem_option
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_problem_option
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_problem_option
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_problem_option
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table test_problem_option
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTestProblemOptionIdIsNull() {
            addCriterion("test_problem_option_id is null");
            return (Criteria) this;
        }

        public Criteria andTestProblemOptionIdIsNotNull() {
            addCriterion("test_problem_option_id is not null");
            return (Criteria) this;
        }

        public Criteria andTestProblemOptionIdEqualTo(String value) {
            addCriterion("test_problem_option_id =", value, "testProblemOptionId");
            return (Criteria) this;
        }

        public Criteria andTestProblemOptionIdNotEqualTo(String value) {
            addCriterion("test_problem_option_id <>", value, "testProblemOptionId");
            return (Criteria) this;
        }

        public Criteria andTestProblemOptionIdGreaterThan(String value) {
            addCriterion("test_problem_option_id >", value, "testProblemOptionId");
            return (Criteria) this;
        }

        public Criteria andTestProblemOptionIdGreaterThanOrEqualTo(String value) {
            addCriterion("test_problem_option_id >=", value, "testProblemOptionId");
            return (Criteria) this;
        }

        public Criteria andTestProblemOptionIdLessThan(String value) {
            addCriterion("test_problem_option_id <", value, "testProblemOptionId");
            return (Criteria) this;
        }

        public Criteria andTestProblemOptionIdLessThanOrEqualTo(String value) {
            addCriterion("test_problem_option_id <=", value, "testProblemOptionId");
            return (Criteria) this;
        }

        public Criteria andTestProblemOptionIdLike(String value) {
            addCriterion("test_problem_option_id like", value, "testProblemOptionId");
            return (Criteria) this;
        }

        public Criteria andTestProblemOptionIdNotLike(String value) {
            addCriterion("test_problem_option_id not like", value, "testProblemOptionId");
            return (Criteria) this;
        }

        public Criteria andTestProblemOptionIdIn(List<String> values) {
            addCriterion("test_problem_option_id in", values, "testProblemOptionId");
            return (Criteria) this;
        }

        public Criteria andTestProblemOptionIdNotIn(List<String> values) {
            addCriterion("test_problem_option_id not in", values, "testProblemOptionId");
            return (Criteria) this;
        }

        public Criteria andTestProblemOptionIdBetween(String value1, String value2) {
            addCriterion("test_problem_option_id between", value1, value2, "testProblemOptionId");
            return (Criteria) this;
        }

        public Criteria andTestProblemOptionIdNotBetween(String value1, String value2) {
            addCriterion("test_problem_option_id not between", value1, value2, "testProblemOptionId");
            return (Criteria) this;
        }

        public Criteria andTestProblemsIdIsNull() {
            addCriterion("test_problems_id is null");
            return (Criteria) this;
        }

        public Criteria andTestProblemsIdIsNotNull() {
            addCriterion("test_problems_id is not null");
            return (Criteria) this;
        }

        public Criteria andTestProblemsIdEqualTo(String value) {
            addCriterion("test_problems_id =", value, "testProblemsId");
            return (Criteria) this;
        }

        public Criteria andTestProblemsIdNotEqualTo(String value) {
            addCriterion("test_problems_id <>", value, "testProblemsId");
            return (Criteria) this;
        }

        public Criteria andTestProblemsIdGreaterThan(String value) {
            addCriterion("test_problems_id >", value, "testProblemsId");
            return (Criteria) this;
        }

        public Criteria andTestProblemsIdGreaterThanOrEqualTo(String value) {
            addCriterion("test_problems_id >=", value, "testProblemsId");
            return (Criteria) this;
        }

        public Criteria andTestProblemsIdLessThan(String value) {
            addCriterion("test_problems_id <", value, "testProblemsId");
            return (Criteria) this;
        }

        public Criteria andTestProblemsIdLessThanOrEqualTo(String value) {
            addCriterion("test_problems_id <=", value, "testProblemsId");
            return (Criteria) this;
        }

        public Criteria andTestProblemsIdLike(String value) {
            addCriterion("test_problems_id like", value, "testProblemsId");
            return (Criteria) this;
        }

        public Criteria andTestProblemsIdNotLike(String value) {
            addCriterion("test_problems_id not like", value, "testProblemsId");
            return (Criteria) this;
        }

        public Criteria andTestProblemsIdIn(List<String> values) {
            addCriterion("test_problems_id in", values, "testProblemsId");
            return (Criteria) this;
        }

        public Criteria andTestProblemsIdNotIn(List<String> values) {
            addCriterion("test_problems_id not in", values, "testProblemsId");
            return (Criteria) this;
        }

        public Criteria andTestProblemsIdBetween(String value1, String value2) {
            addCriterion("test_problems_id between", value1, value2, "testProblemsId");
            return (Criteria) this;
        }

        public Criteria andTestProblemsIdNotBetween(String value1, String value2) {
            addCriterion("test_problems_id not between", value1, value2, "testProblemsId");
            return (Criteria) this;
        }

        public Criteria andOptionTitleIsNull() {
            addCriterion("option_title is null");
            return (Criteria) this;
        }

        public Criteria andOptionTitleIsNotNull() {
            addCriterion("option_title is not null");
            return (Criteria) this;
        }

        public Criteria andOptionTitleEqualTo(String value) {
            addCriterion("option_title =", value, "optionTitle");
            return (Criteria) this;
        }

        public Criteria andOptionTitleNotEqualTo(String value) {
            addCriterion("option_title <>", value, "optionTitle");
            return (Criteria) this;
        }

        public Criteria andOptionTitleGreaterThan(String value) {
            addCriterion("option_title >", value, "optionTitle");
            return (Criteria) this;
        }

        public Criteria andOptionTitleGreaterThanOrEqualTo(String value) {
            addCriterion("option_title >=", value, "optionTitle");
            return (Criteria) this;
        }

        public Criteria andOptionTitleLessThan(String value) {
            addCriterion("option_title <", value, "optionTitle");
            return (Criteria) this;
        }

        public Criteria andOptionTitleLessThanOrEqualTo(String value) {
            addCriterion("option_title <=", value, "optionTitle");
            return (Criteria) this;
        }

        public Criteria andOptionTitleLike(String value) {
            addCriterion("option_title like", value, "optionTitle");
            return (Criteria) this;
        }

        public Criteria andOptionTitleNotLike(String value) {
            addCriterion("option_title not like", value, "optionTitle");
            return (Criteria) this;
        }

        public Criteria andOptionTitleIn(List<String> values) {
            addCriterion("option_title in", values, "optionTitle");
            return (Criteria) this;
        }

        public Criteria andOptionTitleNotIn(List<String> values) {
            addCriterion("option_title not in", values, "optionTitle");
            return (Criteria) this;
        }

        public Criteria andOptionTitleBetween(String value1, String value2) {
            addCriterion("option_title between", value1, value2, "optionTitle");
            return (Criteria) this;
        }

        public Criteria andOptionTitleNotBetween(String value1, String value2) {
            addCriterion("option_title not between", value1, value2, "optionTitle");
            return (Criteria) this;
        }

        public Criteria andOptionContentIsNull() {
            addCriterion("option_content is null");
            return (Criteria) this;
        }

        public Criteria andOptionContentIsNotNull() {
            addCriterion("option_content is not null");
            return (Criteria) this;
        }

        public Criteria andOptionContentEqualTo(String value) {
            addCriterion("option_content =", value, "optionContent");
            return (Criteria) this;
        }

        public Criteria andOptionContentNotEqualTo(String value) {
            addCriterion("option_content <>", value, "optionContent");
            return (Criteria) this;
        }

        public Criteria andOptionContentGreaterThan(String value) {
            addCriterion("option_content >", value, "optionContent");
            return (Criteria) this;
        }

        public Criteria andOptionContentGreaterThanOrEqualTo(String value) {
            addCriterion("option_content >=", value, "optionContent");
            return (Criteria) this;
        }

        public Criteria andOptionContentLessThan(String value) {
            addCriterion("option_content <", value, "optionContent");
            return (Criteria) this;
        }

        public Criteria andOptionContentLessThanOrEqualTo(String value) {
            addCriterion("option_content <=", value, "optionContent");
            return (Criteria) this;
        }

        public Criteria andOptionContentLike(String value) {
            addCriterion("option_content like", value, "optionContent");
            return (Criteria) this;
        }

        public Criteria andOptionContentNotLike(String value) {
            addCriterion("option_content not like", value, "optionContent");
            return (Criteria) this;
        }

        public Criteria andOptionContentIn(List<String> values) {
            addCriterion("option_content in", values, "optionContent");
            return (Criteria) this;
        }

        public Criteria andOptionContentNotIn(List<String> values) {
            addCriterion("option_content not in", values, "optionContent");
            return (Criteria) this;
        }

        public Criteria andOptionContentBetween(String value1, String value2) {
            addCriterion("option_content between", value1, value2, "optionContent");
            return (Criteria) this;
        }

        public Criteria andOptionContentNotBetween(String value1, String value2) {
            addCriterion("option_content not between", value1, value2, "optionContent");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table test_problem_option
     *
     * @mbggenerated do_not_delete_during_merge Tue Jun 04 14:35:00 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table test_problem_option
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}