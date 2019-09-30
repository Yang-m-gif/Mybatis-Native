package com.slk.wph.module.CUS_Price.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CusPriceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CusPriceExample() {
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andHospitalFeesIsNull() {
            addCriterion("hospital_fees is null");
            return (Criteria) this;
        }

        public Criteria andHospitalFeesIsNotNull() {
            addCriterion("hospital_fees is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalFeesEqualTo(String value) {
            addCriterion("hospital_fees =", value, "hospitalFees");
            return (Criteria) this;
        }

        public Criteria andHospitalFeesNotEqualTo(String value) {
            addCriterion("hospital_fees <>", value, "hospitalFees");
            return (Criteria) this;
        }

        public Criteria andHospitalFeesGreaterThan(String value) {
            addCriterion("hospital_fees >", value, "hospitalFees");
            return (Criteria) this;
        }

        public Criteria andHospitalFeesGreaterThanOrEqualTo(String value) {
            addCriterion("hospital_fees >=", value, "hospitalFees");
            return (Criteria) this;
        }

        public Criteria andHospitalFeesLessThan(String value) {
            addCriterion("hospital_fees <", value, "hospitalFees");
            return (Criteria) this;
        }

        public Criteria andHospitalFeesLessThanOrEqualTo(String value) {
            addCriterion("hospital_fees <=", value, "hospitalFees");
            return (Criteria) this;
        }

        public Criteria andHospitalFeesLike(String value) {
            addCriterion("hospital_fees like", value, "hospitalFees");
            return (Criteria) this;
        }

        public Criteria andHospitalFeesNotLike(String value) {
            addCriterion("hospital_fees not like", value, "hospitalFees");
            return (Criteria) this;
        }

        public Criteria andHospitalFeesIn(List<String> values) {
            addCriterion("hospital_fees in", values, "hospitalFees");
            return (Criteria) this;
        }

        public Criteria andHospitalFeesNotIn(List<String> values) {
            addCriterion("hospital_fees not in", values, "hospitalFees");
            return (Criteria) this;
        }

        public Criteria andHospitalFeesBetween(String value1, String value2) {
            addCriterion("hospital_fees between", value1, value2, "hospitalFees");
            return (Criteria) this;
        }

        public Criteria andHospitalFeesNotBetween(String value1, String value2) {
            addCriterion("hospital_fees not between", value1, value2, "hospitalFees");
            return (Criteria) this;
        }

        public Criteria andCopy1IsNull() {
            addCriterion("copy_1 is null");
            return (Criteria) this;
        }

        public Criteria andCopy1IsNotNull() {
            addCriterion("copy_1 is not null");
            return (Criteria) this;
        }

        public Criteria andCopy1EqualTo(Double value) {
            addCriterion("copy_1 =", value, "copy1");
            return (Criteria) this;
        }

        public Criteria andCopy1NotEqualTo(Double value) {
            addCriterion("copy_1 <>", value, "copy1");
            return (Criteria) this;
        }

        public Criteria andCopy1GreaterThan(Double value) {
            addCriterion("copy_1 >", value, "copy1");
            return (Criteria) this;
        }

        public Criteria andCopy1GreaterThanOrEqualTo(Double value) {
            addCriterion("copy_1 >=", value, "copy1");
            return (Criteria) this;
        }

        public Criteria andCopy1LessThan(Double value) {
            addCriterion("copy_1 <", value, "copy1");
            return (Criteria) this;
        }

        public Criteria andCopy1LessThanOrEqualTo(Double value) {
            addCriterion("copy_1 <=", value, "copy1");
            return (Criteria) this;
        }

        public Criteria andCopy1In(List<Double> values) {
            addCriterion("copy_1 in", values, "copy1");
            return (Criteria) this;
        }

        public Criteria andCopy1NotIn(List<Double> values) {
            addCriterion("copy_1 not in", values, "copy1");
            return (Criteria) this;
        }

        public Criteria andCopy1Between(Double value1, Double value2) {
            addCriterion("copy_1 between", value1, value2, "copy1");
            return (Criteria) this;
        }

        public Criteria andCopy1NotBetween(Double value1, Double value2) {
            addCriterion("copy_1 not between", value1, value2, "copy1");
            return (Criteria) this;
        }

        public Criteria andCopy2IsNull() {
            addCriterion("copy_2 is null");
            return (Criteria) this;
        }

        public Criteria andCopy2IsNotNull() {
            addCriterion("copy_2 is not null");
            return (Criteria) this;
        }

        public Criteria andCopy2EqualTo(Double value) {
            addCriterion("copy_2 =", value, "copy2");
            return (Criteria) this;
        }

        public Criteria andCopy2NotEqualTo(Double value) {
            addCriterion("copy_2 <>", value, "copy2");
            return (Criteria) this;
        }

        public Criteria andCopy2GreaterThan(Double value) {
            addCriterion("copy_2 >", value, "copy2");
            return (Criteria) this;
        }

        public Criteria andCopy2GreaterThanOrEqualTo(Double value) {
            addCriterion("copy_2 >=", value, "copy2");
            return (Criteria) this;
        }

        public Criteria andCopy2LessThan(Double value) {
            addCriterion("copy_2 <", value, "copy2");
            return (Criteria) this;
        }

        public Criteria andCopy2LessThanOrEqualTo(Double value) {
            addCriterion("copy_2 <=", value, "copy2");
            return (Criteria) this;
        }

        public Criteria andCopy2In(List<Double> values) {
            addCriterion("copy_2 in", values, "copy2");
            return (Criteria) this;
        }

        public Criteria andCopy2NotIn(List<Double> values) {
            addCriterion("copy_2 not in", values, "copy2");
            return (Criteria) this;
        }

        public Criteria andCopy2Between(Double value1, Double value2) {
            addCriterion("copy_2 between", value1, value2, "copy2");
            return (Criteria) this;
        }

        public Criteria andCopy2NotBetween(Double value1, Double value2) {
            addCriterion("copy_2 not between", value1, value2, "copy2");
            return (Criteria) this;
        }

        public Criteria andCopy3IsNull() {
            addCriterion("copy_3 is null");
            return (Criteria) this;
        }

        public Criteria andCopy3IsNotNull() {
            addCriterion("copy_3 is not null");
            return (Criteria) this;
        }

        public Criteria andCopy3EqualTo(Double value) {
            addCriterion("copy_3 =", value, "copy3");
            return (Criteria) this;
        }

        public Criteria andCopy3NotEqualTo(Double value) {
            addCriterion("copy_3 <>", value, "copy3");
            return (Criteria) this;
        }

        public Criteria andCopy3GreaterThan(Double value) {
            addCriterion("copy_3 >", value, "copy3");
            return (Criteria) this;
        }

        public Criteria andCopy3GreaterThanOrEqualTo(Double value) {
            addCriterion("copy_3 >=", value, "copy3");
            return (Criteria) this;
        }

        public Criteria andCopy3LessThan(Double value) {
            addCriterion("copy_3 <", value, "copy3");
            return (Criteria) this;
        }

        public Criteria andCopy3LessThanOrEqualTo(Double value) {
            addCriterion("copy_3 <=", value, "copy3");
            return (Criteria) this;
        }

        public Criteria andCopy3In(List<Double> values) {
            addCriterion("copy_3 in", values, "copy3");
            return (Criteria) this;
        }

        public Criteria andCopy3NotIn(List<Double> values) {
            addCriterion("copy_3 not in", values, "copy3");
            return (Criteria) this;
        }

        public Criteria andCopy3Between(Double value1, Double value2) {
            addCriterion("copy_3 between", value1, value2, "copy3");
            return (Criteria) this;
        }

        public Criteria andCopy3NotBetween(Double value1, Double value2) {
            addCriterion("copy_3 not between", value1, value2, "copy3");
            return (Criteria) this;
        }

        public Criteria andCopy4IsNull() {
            addCriterion("copy_4 is null");
            return (Criteria) this;
        }

        public Criteria andCopy4IsNotNull() {
            addCriterion("copy_4 is not null");
            return (Criteria) this;
        }

        public Criteria andCopy4EqualTo(Double value) {
            addCriterion("copy_4 =", value, "copy4");
            return (Criteria) this;
        }

        public Criteria andCopy4NotEqualTo(Double value) {
            addCriterion("copy_4 <>", value, "copy4");
            return (Criteria) this;
        }

        public Criteria andCopy4GreaterThan(Double value) {
            addCriterion("copy_4 >", value, "copy4");
            return (Criteria) this;
        }

        public Criteria andCopy4GreaterThanOrEqualTo(Double value) {
            addCriterion("copy_4 >=", value, "copy4");
            return (Criteria) this;
        }

        public Criteria andCopy4LessThan(Double value) {
            addCriterion("copy_4 <", value, "copy4");
            return (Criteria) this;
        }

        public Criteria andCopy4LessThanOrEqualTo(Double value) {
            addCriterion("copy_4 <=", value, "copy4");
            return (Criteria) this;
        }

        public Criteria andCopy4In(List<Double> values) {
            addCriterion("copy_4 in", values, "copy4");
            return (Criteria) this;
        }

        public Criteria andCopy4NotIn(List<Double> values) {
            addCriterion("copy_4 not in", values, "copy4");
            return (Criteria) this;
        }

        public Criteria andCopy4Between(Double value1, Double value2) {
            addCriterion("copy_4 between", value1, value2, "copy4");
            return (Criteria) this;
        }

        public Criteria andCopy4NotBetween(Double value1, Double value2) {
            addCriterion("copy_4 not between", value1, value2, "copy4");
            return (Criteria) this;
        }

        public Criteria andCopy5IsNull() {
            addCriterion("copy_5 is null");
            return (Criteria) this;
        }

        public Criteria andCopy5IsNotNull() {
            addCriterion("copy_5 is not null");
            return (Criteria) this;
        }

        public Criteria andCopy5EqualTo(Double value) {
            addCriterion("copy_5 =", value, "copy5");
            return (Criteria) this;
        }

        public Criteria andCopy5NotEqualTo(Double value) {
            addCriterion("copy_5 <>", value, "copy5");
            return (Criteria) this;
        }

        public Criteria andCopy5GreaterThan(Double value) {
            addCriterion("copy_5 >", value, "copy5");
            return (Criteria) this;
        }

        public Criteria andCopy5GreaterThanOrEqualTo(Double value) {
            addCriterion("copy_5 >=", value, "copy5");
            return (Criteria) this;
        }

        public Criteria andCopy5LessThan(Double value) {
            addCriterion("copy_5 <", value, "copy5");
            return (Criteria) this;
        }

        public Criteria andCopy5LessThanOrEqualTo(Double value) {
            addCriterion("copy_5 <=", value, "copy5");
            return (Criteria) this;
        }

        public Criteria andCopy5In(List<Double> values) {
            addCriterion("copy_5 in", values, "copy5");
            return (Criteria) this;
        }

        public Criteria andCopy5NotIn(List<Double> values) {
            addCriterion("copy_5 not in", values, "copy5");
            return (Criteria) this;
        }

        public Criteria andCopy5Between(Double value1, Double value2) {
            addCriterion("copy_5 between", value1, value2, "copy5");
            return (Criteria) this;
        }

        public Criteria andCopy5NotBetween(Double value1, Double value2) {
            addCriterion("copy_5 not between", value1, value2, "copy5");
            return (Criteria) this;
        }

        public Criteria andCopyGt5IsNull() {
            addCriterion("copy_gt5 is null");
            return (Criteria) this;
        }

        public Criteria andCopyGt5IsNotNull() {
            addCriterion("copy_gt5 is not null");
            return (Criteria) this;
        }

        public Criteria andCopyGt5EqualTo(Double value) {
            addCriterion("copy_gt5 =", value, "copyGt5");
            return (Criteria) this;
        }

        public Criteria andCopyGt5NotEqualTo(Double value) {
            addCriterion("copy_gt5 <>", value, "copyGt5");
            return (Criteria) this;
        }

        public Criteria andCopyGt5GreaterThan(Double value) {
            addCriterion("copy_gt5 >", value, "copyGt5");
            return (Criteria) this;
        }

        public Criteria andCopyGt5GreaterThanOrEqualTo(Double value) {
            addCriterion("copy_gt5 >=", value, "copyGt5");
            return (Criteria) this;
        }

        public Criteria andCopyGt5LessThan(Double value) {
            addCriterion("copy_gt5 <", value, "copyGt5");
            return (Criteria) this;
        }

        public Criteria andCopyGt5LessThanOrEqualTo(Double value) {
            addCriterion("copy_gt5 <=", value, "copyGt5");
            return (Criteria) this;
        }

        public Criteria andCopyGt5In(List<Double> values) {
            addCriterion("copy_gt5 in", values, "copyGt5");
            return (Criteria) this;
        }

        public Criteria andCopyGt5NotIn(List<Double> values) {
            addCriterion("copy_gt5 not in", values, "copyGt5");
            return (Criteria) this;
        }

        public Criteria andCopyGt5Between(Double value1, Double value2) {
            addCriterion("copy_gt5 between", value1, value2, "copyGt5");
            return (Criteria) this;
        }

        public Criteria andCopyGt5NotBetween(Double value1, Double value2) {
            addCriterion("copy_gt5 not between", value1, value2, "copyGt5");
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