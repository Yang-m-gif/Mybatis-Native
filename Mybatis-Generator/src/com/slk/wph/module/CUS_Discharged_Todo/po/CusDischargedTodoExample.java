package com.slk.wph.module.CUS_Discharged_Todo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CusDischargedTodoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CusDischargedTodoExample() {
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

        public Criteria andPatientNameIsNull() {
            addCriterion("patient_name is null");
            return (Criteria) this;
        }

        public Criteria andPatientNameIsNotNull() {
            addCriterion("patient_name is not null");
            return (Criteria) this;
        }

        public Criteria andPatientNameEqualTo(String value) {
            addCriterion("patient_name =", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotEqualTo(String value) {
            addCriterion("patient_name <>", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameGreaterThan(String value) {
            addCriterion("patient_name >", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameGreaterThanOrEqualTo(String value) {
            addCriterion("patient_name >=", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameLessThan(String value) {
            addCriterion("patient_name <", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameLessThanOrEqualTo(String value) {
            addCriterion("patient_name <=", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameLike(String value) {
            addCriterion("patient_name like", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotLike(String value) {
            addCriterion("patient_name not like", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameIn(List<String> values) {
            addCriterion("patient_name in", values, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotIn(List<String> values) {
            addCriterion("patient_name not in", values, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameBetween(String value1, String value2) {
            addCriterion("patient_name between", value1, value2, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotBetween(String value1, String value2) {
            addCriterion("patient_name not between", value1, value2, "patientName");
            return (Criteria) this;
        }

        public Criteria andOrderStateIsNull() {
            addCriterion("order_state is null");
            return (Criteria) this;
        }

        public Criteria andOrderStateIsNotNull() {
            addCriterion("order_state is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStateEqualTo(Integer value) {
            addCriterion("order_state =", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotEqualTo(Integer value) {
            addCriterion("order_state <>", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateGreaterThan(Integer value) {
            addCriterion("order_state >", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_state >=", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLessThan(Integer value) {
            addCriterion("order_state <", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLessThanOrEqualTo(Integer value) {
            addCriterion("order_state <=", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateIn(List<Integer> values) {
            addCriterion("order_state in", values, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotIn(List<Integer> values) {
            addCriterion("order_state not in", values, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateBetween(Integer value1, Integer value2) {
            addCriterion("order_state between", value1, value2, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotBetween(Integer value1, Integer value2) {
            addCriterion("order_state not between", value1, value2, "orderState");
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

        public Criteria andTodoTimeIsNull() {
            addCriterion("todo_time is null");
            return (Criteria) this;
        }

        public Criteria andTodoTimeIsNotNull() {
            addCriterion("todo_time is not null");
            return (Criteria) this;
        }

        public Criteria andTodoTimeEqualTo(Date value) {
            addCriterion("todo_time =", value, "todoTime");
            return (Criteria) this;
        }

        public Criteria andTodoTimeNotEqualTo(Date value) {
            addCriterion("todo_time <>", value, "todoTime");
            return (Criteria) this;
        }

        public Criteria andTodoTimeGreaterThan(Date value) {
            addCriterion("todo_time >", value, "todoTime");
            return (Criteria) this;
        }

        public Criteria andTodoTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("todo_time >=", value, "todoTime");
            return (Criteria) this;
        }

        public Criteria andTodoTimeLessThan(Date value) {
            addCriterion("todo_time <", value, "todoTime");
            return (Criteria) this;
        }

        public Criteria andTodoTimeLessThanOrEqualTo(Date value) {
            addCriterion("todo_time <=", value, "todoTime");
            return (Criteria) this;
        }

        public Criteria andTodoTimeIn(List<Date> values) {
            addCriterion("todo_time in", values, "todoTime");
            return (Criteria) this;
        }

        public Criteria andTodoTimeNotIn(List<Date> values) {
            addCriterion("todo_time not in", values, "todoTime");
            return (Criteria) this;
        }

        public Criteria andTodoTimeBetween(Date value1, Date value2) {
            addCriterion("todo_time between", value1, value2, "todoTime");
            return (Criteria) this;
        }

        public Criteria andTodoTimeNotBetween(Date value1, Date value2) {
            addCriterion("todo_time not between", value1, value2, "todoTime");
            return (Criteria) this;
        }

        public Criteria andWphWardFidIsNull() {
            addCriterion("wph_ward_fid is null");
            return (Criteria) this;
        }

        public Criteria andWphWardFidIsNotNull() {
            addCriterion("wph_ward_fid is not null");
            return (Criteria) this;
        }

        public Criteria andWphWardFidEqualTo(Integer value) {
            addCriterion("wph_ward_fid =", value, "wphWardFid");
            return (Criteria) this;
        }

        public Criteria andWphWardFidNotEqualTo(Integer value) {
            addCriterion("wph_ward_fid <>", value, "wphWardFid");
            return (Criteria) this;
        }

        public Criteria andWphWardFidGreaterThan(Integer value) {
            addCriterion("wph_ward_fid >", value, "wphWardFid");
            return (Criteria) this;
        }

        public Criteria andWphWardFidGreaterThanOrEqualTo(Integer value) {
            addCriterion("wph_ward_fid >=", value, "wphWardFid");
            return (Criteria) this;
        }

        public Criteria andWphWardFidLessThan(Integer value) {
            addCriterion("wph_ward_fid <", value, "wphWardFid");
            return (Criteria) this;
        }

        public Criteria andWphWardFidLessThanOrEqualTo(Integer value) {
            addCriterion("wph_ward_fid <=", value, "wphWardFid");
            return (Criteria) this;
        }

        public Criteria andWphWardFidIn(List<Integer> values) {
            addCriterion("wph_ward_fid in", values, "wphWardFid");
            return (Criteria) this;
        }

        public Criteria andWphWardFidNotIn(List<Integer> values) {
            addCriterion("wph_ward_fid not in", values, "wphWardFid");
            return (Criteria) this;
        }

        public Criteria andWphWardFidBetween(Integer value1, Integer value2) {
            addCriterion("wph_ward_fid between", value1, value2, "wphWardFid");
            return (Criteria) this;
        }

        public Criteria andWphWardFidNotBetween(Integer value1, Integer value2) {
            addCriterion("wph_ward_fid not between", value1, value2, "wphWardFid");
            return (Criteria) this;
        }

        public Criteria andWphWardNameIsNull() {
            addCriterion("wph_ward_name is null");
            return (Criteria) this;
        }

        public Criteria andWphWardNameIsNotNull() {
            addCriterion("wph_ward_name is not null");
            return (Criteria) this;
        }

        public Criteria andWphWardNameEqualTo(String value) {
            addCriterion("wph_ward_name =", value, "wphWardName");
            return (Criteria) this;
        }

        public Criteria andWphWardNameNotEqualTo(String value) {
            addCriterion("wph_ward_name <>", value, "wphWardName");
            return (Criteria) this;
        }

        public Criteria andWphWardNameGreaterThan(String value) {
            addCriterion("wph_ward_name >", value, "wphWardName");
            return (Criteria) this;
        }

        public Criteria andWphWardNameGreaterThanOrEqualTo(String value) {
            addCriterion("wph_ward_name >=", value, "wphWardName");
            return (Criteria) this;
        }

        public Criteria andWphWardNameLessThan(String value) {
            addCriterion("wph_ward_name <", value, "wphWardName");
            return (Criteria) this;
        }

        public Criteria andWphWardNameLessThanOrEqualTo(String value) {
            addCriterion("wph_ward_name <=", value, "wphWardName");
            return (Criteria) this;
        }

        public Criteria andWphWardNameLike(String value) {
            addCriterion("wph_ward_name like", value, "wphWardName");
            return (Criteria) this;
        }

        public Criteria andWphWardNameNotLike(String value) {
            addCriterion("wph_ward_name not like", value, "wphWardName");
            return (Criteria) this;
        }

        public Criteria andWphWardNameIn(List<String> values) {
            addCriterion("wph_ward_name in", values, "wphWardName");
            return (Criteria) this;
        }

        public Criteria andWphWardNameNotIn(List<String> values) {
            addCriterion("wph_ward_name not in", values, "wphWardName");
            return (Criteria) this;
        }

        public Criteria andWphWardNameBetween(String value1, String value2) {
            addCriterion("wph_ward_name between", value1, value2, "wphWardName");
            return (Criteria) this;
        }

        public Criteria andWphWardNameNotBetween(String value1, String value2) {
            addCriterion("wph_ward_name not between", value1, value2, "wphWardName");
            return (Criteria) this;
        }

        public Criteria andHospitalidIsNull() {
            addCriterion("hospitalid is null");
            return (Criteria) this;
        }

        public Criteria andHospitalidIsNotNull() {
            addCriterion("hospitalid is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalidEqualTo(String value) {
            addCriterion("hospitalid =", value, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalidNotEqualTo(String value) {
            addCriterion("hospitalid <>", value, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalidGreaterThan(String value) {
            addCriterion("hospitalid >", value, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalidGreaterThanOrEqualTo(String value) {
            addCriterion("hospitalid >=", value, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalidLessThan(String value) {
            addCriterion("hospitalid <", value, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalidLessThanOrEqualTo(String value) {
            addCriterion("hospitalid <=", value, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalidLike(String value) {
            addCriterion("hospitalid like", value, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalidNotLike(String value) {
            addCriterion("hospitalid not like", value, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalidIn(List<String> values) {
            addCriterion("hospitalid in", values, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalidNotIn(List<String> values) {
            addCriterion("hospitalid not in", values, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalidBetween(String value1, String value2) {
            addCriterion("hospitalid between", value1, value2, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalidNotBetween(String value1, String value2) {
            addCriterion("hospitalid not between", value1, value2, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andBednoIsNull() {
            addCriterion("bedno is null");
            return (Criteria) this;
        }

        public Criteria andBednoIsNotNull() {
            addCriterion("bedno is not null");
            return (Criteria) this;
        }

        public Criteria andBednoEqualTo(String value) {
            addCriterion("bedno =", value, "bedno");
            return (Criteria) this;
        }

        public Criteria andBednoNotEqualTo(String value) {
            addCriterion("bedno <>", value, "bedno");
            return (Criteria) this;
        }

        public Criteria andBednoGreaterThan(String value) {
            addCriterion("bedno >", value, "bedno");
            return (Criteria) this;
        }

        public Criteria andBednoGreaterThanOrEqualTo(String value) {
            addCriterion("bedno >=", value, "bedno");
            return (Criteria) this;
        }

        public Criteria andBednoLessThan(String value) {
            addCriterion("bedno <", value, "bedno");
            return (Criteria) this;
        }

        public Criteria andBednoLessThanOrEqualTo(String value) {
            addCriterion("bedno <=", value, "bedno");
            return (Criteria) this;
        }

        public Criteria andBednoLike(String value) {
            addCriterion("bedno like", value, "bedno");
            return (Criteria) this;
        }

        public Criteria andBednoNotLike(String value) {
            addCriterion("bedno not like", value, "bedno");
            return (Criteria) this;
        }

        public Criteria andBednoIn(List<String> values) {
            addCriterion("bedno in", values, "bedno");
            return (Criteria) this;
        }

        public Criteria andBednoNotIn(List<String> values) {
            addCriterion("bedno not in", values, "bedno");
            return (Criteria) this;
        }

        public Criteria andBednoBetween(String value1, String value2) {
            addCriterion("bedno between", value1, value2, "bedno");
            return (Criteria) this;
        }

        public Criteria andBednoNotBetween(String value1, String value2) {
            addCriterion("bedno not between", value1, value2, "bedno");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andCusPatientIdIsNull() {
            addCriterion("cus_patient_id is null");
            return (Criteria) this;
        }

        public Criteria andCusPatientIdIsNotNull() {
            addCriterion("cus_patient_id is not null");
            return (Criteria) this;
        }

        public Criteria andCusPatientIdEqualTo(Integer value) {
            addCriterion("cus_patient_id =", value, "cusPatientId");
            return (Criteria) this;
        }

        public Criteria andCusPatientIdNotEqualTo(Integer value) {
            addCriterion("cus_patient_id <>", value, "cusPatientId");
            return (Criteria) this;
        }

        public Criteria andCusPatientIdGreaterThan(Integer value) {
            addCriterion("cus_patient_id >", value, "cusPatientId");
            return (Criteria) this;
        }

        public Criteria andCusPatientIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cus_patient_id >=", value, "cusPatientId");
            return (Criteria) this;
        }

        public Criteria andCusPatientIdLessThan(Integer value) {
            addCriterion("cus_patient_id <", value, "cusPatientId");
            return (Criteria) this;
        }

        public Criteria andCusPatientIdLessThanOrEqualTo(Integer value) {
            addCriterion("cus_patient_id <=", value, "cusPatientId");
            return (Criteria) this;
        }

        public Criteria andCusPatientIdIn(List<Integer> values) {
            addCriterion("cus_patient_id in", values, "cusPatientId");
            return (Criteria) this;
        }

        public Criteria andCusPatientIdNotIn(List<Integer> values) {
            addCriterion("cus_patient_id not in", values, "cusPatientId");
            return (Criteria) this;
        }

        public Criteria andCusPatientIdBetween(Integer value1, Integer value2) {
            addCriterion("cus_patient_id between", value1, value2, "cusPatientId");
            return (Criteria) this;
        }

        public Criteria andCusPatientIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cus_patient_id not between", value1, value2, "cusPatientId");
            return (Criteria) this;
        }

        public Criteria andAppointTimeIsNull() {
            addCriterion("appoint_time is null");
            return (Criteria) this;
        }

        public Criteria andAppointTimeIsNotNull() {
            addCriterion("appoint_time is not null");
            return (Criteria) this;
        }

        public Criteria andAppointTimeEqualTo(Date value) {
            addCriterion("appoint_time =", value, "appointTime");
            return (Criteria) this;
        }

        public Criteria andAppointTimeNotEqualTo(Date value) {
            addCriterion("appoint_time <>", value, "appointTime");
            return (Criteria) this;
        }

        public Criteria andAppointTimeGreaterThan(Date value) {
            addCriterion("appoint_time >", value, "appointTime");
            return (Criteria) this;
        }

        public Criteria andAppointTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("appoint_time >=", value, "appointTime");
            return (Criteria) this;
        }

        public Criteria andAppointTimeLessThan(Date value) {
            addCriterion("appoint_time <", value, "appointTime");
            return (Criteria) this;
        }

        public Criteria andAppointTimeLessThanOrEqualTo(Date value) {
            addCriterion("appoint_time <=", value, "appointTime");
            return (Criteria) this;
        }

        public Criteria andAppointTimeIn(List<Date> values) {
            addCriterion("appoint_time in", values, "appointTime");
            return (Criteria) this;
        }

        public Criteria andAppointTimeNotIn(List<Date> values) {
            addCriterion("appoint_time not in", values, "appointTime");
            return (Criteria) this;
        }

        public Criteria andAppointTimeBetween(Date value1, Date value2) {
            addCriterion("appoint_time between", value1, value2, "appointTime");
            return (Criteria) this;
        }

        public Criteria andAppointTimeNotBetween(Date value1, Date value2) {
            addCriterion("appoint_time not between", value1, value2, "appointTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeIsNull() {
            addCriterion("commit_time is null");
            return (Criteria) this;
        }

        public Criteria andCommitTimeIsNotNull() {
            addCriterion("commit_time is not null");
            return (Criteria) this;
        }

        public Criteria andCommitTimeEqualTo(Date value) {
            addCriterion("commit_time =", value, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeNotEqualTo(Date value) {
            addCriterion("commit_time <>", value, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeGreaterThan(Date value) {
            addCriterion("commit_time >", value, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("commit_time >=", value, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeLessThan(Date value) {
            addCriterion("commit_time <", value, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeLessThanOrEqualTo(Date value) {
            addCriterion("commit_time <=", value, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeIn(List<Date> values) {
            addCriterion("commit_time in", values, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeNotIn(List<Date> values) {
            addCriterion("commit_time not in", values, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeBetween(Date value1, Date value2) {
            addCriterion("commit_time between", value1, value2, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeNotBetween(Date value1, Date value2) {
            addCriterion("commit_time not between", value1, value2, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIsNull() {
            addCriterion("cancel_time is null");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIsNotNull() {
            addCriterion("cancel_time is not null");
            return (Criteria) this;
        }

        public Criteria andCancelTimeEqualTo(Date value) {
            addCriterion("cancel_time =", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotEqualTo(Date value) {
            addCriterion("cancel_time <>", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeGreaterThan(Date value) {
            addCriterion("cancel_time >", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cancel_time >=", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeLessThan(Date value) {
            addCriterion("cancel_time <", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeLessThanOrEqualTo(Date value) {
            addCriterion("cancel_time <=", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIn(List<Date> values) {
            addCriterion("cancel_time in", values, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotIn(List<Date> values) {
            addCriterion("cancel_time not in", values, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeBetween(Date value1, Date value2) {
            addCriterion("cancel_time between", value1, value2, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotBetween(Date value1, Date value2) {
            addCriterion("cancel_time not between", value1, value2, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andChargeTimeIsNull() {
            addCriterion("charge_time is null");
            return (Criteria) this;
        }

        public Criteria andChargeTimeIsNotNull() {
            addCriterion("charge_time is not null");
            return (Criteria) this;
        }

        public Criteria andChargeTimeEqualTo(Date value) {
            addCriterion("charge_time =", value, "chargeTime");
            return (Criteria) this;
        }

        public Criteria andChargeTimeNotEqualTo(Date value) {
            addCriterion("charge_time <>", value, "chargeTime");
            return (Criteria) this;
        }

        public Criteria andChargeTimeGreaterThan(Date value) {
            addCriterion("charge_time >", value, "chargeTime");
            return (Criteria) this;
        }

        public Criteria andChargeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("charge_time >=", value, "chargeTime");
            return (Criteria) this;
        }

        public Criteria andChargeTimeLessThan(Date value) {
            addCriterion("charge_time <", value, "chargeTime");
            return (Criteria) this;
        }

        public Criteria andChargeTimeLessThanOrEqualTo(Date value) {
            addCriterion("charge_time <=", value, "chargeTime");
            return (Criteria) this;
        }

        public Criteria andChargeTimeIn(List<Date> values) {
            addCriterion("charge_time in", values, "chargeTime");
            return (Criteria) this;
        }

        public Criteria andChargeTimeNotIn(List<Date> values) {
            addCriterion("charge_time not in", values, "chargeTime");
            return (Criteria) this;
        }

        public Criteria andChargeTimeBetween(Date value1, Date value2) {
            addCriterion("charge_time between", value1, value2, "chargeTime");
            return (Criteria) this;
        }

        public Criteria andChargeTimeNotBetween(Date value1, Date value2) {
            addCriterion("charge_time not between", value1, value2, "chargeTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeIsNull() {
            addCriterion("handle_time is null");
            return (Criteria) this;
        }

        public Criteria andHandleTimeIsNotNull() {
            addCriterion("handle_time is not null");
            return (Criteria) this;
        }

        public Criteria andHandleTimeEqualTo(Date value) {
            addCriterion("handle_time =", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeNotEqualTo(Date value) {
            addCriterion("handle_time <>", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeGreaterThan(Date value) {
            addCriterion("handle_time >", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("handle_time >=", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeLessThan(Date value) {
            addCriterion("handle_time <", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeLessThanOrEqualTo(Date value) {
            addCriterion("handle_time <=", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeIn(List<Date> values) {
            addCriterion("handle_time in", values, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeNotIn(List<Date> values) {
            addCriterion("handle_time not in", values, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeBetween(Date value1, Date value2) {
            addCriterion("handle_time between", value1, value2, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeNotBetween(Date value1, Date value2) {
            addCriterion("handle_time not between", value1, value2, "handleTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeIsNull() {
            addCriterion("refund_time is null");
            return (Criteria) this;
        }

        public Criteria andRefundTimeIsNotNull() {
            addCriterion("refund_time is not null");
            return (Criteria) this;
        }

        public Criteria andRefundTimeEqualTo(Date value) {
            addCriterion("refund_time =", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeNotEqualTo(Date value) {
            addCriterion("refund_time <>", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeGreaterThan(Date value) {
            addCriterion("refund_time >", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("refund_time >=", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeLessThan(Date value) {
            addCriterion("refund_time <", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeLessThanOrEqualTo(Date value) {
            addCriterion("refund_time <=", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeIn(List<Date> values) {
            addCriterion("refund_time in", values, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeNotIn(List<Date> values) {
            addCriterion("refund_time not in", values, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeBetween(Date value1, Date value2) {
            addCriterion("refund_time between", value1, value2, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeNotBetween(Date value1, Date value2) {
            addCriterion("refund_time not between", value1, value2, "refundTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIsNull() {
            addCriterion("finish_time is null");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIsNotNull() {
            addCriterion("finish_time is not null");
            return (Criteria) this;
        }

        public Criteria andFinishTimeEqualTo(Date value) {
            addCriterion("finish_time =", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotEqualTo(Date value) {
            addCriterion("finish_time <>", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThan(Date value) {
            addCriterion("finish_time >", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("finish_time >=", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThan(Date value) {
            addCriterion("finish_time <", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThanOrEqualTo(Date value) {
            addCriterion("finish_time <=", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIn(List<Date> values) {
            addCriterion("finish_time in", values, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotIn(List<Date> values) {
            addCriterion("finish_time not in", values, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeBetween(Date value1, Date value2) {
            addCriterion("finish_time between", value1, value2, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotBetween(Date value1, Date value2) {
            addCriterion("finish_time not between", value1, value2, "finishTime");
            return (Criteria) this;
        }

        public Criteria andCollectSignIsNull() {
            addCriterion("collect_sign is null");
            return (Criteria) this;
        }

        public Criteria andCollectSignIsNotNull() {
            addCriterion("collect_sign is not null");
            return (Criteria) this;
        }

        public Criteria andCollectSignEqualTo(String value) {
            addCriterion("collect_sign =", value, "collectSign");
            return (Criteria) this;
        }

        public Criteria andCollectSignNotEqualTo(String value) {
            addCriterion("collect_sign <>", value, "collectSign");
            return (Criteria) this;
        }

        public Criteria andCollectSignGreaterThan(String value) {
            addCriterion("collect_sign >", value, "collectSign");
            return (Criteria) this;
        }

        public Criteria andCollectSignGreaterThanOrEqualTo(String value) {
            addCriterion("collect_sign >=", value, "collectSign");
            return (Criteria) this;
        }

        public Criteria andCollectSignLessThan(String value) {
            addCriterion("collect_sign <", value, "collectSign");
            return (Criteria) this;
        }

        public Criteria andCollectSignLessThanOrEqualTo(String value) {
            addCriterion("collect_sign <=", value, "collectSign");
            return (Criteria) this;
        }

        public Criteria andCollectSignLike(String value) {
            addCriterion("collect_sign like", value, "collectSign");
            return (Criteria) this;
        }

        public Criteria andCollectSignNotLike(String value) {
            addCriterion("collect_sign not like", value, "collectSign");
            return (Criteria) this;
        }

        public Criteria andCollectSignIn(List<String> values) {
            addCriterion("collect_sign in", values, "collectSign");
            return (Criteria) this;
        }

        public Criteria andCollectSignNotIn(List<String> values) {
            addCriterion("collect_sign not in", values, "collectSign");
            return (Criteria) this;
        }

        public Criteria andCollectSignBetween(String value1, String value2) {
            addCriterion("collect_sign between", value1, value2, "collectSign");
            return (Criteria) this;
        }

        public Criteria andCollectSignNotBetween(String value1, String value2) {
            addCriterion("collect_sign not between", value1, value2, "collectSign");
            return (Criteria) this;
        }

        public Criteria andCollectTimeIsNull() {
            addCriterion("collect_time is null");
            return (Criteria) this;
        }

        public Criteria andCollectTimeIsNotNull() {
            addCriterion("collect_time is not null");
            return (Criteria) this;
        }

        public Criteria andCollectTimeEqualTo(Date value) {
            addCriterion("collect_time =", value, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeNotEqualTo(Date value) {
            addCriterion("collect_time <>", value, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeGreaterThan(Date value) {
            addCriterion("collect_time >", value, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("collect_time >=", value, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeLessThan(Date value) {
            addCriterion("collect_time <", value, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeLessThanOrEqualTo(Date value) {
            addCriterion("collect_time <=", value, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeIn(List<Date> values) {
            addCriterion("collect_time in", values, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeNotIn(List<Date> values) {
            addCriterion("collect_time not in", values, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeBetween(Date value1, Date value2) {
            addCriterion("collect_time between", value1, value2, "collectTime");
            return (Criteria) this;
        }

        public Criteria andCollectTimeNotBetween(Date value1, Date value2) {
            addCriterion("collect_time not between", value1, value2, "collectTime");
            return (Criteria) this;
        }

        public Criteria andChargeSlipStateIsNull() {
            addCriterion("charge_slip_state is null");
            return (Criteria) this;
        }

        public Criteria andChargeSlipStateIsNotNull() {
            addCriterion("charge_slip_state is not null");
            return (Criteria) this;
        }

        public Criteria andChargeSlipStateEqualTo(Integer value) {
            addCriterion("charge_slip_state =", value, "chargeSlipState");
            return (Criteria) this;
        }

        public Criteria andChargeSlipStateNotEqualTo(Integer value) {
            addCriterion("charge_slip_state <>", value, "chargeSlipState");
            return (Criteria) this;
        }

        public Criteria andChargeSlipStateGreaterThan(Integer value) {
            addCriterion("charge_slip_state >", value, "chargeSlipState");
            return (Criteria) this;
        }

        public Criteria andChargeSlipStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("charge_slip_state >=", value, "chargeSlipState");
            return (Criteria) this;
        }

        public Criteria andChargeSlipStateLessThan(Integer value) {
            addCriterion("charge_slip_state <", value, "chargeSlipState");
            return (Criteria) this;
        }

        public Criteria andChargeSlipStateLessThanOrEqualTo(Integer value) {
            addCriterion("charge_slip_state <=", value, "chargeSlipState");
            return (Criteria) this;
        }

        public Criteria andChargeSlipStateIn(List<Integer> values) {
            addCriterion("charge_slip_state in", values, "chargeSlipState");
            return (Criteria) this;
        }

        public Criteria andChargeSlipStateNotIn(List<Integer> values) {
            addCriterion("charge_slip_state not in", values, "chargeSlipState");
            return (Criteria) this;
        }

        public Criteria andChargeSlipStateBetween(Integer value1, Integer value2) {
            addCriterion("charge_slip_state between", value1, value2, "chargeSlipState");
            return (Criteria) this;
        }

        public Criteria andChargeSlipStateNotBetween(Integer value1, Integer value2) {
            addCriterion("charge_slip_state not between", value1, value2, "chargeSlipState");
            return (Criteria) this;
        }

        public Criteria andRefundSlipStateIsNull() {
            addCriterion("refund_slip_state is null");
            return (Criteria) this;
        }

        public Criteria andRefundSlipStateIsNotNull() {
            addCriterion("refund_slip_state is not null");
            return (Criteria) this;
        }

        public Criteria andRefundSlipStateEqualTo(Integer value) {
            addCriterion("refund_slip_state =", value, "refundSlipState");
            return (Criteria) this;
        }

        public Criteria andRefundSlipStateNotEqualTo(Integer value) {
            addCriterion("refund_slip_state <>", value, "refundSlipState");
            return (Criteria) this;
        }

        public Criteria andRefundSlipStateGreaterThan(Integer value) {
            addCriterion("refund_slip_state >", value, "refundSlipState");
            return (Criteria) this;
        }

        public Criteria andRefundSlipStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("refund_slip_state >=", value, "refundSlipState");
            return (Criteria) this;
        }

        public Criteria andRefundSlipStateLessThan(Integer value) {
            addCriterion("refund_slip_state <", value, "refundSlipState");
            return (Criteria) this;
        }

        public Criteria andRefundSlipStateLessThanOrEqualTo(Integer value) {
            addCriterion("refund_slip_state <=", value, "refundSlipState");
            return (Criteria) this;
        }

        public Criteria andRefundSlipStateIn(List<Integer> values) {
            addCriterion("refund_slip_state in", values, "refundSlipState");
            return (Criteria) this;
        }

        public Criteria andRefundSlipStateNotIn(List<Integer> values) {
            addCriterion("refund_slip_state not in", values, "refundSlipState");
            return (Criteria) this;
        }

        public Criteria andRefundSlipStateBetween(Integer value1, Integer value2) {
            addCriterion("refund_slip_state between", value1, value2, "refundSlipState");
            return (Criteria) this;
        }

        public Criteria andRefundSlipStateNotBetween(Integer value1, Integer value2) {
            addCriterion("refund_slip_state not between", value1, value2, "refundSlipState");
            return (Criteria) this;
        }

        public Criteria andRefundPatientSignIsNull() {
            addCriterion("refund_patient_sign is null");
            return (Criteria) this;
        }

        public Criteria andRefundPatientSignIsNotNull() {
            addCriterion("refund_patient_sign is not null");
            return (Criteria) this;
        }

        public Criteria andRefundPatientSignEqualTo(String value) {
            addCriterion("refund_patient_sign =", value, "refundPatientSign");
            return (Criteria) this;
        }

        public Criteria andRefundPatientSignNotEqualTo(String value) {
            addCriterion("refund_patient_sign <>", value, "refundPatientSign");
            return (Criteria) this;
        }

        public Criteria andRefundPatientSignGreaterThan(String value) {
            addCriterion("refund_patient_sign >", value, "refundPatientSign");
            return (Criteria) this;
        }

        public Criteria andRefundPatientSignGreaterThanOrEqualTo(String value) {
            addCriterion("refund_patient_sign >=", value, "refundPatientSign");
            return (Criteria) this;
        }

        public Criteria andRefundPatientSignLessThan(String value) {
            addCriterion("refund_patient_sign <", value, "refundPatientSign");
            return (Criteria) this;
        }

        public Criteria andRefundPatientSignLessThanOrEqualTo(String value) {
            addCriterion("refund_patient_sign <=", value, "refundPatientSign");
            return (Criteria) this;
        }

        public Criteria andRefundPatientSignLike(String value) {
            addCriterion("refund_patient_sign like", value, "refundPatientSign");
            return (Criteria) this;
        }

        public Criteria andRefundPatientSignNotLike(String value) {
            addCriterion("refund_patient_sign not like", value, "refundPatientSign");
            return (Criteria) this;
        }

        public Criteria andRefundPatientSignIn(List<String> values) {
            addCriterion("refund_patient_sign in", values, "refundPatientSign");
            return (Criteria) this;
        }

        public Criteria andRefundPatientSignNotIn(List<String> values) {
            addCriterion("refund_patient_sign not in", values, "refundPatientSign");
            return (Criteria) this;
        }

        public Criteria andRefundPatientSignBetween(String value1, String value2) {
            addCriterion("refund_patient_sign between", value1, value2, "refundPatientSign");
            return (Criteria) this;
        }

        public Criteria andRefundPatientSignNotBetween(String value1, String value2) {
            addCriterion("refund_patient_sign not between", value1, value2, "refundPatientSign");
            return (Criteria) this;
        }

        public Criteria andRefundPatientTimeIsNull() {
            addCriterion("refund_patient_time is null");
            return (Criteria) this;
        }

        public Criteria andRefundPatientTimeIsNotNull() {
            addCriterion("refund_patient_time is not null");
            return (Criteria) this;
        }

        public Criteria andRefundPatientTimeEqualTo(Date value) {
            addCriterion("refund_patient_time =", value, "refundPatientTime");
            return (Criteria) this;
        }

        public Criteria andRefundPatientTimeNotEqualTo(Date value) {
            addCriterion("refund_patient_time <>", value, "refundPatientTime");
            return (Criteria) this;
        }

        public Criteria andRefundPatientTimeGreaterThan(Date value) {
            addCriterion("refund_patient_time >", value, "refundPatientTime");
            return (Criteria) this;
        }

        public Criteria andRefundPatientTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("refund_patient_time >=", value, "refundPatientTime");
            return (Criteria) this;
        }

        public Criteria andRefundPatientTimeLessThan(Date value) {
            addCriterion("refund_patient_time <", value, "refundPatientTime");
            return (Criteria) this;
        }

        public Criteria andRefundPatientTimeLessThanOrEqualTo(Date value) {
            addCriterion("refund_patient_time <=", value, "refundPatientTime");
            return (Criteria) this;
        }

        public Criteria andRefundPatientTimeIn(List<Date> values) {
            addCriterion("refund_patient_time in", values, "refundPatientTime");
            return (Criteria) this;
        }

        public Criteria andRefundPatientTimeNotIn(List<Date> values) {
            addCriterion("refund_patient_time not in", values, "refundPatientTime");
            return (Criteria) this;
        }

        public Criteria andRefundPatientTimeBetween(Date value1, Date value2) {
            addCriterion("refund_patient_time between", value1, value2, "refundPatientTime");
            return (Criteria) this;
        }

        public Criteria andRefundPatientTimeNotBetween(Date value1, Date value2) {
            addCriterion("refund_patient_time not between", value1, value2, "refundPatientTime");
            return (Criteria) this;
        }

        public Criteria andCancelReasonIsNull() {
            addCriterion("cancel_reason is null");
            return (Criteria) this;
        }

        public Criteria andCancelReasonIsNotNull() {
            addCriterion("cancel_reason is not null");
            return (Criteria) this;
        }

        public Criteria andCancelReasonEqualTo(String value) {
            addCriterion("cancel_reason =", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonNotEqualTo(String value) {
            addCriterion("cancel_reason <>", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonGreaterThan(String value) {
            addCriterion("cancel_reason >", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonGreaterThanOrEqualTo(String value) {
            addCriterion("cancel_reason >=", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonLessThan(String value) {
            addCriterion("cancel_reason <", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonLessThanOrEqualTo(String value) {
            addCriterion("cancel_reason <=", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonLike(String value) {
            addCriterion("cancel_reason like", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonNotLike(String value) {
            addCriterion("cancel_reason not like", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonIn(List<String> values) {
            addCriterion("cancel_reason in", values, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonNotIn(List<String> values) {
            addCriterion("cancel_reason not in", values, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonBetween(String value1, String value2) {
            addCriterion("cancel_reason between", value1, value2, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonNotBetween(String value1, String value2) {
            addCriterion("cancel_reason not between", value1, value2, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelPatientSignIsNull() {
            addCriterion("cancel_patient_sign is null");
            return (Criteria) this;
        }

        public Criteria andCancelPatientSignIsNotNull() {
            addCriterion("cancel_patient_sign is not null");
            return (Criteria) this;
        }

        public Criteria andCancelPatientSignEqualTo(String value) {
            addCriterion("cancel_patient_sign =", value, "cancelPatientSign");
            return (Criteria) this;
        }

        public Criteria andCancelPatientSignNotEqualTo(String value) {
            addCriterion("cancel_patient_sign <>", value, "cancelPatientSign");
            return (Criteria) this;
        }

        public Criteria andCancelPatientSignGreaterThan(String value) {
            addCriterion("cancel_patient_sign >", value, "cancelPatientSign");
            return (Criteria) this;
        }

        public Criteria andCancelPatientSignGreaterThanOrEqualTo(String value) {
            addCriterion("cancel_patient_sign >=", value, "cancelPatientSign");
            return (Criteria) this;
        }

        public Criteria andCancelPatientSignLessThan(String value) {
            addCriterion("cancel_patient_sign <", value, "cancelPatientSign");
            return (Criteria) this;
        }

        public Criteria andCancelPatientSignLessThanOrEqualTo(String value) {
            addCriterion("cancel_patient_sign <=", value, "cancelPatientSign");
            return (Criteria) this;
        }

        public Criteria andCancelPatientSignLike(String value) {
            addCriterion("cancel_patient_sign like", value, "cancelPatientSign");
            return (Criteria) this;
        }

        public Criteria andCancelPatientSignNotLike(String value) {
            addCriterion("cancel_patient_sign not like", value, "cancelPatientSign");
            return (Criteria) this;
        }

        public Criteria andCancelPatientSignIn(List<String> values) {
            addCriterion("cancel_patient_sign in", values, "cancelPatientSign");
            return (Criteria) this;
        }

        public Criteria andCancelPatientSignNotIn(List<String> values) {
            addCriterion("cancel_patient_sign not in", values, "cancelPatientSign");
            return (Criteria) this;
        }

        public Criteria andCancelPatientSignBetween(String value1, String value2) {
            addCriterion("cancel_patient_sign between", value1, value2, "cancelPatientSign");
            return (Criteria) this;
        }

        public Criteria andCancelPatientSignNotBetween(String value1, String value2) {
            addCriterion("cancel_patient_sign not between", value1, value2, "cancelPatientSign");
            return (Criteria) this;
        }

        public Criteria andCostIsNull() {
            addCriterion("cost is null");
            return (Criteria) this;
        }

        public Criteria andCostIsNotNull() {
            addCriterion("cost is not null");
            return (Criteria) this;
        }

        public Criteria andCostEqualTo(Double value) {
            addCriterion("cost =", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotEqualTo(Double value) {
            addCriterion("cost <>", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThan(Double value) {
            addCriterion("cost >", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThanOrEqualTo(Double value) {
            addCriterion("cost >=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThan(Double value) {
            addCriterion("cost <", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThanOrEqualTo(Double value) {
            addCriterion("cost <=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostIn(List<Double> values) {
            addCriterion("cost in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotIn(List<Double> values) {
            addCriterion("cost not in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostBetween(Double value1, Double value2) {
            addCriterion("cost between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotBetween(Double value1, Double value2) {
            addCriterion("cost not between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNull() {
            addCriterion("paytype is null");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNotNull() {
            addCriterion("paytype is not null");
            return (Criteria) this;
        }

        public Criteria andPaytypeEqualTo(Integer value) {
            addCriterion("paytype =", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotEqualTo(Integer value) {
            addCriterion("paytype <>", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThan(Integer value) {
            addCriterion("paytype >", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("paytype >=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThan(Integer value) {
            addCriterion("paytype <", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThanOrEqualTo(Integer value) {
            addCriterion("paytype <=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeIn(List<Integer> values) {
            addCriterion("paytype in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotIn(List<Integer> values) {
            addCriterion("paytype not in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeBetween(Integer value1, Integer value2) {
            addCriterion("paytype between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotBetween(Integer value1, Integer value2) {
            addCriterion("paytype not between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andPayStateIsNull() {
            addCriterion("pay_state is null");
            return (Criteria) this;
        }

        public Criteria andPayStateIsNotNull() {
            addCriterion("pay_state is not null");
            return (Criteria) this;
        }

        public Criteria andPayStateEqualTo(Integer value) {
            addCriterion("pay_state =", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateNotEqualTo(Integer value) {
            addCriterion("pay_state <>", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateGreaterThan(Integer value) {
            addCriterion("pay_state >", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_state >=", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateLessThan(Integer value) {
            addCriterion("pay_state <", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateLessThanOrEqualTo(Integer value) {
            addCriterion("pay_state <=", value, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateIn(List<Integer> values) {
            addCriterion("pay_state in", values, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateNotIn(List<Integer> values) {
            addCriterion("pay_state not in", values, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateBetween(Integer value1, Integer value2) {
            addCriterion("pay_state between", value1, value2, "payState");
            return (Criteria) this;
        }

        public Criteria andPayStateNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_state not between", value1, value2, "payState");
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

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
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