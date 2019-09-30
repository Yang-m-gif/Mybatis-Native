package com.slk.wph.module.CUS_Setting_Todo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CusSettingTodoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CusSettingTodoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
        }

        public Criteria andFidIsNull() {
            addCriterion("fid is null");
            return (Criteria) this;
        }

        public Criteria andFidIsNotNull() {
            addCriterion("fid is not null");
            return (Criteria) this;
        }

        public Criteria andFidEqualTo(Integer value) {
            addCriterion("fid =", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotEqualTo(Integer value) {
            addCriterion("fid <>", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThan(Integer value) {
            addCriterion("fid >", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fid >=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThan(Integer value) {
            addCriterion("fid <", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThanOrEqualTo(Integer value) {
            addCriterion("fid <=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidIn(List<Integer> values) {
            addCriterion("fid in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotIn(List<Integer> values) {
            addCriterion("fid not in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidBetween(Integer value1, Integer value2) {
            addCriterion("fid between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotBetween(Integer value1, Integer value2) {
            addCriterion("fid not between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andPatientTypeIsNull() {
            addCriterion("patient_type is null");
            return (Criteria) this;
        }

        public Criteria andPatientTypeIsNotNull() {
            addCriterion("patient_type is not null");
            return (Criteria) this;
        }

        public Criteria andPatientTypeEqualTo(Integer value) {
            addCriterion("patient_type =", value, "patientType");
            return (Criteria) this;
        }

        public Criteria andPatientTypeNotEqualTo(Integer value) {
            addCriterion("patient_type <>", value, "patientType");
            return (Criteria) this;
        }

        public Criteria andPatientTypeGreaterThan(Integer value) {
            addCriterion("patient_type >", value, "patientType");
            return (Criteria) this;
        }

        public Criteria andPatientTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("patient_type >=", value, "patientType");
            return (Criteria) this;
        }

        public Criteria andPatientTypeLessThan(Integer value) {
            addCriterion("patient_type <", value, "patientType");
            return (Criteria) this;
        }

        public Criteria andPatientTypeLessThanOrEqualTo(Integer value) {
            addCriterion("patient_type <=", value, "patientType");
            return (Criteria) this;
        }

        public Criteria andPatientTypeIn(List<Integer> values) {
            addCriterion("patient_type in", values, "patientType");
            return (Criteria) this;
        }

        public Criteria andPatientTypeNotIn(List<Integer> values) {
            addCriterion("patient_type not in", values, "patientType");
            return (Criteria) this;
        }

        public Criteria andPatientTypeBetween(Integer value1, Integer value2) {
            addCriterion("patient_type between", value1, value2, "patientType");
            return (Criteria) this;
        }

        public Criteria andPatientTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("patient_type not between", value1, value2, "patientType");
            return (Criteria) this;
        }

        public Criteria andCountLimitIsNull() {
            addCriterion("count_limit is null");
            return (Criteria) this;
        }

        public Criteria andCountLimitIsNotNull() {
            addCriterion("count_limit is not null");
            return (Criteria) this;
        }

        public Criteria andCountLimitEqualTo(Integer value) {
            addCriterion("count_limit =", value, "countLimit");
            return (Criteria) this;
        }

        public Criteria andCountLimitNotEqualTo(Integer value) {
            addCriterion("count_limit <>", value, "countLimit");
            return (Criteria) this;
        }

        public Criteria andCountLimitGreaterThan(Integer value) {
            addCriterion("count_limit >", value, "countLimit");
            return (Criteria) this;
        }

        public Criteria andCountLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("count_limit >=", value, "countLimit");
            return (Criteria) this;
        }

        public Criteria andCountLimitLessThan(Integer value) {
            addCriterion("count_limit <", value, "countLimit");
            return (Criteria) this;
        }

        public Criteria andCountLimitLessThanOrEqualTo(Integer value) {
            addCriterion("count_limit <=", value, "countLimit");
            return (Criteria) this;
        }

        public Criteria andCountLimitIn(List<Integer> values) {
            addCriterion("count_limit in", values, "countLimit");
            return (Criteria) this;
        }

        public Criteria andCountLimitNotIn(List<Integer> values) {
            addCriterion("count_limit not in", values, "countLimit");
            return (Criteria) this;
        }

        public Criteria andCountLimitBetween(Integer value1, Integer value2) {
            addCriterion("count_limit between", value1, value2, "countLimit");
            return (Criteria) this;
        }

        public Criteria andCountLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("count_limit not between", value1, value2, "countLimit");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("starttime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("starttime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterionForJDBCTime("starttime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("starttime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterionForJDBCTime("starttime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("starttime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterionForJDBCTime("starttime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("starttime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterionForJDBCTime("starttime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("starttime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("starttime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("starttime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endtime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endtime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterionForJDBCTime("endtime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("endtime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterionForJDBCTime("endtime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("endtime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterionForJDBCTime("endtime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("endtime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterionForJDBCTime("endtime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("endtime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("endtime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("endtime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andModifyUserfidIsNull() {
            addCriterion("modify_userfid is null");
            return (Criteria) this;
        }

        public Criteria andModifyUserfidIsNotNull() {
            addCriterion("modify_userfid is not null");
            return (Criteria) this;
        }

        public Criteria andModifyUserfidEqualTo(Integer value) {
            addCriterion("modify_userfid =", value, "modifyUserfid");
            return (Criteria) this;
        }

        public Criteria andModifyUserfidNotEqualTo(Integer value) {
            addCriterion("modify_userfid <>", value, "modifyUserfid");
            return (Criteria) this;
        }

        public Criteria andModifyUserfidGreaterThan(Integer value) {
            addCriterion("modify_userfid >", value, "modifyUserfid");
            return (Criteria) this;
        }

        public Criteria andModifyUserfidGreaterThanOrEqualTo(Integer value) {
            addCriterion("modify_userfid >=", value, "modifyUserfid");
            return (Criteria) this;
        }

        public Criteria andModifyUserfidLessThan(Integer value) {
            addCriterion("modify_userfid <", value, "modifyUserfid");
            return (Criteria) this;
        }

        public Criteria andModifyUserfidLessThanOrEqualTo(Integer value) {
            addCriterion("modify_userfid <=", value, "modifyUserfid");
            return (Criteria) this;
        }

        public Criteria andModifyUserfidIn(List<Integer> values) {
            addCriterion("modify_userfid in", values, "modifyUserfid");
            return (Criteria) this;
        }

        public Criteria andModifyUserfidNotIn(List<Integer> values) {
            addCriterion("modify_userfid not in", values, "modifyUserfid");
            return (Criteria) this;
        }

        public Criteria andModifyUserfidBetween(Integer value1, Integer value2) {
            addCriterion("modify_userfid between", value1, value2, "modifyUserfid");
            return (Criteria) this;
        }

        public Criteria andModifyUserfidNotBetween(Integer value1, Integer value2) {
            addCriterion("modify_userfid not between", value1, value2, "modifyUserfid");
            return (Criteria) this;
        }

        public Criteria andModifynameIsNull() {
            addCriterion("modifyname is null");
            return (Criteria) this;
        }

        public Criteria andModifynameIsNotNull() {
            addCriterion("modifyname is not null");
            return (Criteria) this;
        }

        public Criteria andModifynameEqualTo(String value) {
            addCriterion("modifyname =", value, "modifyname");
            return (Criteria) this;
        }

        public Criteria andModifynameNotEqualTo(String value) {
            addCriterion("modifyname <>", value, "modifyname");
            return (Criteria) this;
        }

        public Criteria andModifynameGreaterThan(String value) {
            addCriterion("modifyname >", value, "modifyname");
            return (Criteria) this;
        }

        public Criteria andModifynameGreaterThanOrEqualTo(String value) {
            addCriterion("modifyname >=", value, "modifyname");
            return (Criteria) this;
        }

        public Criteria andModifynameLessThan(String value) {
            addCriterion("modifyname <", value, "modifyname");
            return (Criteria) this;
        }

        public Criteria andModifynameLessThanOrEqualTo(String value) {
            addCriterion("modifyname <=", value, "modifyname");
            return (Criteria) this;
        }

        public Criteria andModifynameLike(String value) {
            addCriterion("modifyname like", value, "modifyname");
            return (Criteria) this;
        }

        public Criteria andModifynameNotLike(String value) {
            addCriterion("modifyname not like", value, "modifyname");
            return (Criteria) this;
        }

        public Criteria andModifynameIn(List<String> values) {
            addCriterion("modifyname in", values, "modifyname");
            return (Criteria) this;
        }

        public Criteria andModifynameNotIn(List<String> values) {
            addCriterion("modifyname not in", values, "modifyname");
            return (Criteria) this;
        }

        public Criteria andModifynameBetween(String value1, String value2) {
            addCriterion("modifyname between", value1, value2, "modifyname");
            return (Criteria) this;
        }

        public Criteria andModifynameNotBetween(String value1, String value2) {
            addCriterion("modifyname not between", value1, value2, "modifyname");
            return (Criteria) this;
        }

        public Criteria andModifydateIsNull() {
            addCriterion("modifydate is null");
            return (Criteria) this;
        }

        public Criteria andModifydateIsNotNull() {
            addCriterion("modifydate is not null");
            return (Criteria) this;
        }

        public Criteria andModifydateEqualTo(Date value) {
            addCriterion("modifydate =", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotEqualTo(Date value) {
            addCriterion("modifydate <>", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateGreaterThan(Date value) {
            addCriterion("modifydate >", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateGreaterThanOrEqualTo(Date value) {
            addCriterion("modifydate >=", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLessThan(Date value) {
            addCriterion("modifydate <", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLessThanOrEqualTo(Date value) {
            addCriterion("modifydate <=", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateIn(List<Date> values) {
            addCriterion("modifydate in", values, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotIn(List<Date> values) {
            addCriterion("modifydate not in", values, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateBetween(Date value1, Date value2) {
            addCriterion("modifydate between", value1, value2, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotBetween(Date value1, Date value2) {
            addCriterion("modifydate not between", value1, value2, "modifydate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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