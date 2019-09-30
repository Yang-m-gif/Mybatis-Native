package com.slk.wph.module.CUS_Ward.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CusWardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CusWardExample() {
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

        public Criteria andWphUserFidIsNull() {
            addCriterion("wph_user_fid is null");
            return (Criteria) this;
        }

        public Criteria andWphUserFidIsNotNull() {
            addCriterion("wph_user_fid is not null");
            return (Criteria) this;
        }

        public Criteria andWphUserFidEqualTo(Integer value) {
            addCriterion("wph_user_fid =", value, "wphUserFid");
            return (Criteria) this;
        }

        public Criteria andWphUserFidNotEqualTo(Integer value) {
            addCriterion("wph_user_fid <>", value, "wphUserFid");
            return (Criteria) this;
        }

        public Criteria andWphUserFidGreaterThan(Integer value) {
            addCriterion("wph_user_fid >", value, "wphUserFid");
            return (Criteria) this;
        }

        public Criteria andWphUserFidGreaterThanOrEqualTo(Integer value) {
            addCriterion("wph_user_fid >=", value, "wphUserFid");
            return (Criteria) this;
        }

        public Criteria andWphUserFidLessThan(Integer value) {
            addCriterion("wph_user_fid <", value, "wphUserFid");
            return (Criteria) this;
        }

        public Criteria andWphUserFidLessThanOrEqualTo(Integer value) {
            addCriterion("wph_user_fid <=", value, "wphUserFid");
            return (Criteria) this;
        }

        public Criteria andWphUserFidIn(List<Integer> values) {
            addCriterion("wph_user_fid in", values, "wphUserFid");
            return (Criteria) this;
        }

        public Criteria andWphUserFidNotIn(List<Integer> values) {
            addCriterion("wph_user_fid not in", values, "wphUserFid");
            return (Criteria) this;
        }

        public Criteria andWphUserFidBetween(Integer value1, Integer value2) {
            addCriterion("wph_user_fid between", value1, value2, "wphUserFid");
            return (Criteria) this;
        }

        public Criteria andWphUserFidNotBetween(Integer value1, Integer value2) {
            addCriterion("wph_user_fid not between", value1, value2, "wphUserFid");
            return (Criteria) this;
        }

        public Criteria andWphRoleFidIsNull() {
            addCriterion("wph_role_fid is null");
            return (Criteria) this;
        }

        public Criteria andWphRoleFidIsNotNull() {
            addCriterion("wph_role_fid is not null");
            return (Criteria) this;
        }

        public Criteria andWphRoleFidEqualTo(Integer value) {
            addCriterion("wph_role_fid =", value, "wphRoleFid");
            return (Criteria) this;
        }

        public Criteria andWphRoleFidNotEqualTo(Integer value) {
            addCriterion("wph_role_fid <>", value, "wphRoleFid");
            return (Criteria) this;
        }

        public Criteria andWphRoleFidGreaterThan(Integer value) {
            addCriterion("wph_role_fid >", value, "wphRoleFid");
            return (Criteria) this;
        }

        public Criteria andWphRoleFidGreaterThanOrEqualTo(Integer value) {
            addCriterion("wph_role_fid >=", value, "wphRoleFid");
            return (Criteria) this;
        }

        public Criteria andWphRoleFidLessThan(Integer value) {
            addCriterion("wph_role_fid <", value, "wphRoleFid");
            return (Criteria) this;
        }

        public Criteria andWphRoleFidLessThanOrEqualTo(Integer value) {
            addCriterion("wph_role_fid <=", value, "wphRoleFid");
            return (Criteria) this;
        }

        public Criteria andWphRoleFidIn(List<Integer> values) {
            addCriterion("wph_role_fid in", values, "wphRoleFid");
            return (Criteria) this;
        }

        public Criteria andWphRoleFidNotIn(List<Integer> values) {
            addCriterion("wph_role_fid not in", values, "wphRoleFid");
            return (Criteria) this;
        }

        public Criteria andWphRoleFidBetween(Integer value1, Integer value2) {
            addCriterion("wph_role_fid between", value1, value2, "wphRoleFid");
            return (Criteria) this;
        }

        public Criteria andWphRoleFidNotBetween(Integer value1, Integer value2) {
            addCriterion("wph_role_fid not between", value1, value2, "wphRoleFid");
            return (Criteria) this;
        }

        public Criteria andWardfidsIsNull() {
            addCriterion("wardfids is null");
            return (Criteria) this;
        }

        public Criteria andWardfidsIsNotNull() {
            addCriterion("wardfids is not null");
            return (Criteria) this;
        }

        public Criteria andWardfidsEqualTo(String value) {
            addCriterion("wardfids =", value, "wardfids");
            return (Criteria) this;
        }

        public Criteria andWardfidsNotEqualTo(String value) {
            addCriterion("wardfids <>", value, "wardfids");
            return (Criteria) this;
        }

        public Criteria andWardfidsGreaterThan(String value) {
            addCriterion("wardfids >", value, "wardfids");
            return (Criteria) this;
        }

        public Criteria andWardfidsGreaterThanOrEqualTo(String value) {
            addCriterion("wardfids >=", value, "wardfids");
            return (Criteria) this;
        }

        public Criteria andWardfidsLessThan(String value) {
            addCriterion("wardfids <", value, "wardfids");
            return (Criteria) this;
        }

        public Criteria andWardfidsLessThanOrEqualTo(String value) {
            addCriterion("wardfids <=", value, "wardfids");
            return (Criteria) this;
        }

        public Criteria andWardfidsLike(String value) {
            addCriterion("wardfids like", value, "wardfids");
            return (Criteria) this;
        }

        public Criteria andWardfidsNotLike(String value) {
            addCriterion("wardfids not like", value, "wardfids");
            return (Criteria) this;
        }

        public Criteria andWardfidsIn(List<String> values) {
            addCriterion("wardfids in", values, "wardfids");
            return (Criteria) this;
        }

        public Criteria andWardfidsNotIn(List<String> values) {
            addCriterion("wardfids not in", values, "wardfids");
            return (Criteria) this;
        }

        public Criteria andWardfidsBetween(String value1, String value2) {
            addCriterion("wardfids between", value1, value2, "wardfids");
            return (Criteria) this;
        }

        public Criteria andWardfidsNotBetween(String value1, String value2) {
            addCriterion("wardfids not between", value1, value2, "wardfids");
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