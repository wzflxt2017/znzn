package com.wangzefeng.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysUserExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_user
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_user
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_user
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    public SysUserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
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
     * This method corresponds to the database table sys_user
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
     * This method corresponds to the database table sys_user
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
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
     * This class corresponds to the database table sys_user
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

        public Criteria andSysUserIdIsNull() {
            addCriterion("sys_user_id is null");
            return (Criteria) this;
        }

        public Criteria andSysUserIdIsNotNull() {
            addCriterion("sys_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andSysUserIdEqualTo(String value) {
            addCriterion("sys_user_id =", value, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdNotEqualTo(String value) {
            addCriterion("sys_user_id <>", value, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdGreaterThan(String value) {
            addCriterion("sys_user_id >", value, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("sys_user_id >=", value, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdLessThan(String value) {
            addCriterion("sys_user_id <", value, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdLessThanOrEqualTo(String value) {
            addCriterion("sys_user_id <=", value, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdLike(String value) {
            addCriterion("sys_user_id like", value, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdNotLike(String value) {
            addCriterion("sys_user_id not like", value, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdIn(List<String> values) {
            addCriterion("sys_user_id in", values, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdNotIn(List<String> values) {
            addCriterion("sys_user_id not in", values, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdBetween(String value1, String value2) {
            addCriterion("sys_user_id between", value1, value2, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andSysUserIdNotBetween(String value1, String value2) {
            addCriterion("sys_user_id not between", value1, value2, "sysUserId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andFullNameIsNull() {
            addCriterion("full_name is null");
            return (Criteria) this;
        }

        public Criteria andFullNameIsNotNull() {
            addCriterion("full_name is not null");
            return (Criteria) this;
        }

        public Criteria andFullNameEqualTo(String value) {
            addCriterion("full_name =", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotEqualTo(String value) {
            addCriterion("full_name <>", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameGreaterThan(String value) {
            addCriterion("full_name >", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameGreaterThanOrEqualTo(String value) {
            addCriterion("full_name >=", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameLessThan(String value) {
            addCriterion("full_name <", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameLessThanOrEqualTo(String value) {
            addCriterion("full_name <=", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameLike(String value) {
            addCriterion("full_name like", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotLike(String value) {
            addCriterion("full_name not like", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameIn(List<String> values) {
            addCriterion("full_name in", values, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotIn(List<String> values) {
            addCriterion("full_name not in", values, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameBetween(String value1, String value2) {
            addCriterion("full_name between", value1, value2, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotBetween(String value1, String value2) {
            addCriterion("full_name not between", value1, value2, "fullName");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNull() {
            addCriterion("user_email is null");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNotNull() {
            addCriterion("user_email is not null");
            return (Criteria) this;
        }

        public Criteria andUserEmailEqualTo(String value) {
            addCriterion("user_email =", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotEqualTo(String value) {
            addCriterion("user_email <>", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThan(String value) {
            addCriterion("user_email >", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThanOrEqualTo(String value) {
            addCriterion("user_email >=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThan(String value) {
            addCriterion("user_email <", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThanOrEqualTo(String value) {
            addCriterion("user_email <=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLike(String value) {
            addCriterion("user_email like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotLike(String value) {
            addCriterion("user_email not like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailIn(List<String> values) {
            addCriterion("user_email in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotIn(List<String> values) {
            addCriterion("user_email not in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailBetween(String value1, String value2) {
            addCriterion("user_email between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotBetween(String value1, String value2) {
            addCriterion("user_email not between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayIsNull() {
            addCriterion("user_birthday is null");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayIsNotNull() {
            addCriterion("user_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayEqualTo(Date value) {
            addCriterion("user_birthday =", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayNotEqualTo(Date value) {
            addCriterion("user_birthday <>", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayGreaterThan(Date value) {
            addCriterion("user_birthday >", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("user_birthday >=", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayLessThan(Date value) {
            addCriterion("user_birthday <", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("user_birthday <=", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayIn(List<Date> values) {
            addCriterion("user_birthday in", values, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayNotIn(List<Date> values) {
            addCriterion("user_birthday not in", values, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayBetween(Date value1, Date value2) {
            addCriterion("user_birthday between", value1, value2, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("user_birthday not between", value1, value2, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNull() {
            addCriterion("user_phone is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNotNull() {
            addCriterion("user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneEqualTo(String value) {
            addCriterion("user_phone =", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotEqualTo(String value) {
            addCriterion("user_phone <>", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThan(String value) {
            addCriterion("user_phone >", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_phone >=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThan(String value) {
            addCriterion("user_phone <", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("user_phone <=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLike(String value) {
            addCriterion("user_phone like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotLike(String value) {
            addCriterion("user_phone not like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIn(List<String> values) {
            addCriterion("user_phone in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotIn(List<String> values) {
            addCriterion("user_phone not in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneBetween(String value1, String value2) {
            addCriterion("user_phone between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotBetween(String value1, String value2) {
            addCriterion("user_phone not between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhotoIsNull() {
            addCriterion("user_photo is null");
            return (Criteria) this;
        }

        public Criteria andUserPhotoIsNotNull() {
            addCriterion("user_photo is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhotoEqualTo(String value) {
            addCriterion("user_photo =", value, "userPhoto");
            return (Criteria) this;
        }

        public Criteria andUserPhotoNotEqualTo(String value) {
            addCriterion("user_photo <>", value, "userPhoto");
            return (Criteria) this;
        }

        public Criteria andUserPhotoGreaterThan(String value) {
            addCriterion("user_photo >", value, "userPhoto");
            return (Criteria) this;
        }

        public Criteria andUserPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("user_photo >=", value, "userPhoto");
            return (Criteria) this;
        }

        public Criteria andUserPhotoLessThan(String value) {
            addCriterion("user_photo <", value, "userPhoto");
            return (Criteria) this;
        }

        public Criteria andUserPhotoLessThanOrEqualTo(String value) {
            addCriterion("user_photo <=", value, "userPhoto");
            return (Criteria) this;
        }

        public Criteria andUserPhotoLike(String value) {
            addCriterion("user_photo like", value, "userPhoto");
            return (Criteria) this;
        }

        public Criteria andUserPhotoNotLike(String value) {
            addCriterion("user_photo not like", value, "userPhoto");
            return (Criteria) this;
        }

        public Criteria andUserPhotoIn(List<String> values) {
            addCriterion("user_photo in", values, "userPhoto");
            return (Criteria) this;
        }

        public Criteria andUserPhotoNotIn(List<String> values) {
            addCriterion("user_photo not in", values, "userPhoto");
            return (Criteria) this;
        }

        public Criteria andUserPhotoBetween(String value1, String value2) {
            addCriterion("user_photo between", value1, value2, "userPhoto");
            return (Criteria) this;
        }

        public Criteria andUserPhotoNotBetween(String value1, String value2) {
            addCriterion("user_photo not between", value1, value2, "userPhoto");
            return (Criteria) this;
        }

        public Criteria andUserSignIsNull() {
            addCriterion("user_sign is null");
            return (Criteria) this;
        }

        public Criteria andUserSignIsNotNull() {
            addCriterion("user_sign is not null");
            return (Criteria) this;
        }

        public Criteria andUserSignEqualTo(String value) {
            addCriterion("user_sign =", value, "userSign");
            return (Criteria) this;
        }

        public Criteria andUserSignNotEqualTo(String value) {
            addCriterion("user_sign <>", value, "userSign");
            return (Criteria) this;
        }

        public Criteria andUserSignGreaterThan(String value) {
            addCriterion("user_sign >", value, "userSign");
            return (Criteria) this;
        }

        public Criteria andUserSignGreaterThanOrEqualTo(String value) {
            addCriterion("user_sign >=", value, "userSign");
            return (Criteria) this;
        }

        public Criteria andUserSignLessThan(String value) {
            addCriterion("user_sign <", value, "userSign");
            return (Criteria) this;
        }

        public Criteria andUserSignLessThanOrEqualTo(String value) {
            addCriterion("user_sign <=", value, "userSign");
            return (Criteria) this;
        }

        public Criteria andUserSignLike(String value) {
            addCriterion("user_sign like", value, "userSign");
            return (Criteria) this;
        }

        public Criteria andUserSignNotLike(String value) {
            addCriterion("user_sign not like", value, "userSign");
            return (Criteria) this;
        }

        public Criteria andUserSignIn(List<String> values) {
            addCriterion("user_sign in", values, "userSign");
            return (Criteria) this;
        }

        public Criteria andUserSignNotIn(List<String> values) {
            addCriterion("user_sign not in", values, "userSign");
            return (Criteria) this;
        }

        public Criteria andUserSignBetween(String value1, String value2) {
            addCriterion("user_sign between", value1, value2, "userSign");
            return (Criteria) this;
        }

        public Criteria andUserSignNotBetween(String value1, String value2) {
            addCriterion("user_sign not between", value1, value2, "userSign");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sys_user
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
     * This class corresponds to the database table sys_user
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