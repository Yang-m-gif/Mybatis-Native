package com.slk.wph.module.CUS_Copy_Record.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CusCopyRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CusCopyRecordExample() {
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

        public Criteria andIdcardPrintStateIsNull() {
            addCriterion("idcard_print_state is null");
            return (Criteria) this;
        }

        public Criteria andIdcardPrintStateIsNotNull() {
            addCriterion("idcard_print_state is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardPrintStateEqualTo(Integer value) {
            addCriterion("idcard_print_state =", value, "idcardPrintState");
            return (Criteria) this;
        }

        public Criteria andIdcardPrintStateNotEqualTo(Integer value) {
            addCriterion("idcard_print_state <>", value, "idcardPrintState");
            return (Criteria) this;
        }

        public Criteria andIdcardPrintStateGreaterThan(Integer value) {
            addCriterion("idcard_print_state >", value, "idcardPrintState");
            return (Criteria) this;
        }

        public Criteria andIdcardPrintStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("idcard_print_state >=", value, "idcardPrintState");
            return (Criteria) this;
        }

        public Criteria andIdcardPrintStateLessThan(Integer value) {
            addCriterion("idcard_print_state <", value, "idcardPrintState");
            return (Criteria) this;
        }

        public Criteria andIdcardPrintStateLessThanOrEqualTo(Integer value) {
            addCriterion("idcard_print_state <=", value, "idcardPrintState");
            return (Criteria) this;
        }

        public Criteria andIdcardPrintStateIn(List<Integer> values) {
            addCriterion("idcard_print_state in", values, "idcardPrintState");
            return (Criteria) this;
        }

        public Criteria andIdcardPrintStateNotIn(List<Integer> values) {
            addCriterion("idcard_print_state not in", values, "idcardPrintState");
            return (Criteria) this;
        }

        public Criteria andIdcardPrintStateBetween(Integer value1, Integer value2) {
            addCriterion("idcard_print_state between", value1, value2, "idcardPrintState");
            return (Criteria) this;
        }

        public Criteria andIdcardPrintStateNotBetween(Integer value1, Integer value2) {
            addCriterion("idcard_print_state not between", value1, value2, "idcardPrintState");
            return (Criteria) this;
        }

        public Criteria andExpressRequestStateIsNull() {
            addCriterion("express_request_state is null");
            return (Criteria) this;
        }

        public Criteria andExpressRequestStateIsNotNull() {
            addCriterion("express_request_state is not null");
            return (Criteria) this;
        }

        public Criteria andExpressRequestStateEqualTo(Integer value) {
            addCriterion("express_request_state =", value, "expressRequestState");
            return (Criteria) this;
        }

        public Criteria andExpressRequestStateNotEqualTo(Integer value) {
            addCriterion("express_request_state <>", value, "expressRequestState");
            return (Criteria) this;
        }

        public Criteria andExpressRequestStateGreaterThan(Integer value) {
            addCriterion("express_request_state >", value, "expressRequestState");
            return (Criteria) this;
        }

        public Criteria andExpressRequestStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("express_request_state >=", value, "expressRequestState");
            return (Criteria) this;
        }

        public Criteria andExpressRequestStateLessThan(Integer value) {
            addCriterion("express_request_state <", value, "expressRequestState");
            return (Criteria) this;
        }

        public Criteria andExpressRequestStateLessThanOrEqualTo(Integer value) {
            addCriterion("express_request_state <=", value, "expressRequestState");
            return (Criteria) this;
        }

        public Criteria andExpressRequestStateIn(List<Integer> values) {
            addCriterion("express_request_state in", values, "expressRequestState");
            return (Criteria) this;
        }

        public Criteria andExpressRequestStateNotIn(List<Integer> values) {
            addCriterion("express_request_state not in", values, "expressRequestState");
            return (Criteria) this;
        }

        public Criteria andExpressRequestStateBetween(Integer value1, Integer value2) {
            addCriterion("express_request_state between", value1, value2, "expressRequestState");
            return (Criteria) this;
        }

        public Criteria andExpressRequestStateNotBetween(Integer value1, Integer value2) {
            addCriterion("express_request_state not between", value1, value2, "expressRequestState");
            return (Criteria) this;
        }

        public Criteria andExpressRequestUseridIsNull() {
            addCriterion("express_request_userid is null");
            return (Criteria) this;
        }

        public Criteria andExpressRequestUseridIsNotNull() {
            addCriterion("express_request_userid is not null");
            return (Criteria) this;
        }

        public Criteria andExpressRequestUseridEqualTo(Integer value) {
            addCriterion("express_request_userid =", value, "expressRequestUserid");
            return (Criteria) this;
        }

        public Criteria andExpressRequestUseridNotEqualTo(Integer value) {
            addCriterion("express_request_userid <>", value, "expressRequestUserid");
            return (Criteria) this;
        }

        public Criteria andExpressRequestUseridGreaterThan(Integer value) {
            addCriterion("express_request_userid >", value, "expressRequestUserid");
            return (Criteria) this;
        }

        public Criteria andExpressRequestUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("express_request_userid >=", value, "expressRequestUserid");
            return (Criteria) this;
        }

        public Criteria andExpressRequestUseridLessThan(Integer value) {
            addCriterion("express_request_userid <", value, "expressRequestUserid");
            return (Criteria) this;
        }

        public Criteria andExpressRequestUseridLessThanOrEqualTo(Integer value) {
            addCriterion("express_request_userid <=", value, "expressRequestUserid");
            return (Criteria) this;
        }

        public Criteria andExpressRequestUseridIn(List<Integer> values) {
            addCriterion("express_request_userid in", values, "expressRequestUserid");
            return (Criteria) this;
        }

        public Criteria andExpressRequestUseridNotIn(List<Integer> values) {
            addCriterion("express_request_userid not in", values, "expressRequestUserid");
            return (Criteria) this;
        }

        public Criteria andExpressRequestUseridBetween(Integer value1, Integer value2) {
            addCriterion("express_request_userid between", value1, value2, "expressRequestUserid");
            return (Criteria) this;
        }

        public Criteria andExpressRequestUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("express_request_userid not between", value1, value2, "expressRequestUserid");
            return (Criteria) this;
        }

        public Criteria andExpressCloseUseridIsNull() {
            addCriterion("express_close_userid is null");
            return (Criteria) this;
        }

        public Criteria andExpressCloseUseridIsNotNull() {
            addCriterion("express_close_userid is not null");
            return (Criteria) this;
        }

        public Criteria andExpressCloseUseridEqualTo(Integer value) {
            addCriterion("express_close_userid =", value, "expressCloseUserid");
            return (Criteria) this;
        }

        public Criteria andExpressCloseUseridNotEqualTo(Integer value) {
            addCriterion("express_close_userid <>", value, "expressCloseUserid");
            return (Criteria) this;
        }

        public Criteria andExpressCloseUseridGreaterThan(Integer value) {
            addCriterion("express_close_userid >", value, "expressCloseUserid");
            return (Criteria) this;
        }

        public Criteria andExpressCloseUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("express_close_userid >=", value, "expressCloseUserid");
            return (Criteria) this;
        }

        public Criteria andExpressCloseUseridLessThan(Integer value) {
            addCriterion("express_close_userid <", value, "expressCloseUserid");
            return (Criteria) this;
        }

        public Criteria andExpressCloseUseridLessThanOrEqualTo(Integer value) {
            addCriterion("express_close_userid <=", value, "expressCloseUserid");
            return (Criteria) this;
        }

        public Criteria andExpressCloseUseridIn(List<Integer> values) {
            addCriterion("express_close_userid in", values, "expressCloseUserid");
            return (Criteria) this;
        }

        public Criteria andExpressCloseUseridNotIn(List<Integer> values) {
            addCriterion("express_close_userid not in", values, "expressCloseUserid");
            return (Criteria) this;
        }

        public Criteria andExpressCloseUseridBetween(Integer value1, Integer value2) {
            addCriterion("express_close_userid between", value1, value2, "expressCloseUserid");
            return (Criteria) this;
        }

        public Criteria andExpressCloseUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("express_close_userid not between", value1, value2, "expressCloseUserid");
            return (Criteria) this;
        }

        public Criteria andCopyRequestStateIsNull() {
            addCriterion("copy_request_state is null");
            return (Criteria) this;
        }

        public Criteria andCopyRequestStateIsNotNull() {
            addCriterion("copy_request_state is not null");
            return (Criteria) this;
        }

        public Criteria andCopyRequestStateEqualTo(Integer value) {
            addCriterion("copy_request_state =", value, "copyRequestState");
            return (Criteria) this;
        }

        public Criteria andCopyRequestStateNotEqualTo(Integer value) {
            addCriterion("copy_request_state <>", value, "copyRequestState");
            return (Criteria) this;
        }

        public Criteria andCopyRequestStateGreaterThan(Integer value) {
            addCriterion("copy_request_state >", value, "copyRequestState");
            return (Criteria) this;
        }

        public Criteria andCopyRequestStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("copy_request_state >=", value, "copyRequestState");
            return (Criteria) this;
        }

        public Criteria andCopyRequestStateLessThan(Integer value) {
            addCriterion("copy_request_state <", value, "copyRequestState");
            return (Criteria) this;
        }

        public Criteria andCopyRequestStateLessThanOrEqualTo(Integer value) {
            addCriterion("copy_request_state <=", value, "copyRequestState");
            return (Criteria) this;
        }

        public Criteria andCopyRequestStateIn(List<Integer> values) {
            addCriterion("copy_request_state in", values, "copyRequestState");
            return (Criteria) this;
        }

        public Criteria andCopyRequestStateNotIn(List<Integer> values) {
            addCriterion("copy_request_state not in", values, "copyRequestState");
            return (Criteria) this;
        }

        public Criteria andCopyRequestStateBetween(Integer value1, Integer value2) {
            addCriterion("copy_request_state between", value1, value2, "copyRequestState");
            return (Criteria) this;
        }

        public Criteria andCopyRequestStateNotBetween(Integer value1, Integer value2) {
            addCriterion("copy_request_state not between", value1, value2, "copyRequestState");
            return (Criteria) this;
        }

        public Criteria andCopyRequestUseridIsNull() {
            addCriterion("copy_request_userid is null");
            return (Criteria) this;
        }

        public Criteria andCopyRequestUseridIsNotNull() {
            addCriterion("copy_request_userid is not null");
            return (Criteria) this;
        }

        public Criteria andCopyRequestUseridEqualTo(Integer value) {
            addCriterion("copy_request_userid =", value, "copyRequestUserid");
            return (Criteria) this;
        }

        public Criteria andCopyRequestUseridNotEqualTo(Integer value) {
            addCriterion("copy_request_userid <>", value, "copyRequestUserid");
            return (Criteria) this;
        }

        public Criteria andCopyRequestUseridGreaterThan(Integer value) {
            addCriterion("copy_request_userid >", value, "copyRequestUserid");
            return (Criteria) this;
        }

        public Criteria andCopyRequestUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("copy_request_userid >=", value, "copyRequestUserid");
            return (Criteria) this;
        }

        public Criteria andCopyRequestUseridLessThan(Integer value) {
            addCriterion("copy_request_userid <", value, "copyRequestUserid");
            return (Criteria) this;
        }

        public Criteria andCopyRequestUseridLessThanOrEqualTo(Integer value) {
            addCriterion("copy_request_userid <=", value, "copyRequestUserid");
            return (Criteria) this;
        }

        public Criteria andCopyRequestUseridIn(List<Integer> values) {
            addCriterion("copy_request_userid in", values, "copyRequestUserid");
            return (Criteria) this;
        }

        public Criteria andCopyRequestUseridNotIn(List<Integer> values) {
            addCriterion("copy_request_userid not in", values, "copyRequestUserid");
            return (Criteria) this;
        }

        public Criteria andCopyRequestUseridBetween(Integer value1, Integer value2) {
            addCriterion("copy_request_userid between", value1, value2, "copyRequestUserid");
            return (Criteria) this;
        }

        public Criteria andCopyRequestUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("copy_request_userid not between", value1, value2, "copyRequestUserid");
            return (Criteria) this;
        }

        public Criteria andCopyCloseUseridIsNull() {
            addCriterion("copy_close_userid is null");
            return (Criteria) this;
        }

        public Criteria andCopyCloseUseridIsNotNull() {
            addCriterion("copy_close_userid is not null");
            return (Criteria) this;
        }

        public Criteria andCopyCloseUseridEqualTo(Integer value) {
            addCriterion("copy_close_userid =", value, "copyCloseUserid");
            return (Criteria) this;
        }

        public Criteria andCopyCloseUseridNotEqualTo(Integer value) {
            addCriterion("copy_close_userid <>", value, "copyCloseUserid");
            return (Criteria) this;
        }

        public Criteria andCopyCloseUseridGreaterThan(Integer value) {
            addCriterion("copy_close_userid >", value, "copyCloseUserid");
            return (Criteria) this;
        }

        public Criteria andCopyCloseUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("copy_close_userid >=", value, "copyCloseUserid");
            return (Criteria) this;
        }

        public Criteria andCopyCloseUseridLessThan(Integer value) {
            addCriterion("copy_close_userid <", value, "copyCloseUserid");
            return (Criteria) this;
        }

        public Criteria andCopyCloseUseridLessThanOrEqualTo(Integer value) {
            addCriterion("copy_close_userid <=", value, "copyCloseUserid");
            return (Criteria) this;
        }

        public Criteria andCopyCloseUseridIn(List<Integer> values) {
            addCriterion("copy_close_userid in", values, "copyCloseUserid");
            return (Criteria) this;
        }

        public Criteria andCopyCloseUseridNotIn(List<Integer> values) {
            addCriterion("copy_close_userid not in", values, "copyCloseUserid");
            return (Criteria) this;
        }

        public Criteria andCopyCloseUseridBetween(Integer value1, Integer value2) {
            addCriterion("copy_close_userid between", value1, value2, "copyCloseUserid");
            return (Criteria) this;
        }

        public Criteria andCopyCloseUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("copy_close_userid not between", value1, value2, "copyCloseUserid");
            return (Criteria) this;
        }

        public Criteria andCusPricePageFidIsNull() {
            addCriterion("cus_price_page_fid is null");
            return (Criteria) this;
        }

        public Criteria andCusPricePageFidIsNotNull() {
            addCriterion("cus_price_page_fid is not null");
            return (Criteria) this;
        }

        public Criteria andCusPricePageFidEqualTo(Integer value) {
            addCriterion("cus_price_page_fid =", value, "cusPricePageFid");
            return (Criteria) this;
        }

        public Criteria andCusPricePageFidNotEqualTo(Integer value) {
            addCriterion("cus_price_page_fid <>", value, "cusPricePageFid");
            return (Criteria) this;
        }

        public Criteria andCusPricePageFidGreaterThan(Integer value) {
            addCriterion("cus_price_page_fid >", value, "cusPricePageFid");
            return (Criteria) this;
        }

        public Criteria andCusPricePageFidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cus_price_page_fid >=", value, "cusPricePageFid");
            return (Criteria) this;
        }

        public Criteria andCusPricePageFidLessThan(Integer value) {
            addCriterion("cus_price_page_fid <", value, "cusPricePageFid");
            return (Criteria) this;
        }

        public Criteria andCusPricePageFidLessThanOrEqualTo(Integer value) {
            addCriterion("cus_price_page_fid <=", value, "cusPricePageFid");
            return (Criteria) this;
        }

        public Criteria andCusPricePageFidIn(List<Integer> values) {
            addCriterion("cus_price_page_fid in", values, "cusPricePageFid");
            return (Criteria) this;
        }

        public Criteria andCusPricePageFidNotIn(List<Integer> values) {
            addCriterion("cus_price_page_fid not in", values, "cusPricePageFid");
            return (Criteria) this;
        }

        public Criteria andCusPricePageFidBetween(Integer value1, Integer value2) {
            addCriterion("cus_price_page_fid between", value1, value2, "cusPricePageFid");
            return (Criteria) this;
        }

        public Criteria andCusPricePageFidNotBetween(Integer value1, Integer value2) {
            addCriterion("cus_price_page_fid not between", value1, value2, "cusPricePageFid");
            return (Criteria) this;
        }

        public Criteria andCopyAmountIsNull() {
            addCriterion("copy_amount is null");
            return (Criteria) this;
        }

        public Criteria andCopyAmountIsNotNull() {
            addCriterion("copy_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCopyAmountEqualTo(Integer value) {
            addCriterion("copy_amount =", value, "copyAmount");
            return (Criteria) this;
        }

        public Criteria andCopyAmountNotEqualTo(Integer value) {
            addCriterion("copy_amount <>", value, "copyAmount");
            return (Criteria) this;
        }

        public Criteria andCopyAmountGreaterThan(Integer value) {
            addCriterion("copy_amount >", value, "copyAmount");
            return (Criteria) this;
        }

        public Criteria andCopyAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("copy_amount >=", value, "copyAmount");
            return (Criteria) this;
        }

        public Criteria andCopyAmountLessThan(Integer value) {
            addCriterion("copy_amount <", value, "copyAmount");
            return (Criteria) this;
        }

        public Criteria andCopyAmountLessThanOrEqualTo(Integer value) {
            addCriterion("copy_amount <=", value, "copyAmount");
            return (Criteria) this;
        }

        public Criteria andCopyAmountIn(List<Integer> values) {
            addCriterion("copy_amount in", values, "copyAmount");
            return (Criteria) this;
        }

        public Criteria andCopyAmountNotIn(List<Integer> values) {
            addCriterion("copy_amount not in", values, "copyAmount");
            return (Criteria) this;
        }

        public Criteria andCopyAmountBetween(Integer value1, Integer value2) {
            addCriterion("copy_amount between", value1, value2, "copyAmount");
            return (Criteria) this;
        }

        public Criteria andCopyAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("copy_amount not between", value1, value2, "copyAmount");
            return (Criteria) this;
        }

        public Criteria andCopyCostIsNull() {
            addCriterion("copy_cost is null");
            return (Criteria) this;
        }

        public Criteria andCopyCostIsNotNull() {
            addCriterion("copy_cost is not null");
            return (Criteria) this;
        }

        public Criteria andCopyCostEqualTo(Double value) {
            addCriterion("copy_cost =", value, "copyCost");
            return (Criteria) this;
        }

        public Criteria andCopyCostNotEqualTo(Double value) {
            addCriterion("copy_cost <>", value, "copyCost");
            return (Criteria) this;
        }

        public Criteria andCopyCostGreaterThan(Double value) {
            addCriterion("copy_cost >", value, "copyCost");
            return (Criteria) this;
        }

        public Criteria andCopyCostGreaterThanOrEqualTo(Double value) {
            addCriterion("copy_cost >=", value, "copyCost");
            return (Criteria) this;
        }

        public Criteria andCopyCostLessThan(Double value) {
            addCriterion("copy_cost <", value, "copyCost");
            return (Criteria) this;
        }

        public Criteria andCopyCostLessThanOrEqualTo(Double value) {
            addCriterion("copy_cost <=", value, "copyCost");
            return (Criteria) this;
        }

        public Criteria andCopyCostIn(List<Double> values) {
            addCriterion("copy_cost in", values, "copyCost");
            return (Criteria) this;
        }

        public Criteria andCopyCostNotIn(List<Double> values) {
            addCriterion("copy_cost not in", values, "copyCost");
            return (Criteria) this;
        }

        public Criteria andCopyCostBetween(Double value1, Double value2) {
            addCriterion("copy_cost between", value1, value2, "copyCost");
            return (Criteria) this;
        }

        public Criteria andCopyCostNotBetween(Double value1, Double value2) {
            addCriterion("copy_cost not between", value1, value2, "copyCost");
            return (Criteria) this;
        }

        public Criteria andCopyPageAmountIsNull() {
            addCriterion("copy_page_amount is null");
            return (Criteria) this;
        }

        public Criteria andCopyPageAmountIsNotNull() {
            addCriterion("copy_page_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCopyPageAmountEqualTo(Integer value) {
            addCriterion("copy_page_amount =", value, "copyPageAmount");
            return (Criteria) this;
        }

        public Criteria andCopyPageAmountNotEqualTo(Integer value) {
            addCriterion("copy_page_amount <>", value, "copyPageAmount");
            return (Criteria) this;
        }

        public Criteria andCopyPageAmountGreaterThan(Integer value) {
            addCriterion("copy_page_amount >", value, "copyPageAmount");
            return (Criteria) this;
        }

        public Criteria andCopyPageAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("copy_page_amount >=", value, "copyPageAmount");
            return (Criteria) this;
        }

        public Criteria andCopyPageAmountLessThan(Integer value) {
            addCriterion("copy_page_amount <", value, "copyPageAmount");
            return (Criteria) this;
        }

        public Criteria andCopyPageAmountLessThanOrEqualTo(Integer value) {
            addCriterion("copy_page_amount <=", value, "copyPageAmount");
            return (Criteria) this;
        }

        public Criteria andCopyPageAmountIn(List<Integer> values) {
            addCriterion("copy_page_amount in", values, "copyPageAmount");
            return (Criteria) this;
        }

        public Criteria andCopyPageAmountNotIn(List<Integer> values) {
            addCriterion("copy_page_amount not in", values, "copyPageAmount");
            return (Criteria) this;
        }

        public Criteria andCopyPageAmountBetween(Integer value1, Integer value2) {
            addCriterion("copy_page_amount between", value1, value2, "copyPageAmount");
            return (Criteria) this;
        }

        public Criteria andCopyPageAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("copy_page_amount not between", value1, value2, "copyPageAmount");
            return (Criteria) this;
        }

        public Criteria andCopyPageCostIsNull() {
            addCriterion("copy_page_cost is null");
            return (Criteria) this;
        }

        public Criteria andCopyPageCostIsNotNull() {
            addCriterion("copy_page_cost is not null");
            return (Criteria) this;
        }

        public Criteria andCopyPageCostEqualTo(Double value) {
            addCriterion("copy_page_cost =", value, "copyPageCost");
            return (Criteria) this;
        }

        public Criteria andCopyPageCostNotEqualTo(Double value) {
            addCriterion("copy_page_cost <>", value, "copyPageCost");
            return (Criteria) this;
        }

        public Criteria andCopyPageCostGreaterThan(Double value) {
            addCriterion("copy_page_cost >", value, "copyPageCost");
            return (Criteria) this;
        }

        public Criteria andCopyPageCostGreaterThanOrEqualTo(Double value) {
            addCriterion("copy_page_cost >=", value, "copyPageCost");
            return (Criteria) this;
        }

        public Criteria andCopyPageCostLessThan(Double value) {
            addCriterion("copy_page_cost <", value, "copyPageCost");
            return (Criteria) this;
        }

        public Criteria andCopyPageCostLessThanOrEqualTo(Double value) {
            addCriterion("copy_page_cost <=", value, "copyPageCost");
            return (Criteria) this;
        }

        public Criteria andCopyPageCostIn(List<Double> values) {
            addCriterion("copy_page_cost in", values, "copyPageCost");
            return (Criteria) this;
        }

        public Criteria andCopyPageCostNotIn(List<Double> values) {
            addCriterion("copy_page_cost not in", values, "copyPageCost");
            return (Criteria) this;
        }

        public Criteria andCopyPageCostBetween(Double value1, Double value2) {
            addCriterion("copy_page_cost between", value1, value2, "copyPageCost");
            return (Criteria) this;
        }

        public Criteria andCopyPageCostNotBetween(Double value1, Double value2) {
            addCriterion("copy_page_cost not between", value1, value2, "copyPageCost");
            return (Criteria) this;
        }

        public Criteria andUrgentIsNull() {
            addCriterion("urgent is null");
            return (Criteria) this;
        }

        public Criteria andUrgentIsNotNull() {
            addCriterion("urgent is not null");
            return (Criteria) this;
        }

        public Criteria andUrgentEqualTo(Integer value) {
            addCriterion("urgent =", value, "urgent");
            return (Criteria) this;
        }

        public Criteria andUrgentNotEqualTo(Integer value) {
            addCriterion("urgent <>", value, "urgent");
            return (Criteria) this;
        }

        public Criteria andUrgentGreaterThan(Integer value) {
            addCriterion("urgent >", value, "urgent");
            return (Criteria) this;
        }

        public Criteria andUrgentGreaterThanOrEqualTo(Integer value) {
            addCriterion("urgent >=", value, "urgent");
            return (Criteria) this;
        }

        public Criteria andUrgentLessThan(Integer value) {
            addCriterion("urgent <", value, "urgent");
            return (Criteria) this;
        }

        public Criteria andUrgentLessThanOrEqualTo(Integer value) {
            addCriterion("urgent <=", value, "urgent");
            return (Criteria) this;
        }

        public Criteria andUrgentIn(List<Integer> values) {
            addCriterion("urgent in", values, "urgent");
            return (Criteria) this;
        }

        public Criteria andUrgentNotIn(List<Integer> values) {
            addCriterion("urgent not in", values, "urgent");
            return (Criteria) this;
        }

        public Criteria andUrgentBetween(Integer value1, Integer value2) {
            addCriterion("urgent between", value1, value2, "urgent");
            return (Criteria) this;
        }

        public Criteria andUrgentNotBetween(Integer value1, Integer value2) {
            addCriterion("urgent not between", value1, value2, "urgent");
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
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

        public Criteria andRegionIsNull() {
            addCriterion("region is null");
            return (Criteria) this;
        }

        public Criteria andRegionIsNotNull() {
            addCriterion("region is not null");
            return (Criteria) this;
        }

        public Criteria andRegionEqualTo(String value) {
            addCriterion("region =", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotEqualTo(String value) {
            addCriterion("region <>", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThan(String value) {
            addCriterion("region >", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThanOrEqualTo(String value) {
            addCriterion("region >=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThan(String value) {
            addCriterion("region <", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThanOrEqualTo(String value) {
            addCriterion("region <=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLike(String value) {
            addCriterion("region like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotLike(String value) {
            addCriterion("region not like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionIn(List<String> values) {
            addCriterion("region in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotIn(List<String> values) {
            addCriterion("region not in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionBetween(String value1, String value2) {
            addCriterion("region between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotBetween(String value1, String value2) {
            addCriterion("region not between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andDatailedAddressIsNull() {
            addCriterion("datailed_address is null");
            return (Criteria) this;
        }

        public Criteria andDatailedAddressIsNotNull() {
            addCriterion("datailed_address is not null");
            return (Criteria) this;
        }

        public Criteria andDatailedAddressEqualTo(String value) {
            addCriterion("datailed_address =", value, "datailedAddress");
            return (Criteria) this;
        }

        public Criteria andDatailedAddressNotEqualTo(String value) {
            addCriterion("datailed_address <>", value, "datailedAddress");
            return (Criteria) this;
        }

        public Criteria andDatailedAddressGreaterThan(String value) {
            addCriterion("datailed_address >", value, "datailedAddress");
            return (Criteria) this;
        }

        public Criteria andDatailedAddressGreaterThanOrEqualTo(String value) {
            addCriterion("datailed_address >=", value, "datailedAddress");
            return (Criteria) this;
        }

        public Criteria andDatailedAddressLessThan(String value) {
            addCriterion("datailed_address <", value, "datailedAddress");
            return (Criteria) this;
        }

        public Criteria andDatailedAddressLessThanOrEqualTo(String value) {
            addCriterion("datailed_address <=", value, "datailedAddress");
            return (Criteria) this;
        }

        public Criteria andDatailedAddressLike(String value) {
            addCriterion("datailed_address like", value, "datailedAddress");
            return (Criteria) this;
        }

        public Criteria andDatailedAddressNotLike(String value) {
            addCriterion("datailed_address not like", value, "datailedAddress");
            return (Criteria) this;
        }

        public Criteria andDatailedAddressIn(List<String> values) {
            addCriterion("datailed_address in", values, "datailedAddress");
            return (Criteria) this;
        }

        public Criteria andDatailedAddressNotIn(List<String> values) {
            addCriterion("datailed_address not in", values, "datailedAddress");
            return (Criteria) this;
        }

        public Criteria andDatailedAddressBetween(String value1, String value2) {
            addCriterion("datailed_address between", value1, value2, "datailedAddress");
            return (Criteria) this;
        }

        public Criteria andDatailedAddressNotBetween(String value1, String value2) {
            addCriterion("datailed_address not between", value1, value2, "datailedAddress");
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

        public Criteria andCusPatientFidIsNull() {
            addCriterion("cus_patient_fid is null");
            return (Criteria) this;
        }

        public Criteria andCusPatientFidIsNotNull() {
            addCriterion("cus_patient_fid is not null");
            return (Criteria) this;
        }

        public Criteria andCusPatientFidEqualTo(Integer value) {
            addCriterion("cus_patient_fid =", value, "cusPatientFid");
            return (Criteria) this;
        }

        public Criteria andCusPatientFidNotEqualTo(Integer value) {
            addCriterion("cus_patient_fid <>", value, "cusPatientFid");
            return (Criteria) this;
        }

        public Criteria andCusPatientFidGreaterThan(Integer value) {
            addCriterion("cus_patient_fid >", value, "cusPatientFid");
            return (Criteria) this;
        }

        public Criteria andCusPatientFidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cus_patient_fid >=", value, "cusPatientFid");
            return (Criteria) this;
        }

        public Criteria andCusPatientFidLessThan(Integer value) {
            addCriterion("cus_patient_fid <", value, "cusPatientFid");
            return (Criteria) this;
        }

        public Criteria andCusPatientFidLessThanOrEqualTo(Integer value) {
            addCriterion("cus_patient_fid <=", value, "cusPatientFid");
            return (Criteria) this;
        }

        public Criteria andCusPatientFidIn(List<Integer> values) {
            addCriterion("cus_patient_fid in", values, "cusPatientFid");
            return (Criteria) this;
        }

        public Criteria andCusPatientFidNotIn(List<Integer> values) {
            addCriterion("cus_patient_fid not in", values, "cusPatientFid");
            return (Criteria) this;
        }

        public Criteria andCusPatientFidBetween(Integer value1, Integer value2) {
            addCriterion("cus_patient_fid between", value1, value2, "cusPatientFid");
            return (Criteria) this;
        }

        public Criteria andCusPatientFidNotBetween(Integer value1, Integer value2) {
            addCriterion("cus_patient_fid not between", value1, value2, "cusPatientFid");
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

        public Criteria andCopyRequestTimeIsNull() {
            addCriterion("copy_request_time is null");
            return (Criteria) this;
        }

        public Criteria andCopyRequestTimeIsNotNull() {
            addCriterion("copy_request_time is not null");
            return (Criteria) this;
        }

        public Criteria andCopyRequestTimeEqualTo(Date value) {
            addCriterion("copy_request_time =", value, "copyRequestTime");
            return (Criteria) this;
        }

        public Criteria andCopyRequestTimeNotEqualTo(Date value) {
            addCriterion("copy_request_time <>", value, "copyRequestTime");
            return (Criteria) this;
        }

        public Criteria andCopyRequestTimeGreaterThan(Date value) {
            addCriterion("copy_request_time >", value, "copyRequestTime");
            return (Criteria) this;
        }

        public Criteria andCopyRequestTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("copy_request_time >=", value, "copyRequestTime");
            return (Criteria) this;
        }

        public Criteria andCopyRequestTimeLessThan(Date value) {
            addCriterion("copy_request_time <", value, "copyRequestTime");
            return (Criteria) this;
        }

        public Criteria andCopyRequestTimeLessThanOrEqualTo(Date value) {
            addCriterion("copy_request_time <=", value, "copyRequestTime");
            return (Criteria) this;
        }

        public Criteria andCopyRequestTimeIn(List<Date> values) {
            addCriterion("copy_request_time in", values, "copyRequestTime");
            return (Criteria) this;
        }

        public Criteria andCopyRequestTimeNotIn(List<Date> values) {
            addCriterion("copy_request_time not in", values, "copyRequestTime");
            return (Criteria) this;
        }

        public Criteria andCopyRequestTimeBetween(Date value1, Date value2) {
            addCriterion("copy_request_time between", value1, value2, "copyRequestTime");
            return (Criteria) this;
        }

        public Criteria andCopyRequestTimeNotBetween(Date value1, Date value2) {
            addCriterion("copy_request_time not between", value1, value2, "copyRequestTime");
            return (Criteria) this;
        }

        public Criteria andCopyCloseTimeIsNull() {
            addCriterion("copy_close_time is null");
            return (Criteria) this;
        }

        public Criteria andCopyCloseTimeIsNotNull() {
            addCriterion("copy_close_time is not null");
            return (Criteria) this;
        }

        public Criteria andCopyCloseTimeEqualTo(Date value) {
            addCriterion("copy_close_time =", value, "copyCloseTime");
            return (Criteria) this;
        }

        public Criteria andCopyCloseTimeNotEqualTo(Date value) {
            addCriterion("copy_close_time <>", value, "copyCloseTime");
            return (Criteria) this;
        }

        public Criteria andCopyCloseTimeGreaterThan(Date value) {
            addCriterion("copy_close_time >", value, "copyCloseTime");
            return (Criteria) this;
        }

        public Criteria andCopyCloseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("copy_close_time >=", value, "copyCloseTime");
            return (Criteria) this;
        }

        public Criteria andCopyCloseTimeLessThan(Date value) {
            addCriterion("copy_close_time <", value, "copyCloseTime");
            return (Criteria) this;
        }

        public Criteria andCopyCloseTimeLessThanOrEqualTo(Date value) {
            addCriterion("copy_close_time <=", value, "copyCloseTime");
            return (Criteria) this;
        }

        public Criteria andCopyCloseTimeIn(List<Date> values) {
            addCriterion("copy_close_time in", values, "copyCloseTime");
            return (Criteria) this;
        }

        public Criteria andCopyCloseTimeNotIn(List<Date> values) {
            addCriterion("copy_close_time not in", values, "copyCloseTime");
            return (Criteria) this;
        }

        public Criteria andCopyCloseTimeBetween(Date value1, Date value2) {
            addCriterion("copy_close_time between", value1, value2, "copyCloseTime");
            return (Criteria) this;
        }

        public Criteria andCopyCloseTimeNotBetween(Date value1, Date value2) {
            addCriterion("copy_close_time not between", value1, value2, "copyCloseTime");
            return (Criteria) this;
        }

        public Criteria andExpressRequestTimeIsNull() {
            addCriterion("express_request_time is null");
            return (Criteria) this;
        }

        public Criteria andExpressRequestTimeIsNotNull() {
            addCriterion("express_request_time is not null");
            return (Criteria) this;
        }

        public Criteria andExpressRequestTimeEqualTo(Date value) {
            addCriterion("express_request_time =", value, "expressRequestTime");
            return (Criteria) this;
        }

        public Criteria andExpressRequestTimeNotEqualTo(Date value) {
            addCriterion("express_request_time <>", value, "expressRequestTime");
            return (Criteria) this;
        }

        public Criteria andExpressRequestTimeGreaterThan(Date value) {
            addCriterion("express_request_time >", value, "expressRequestTime");
            return (Criteria) this;
        }

        public Criteria andExpressRequestTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("express_request_time >=", value, "expressRequestTime");
            return (Criteria) this;
        }

        public Criteria andExpressRequestTimeLessThan(Date value) {
            addCriterion("express_request_time <", value, "expressRequestTime");
            return (Criteria) this;
        }

        public Criteria andExpressRequestTimeLessThanOrEqualTo(Date value) {
            addCriterion("express_request_time <=", value, "expressRequestTime");
            return (Criteria) this;
        }

        public Criteria andExpressRequestTimeIn(List<Date> values) {
            addCriterion("express_request_time in", values, "expressRequestTime");
            return (Criteria) this;
        }

        public Criteria andExpressRequestTimeNotIn(List<Date> values) {
            addCriterion("express_request_time not in", values, "expressRequestTime");
            return (Criteria) this;
        }

        public Criteria andExpressRequestTimeBetween(Date value1, Date value2) {
            addCriterion("express_request_time between", value1, value2, "expressRequestTime");
            return (Criteria) this;
        }

        public Criteria andExpressRequestTimeNotBetween(Date value1, Date value2) {
            addCriterion("express_request_time not between", value1, value2, "expressRequestTime");
            return (Criteria) this;
        }

        public Criteria andExpressCloseTimeIsNull() {
            addCriterion("express_close_time is null");
            return (Criteria) this;
        }

        public Criteria andExpressCloseTimeIsNotNull() {
            addCriterion("express_close_time is not null");
            return (Criteria) this;
        }

        public Criteria andExpressCloseTimeEqualTo(Date value) {
            addCriterion("express_close_time =", value, "expressCloseTime");
            return (Criteria) this;
        }

        public Criteria andExpressCloseTimeNotEqualTo(Date value) {
            addCriterion("express_close_time <>", value, "expressCloseTime");
            return (Criteria) this;
        }

        public Criteria andExpressCloseTimeGreaterThan(Date value) {
            addCriterion("express_close_time >", value, "expressCloseTime");
            return (Criteria) this;
        }

        public Criteria andExpressCloseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("express_close_time >=", value, "expressCloseTime");
            return (Criteria) this;
        }

        public Criteria andExpressCloseTimeLessThan(Date value) {
            addCriterion("express_close_time <", value, "expressCloseTime");
            return (Criteria) this;
        }

        public Criteria andExpressCloseTimeLessThanOrEqualTo(Date value) {
            addCriterion("express_close_time <=", value, "expressCloseTime");
            return (Criteria) this;
        }

        public Criteria andExpressCloseTimeIn(List<Date> values) {
            addCriterion("express_close_time in", values, "expressCloseTime");
            return (Criteria) this;
        }

        public Criteria andExpressCloseTimeNotIn(List<Date> values) {
            addCriterion("express_close_time not in", values, "expressCloseTime");
            return (Criteria) this;
        }

        public Criteria andExpressCloseTimeBetween(Date value1, Date value2) {
            addCriterion("express_close_time between", value1, value2, "expressCloseTime");
            return (Criteria) this;
        }

        public Criteria andExpressCloseTimeNotBetween(Date value1, Date value2) {
            addCriterion("express_close_time not between", value1, value2, "expressCloseTime");
            return (Criteria) this;
        }

        public Criteria andSendExpressTimeIsNull() {
            addCriterion("send_express_time is null");
            return (Criteria) this;
        }

        public Criteria andSendExpressTimeIsNotNull() {
            addCriterion("send_express_time is not null");
            return (Criteria) this;
        }

        public Criteria andSendExpressTimeEqualTo(Date value) {
            addCriterion("send_express_time =", value, "sendExpressTime");
            return (Criteria) this;
        }

        public Criteria andSendExpressTimeNotEqualTo(Date value) {
            addCriterion("send_express_time <>", value, "sendExpressTime");
            return (Criteria) this;
        }

        public Criteria andSendExpressTimeGreaterThan(Date value) {
            addCriterion("send_express_time >", value, "sendExpressTime");
            return (Criteria) this;
        }

        public Criteria andSendExpressTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("send_express_time >=", value, "sendExpressTime");
            return (Criteria) this;
        }

        public Criteria andSendExpressTimeLessThan(Date value) {
            addCriterion("send_express_time <", value, "sendExpressTime");
            return (Criteria) this;
        }

        public Criteria andSendExpressTimeLessThanOrEqualTo(Date value) {
            addCriterion("send_express_time <=", value, "sendExpressTime");
            return (Criteria) this;
        }

        public Criteria andSendExpressTimeIn(List<Date> values) {
            addCriterion("send_express_time in", values, "sendExpressTime");
            return (Criteria) this;
        }

        public Criteria andSendExpressTimeNotIn(List<Date> values) {
            addCriterion("send_express_time not in", values, "sendExpressTime");
            return (Criteria) this;
        }

        public Criteria andSendExpressTimeBetween(Date value1, Date value2) {
            addCriterion("send_express_time between", value1, value2, "sendExpressTime");
            return (Criteria) this;
        }

        public Criteria andSendExpressTimeNotBetween(Date value1, Date value2) {
            addCriterion("send_express_time not between", value1, value2, "sendExpressTime");
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

        public Criteria andCancelSignIsNull() {
            addCriterion("cancel_sign is null");
            return (Criteria) this;
        }

        public Criteria andCancelSignIsNotNull() {
            addCriterion("cancel_sign is not null");
            return (Criteria) this;
        }

        public Criteria andCancelSignEqualTo(String value) {
            addCriterion("cancel_sign =", value, "cancelSign");
            return (Criteria) this;
        }

        public Criteria andCancelSignNotEqualTo(String value) {
            addCriterion("cancel_sign <>", value, "cancelSign");
            return (Criteria) this;
        }

        public Criteria andCancelSignGreaterThan(String value) {
            addCriterion("cancel_sign >", value, "cancelSign");
            return (Criteria) this;
        }

        public Criteria andCancelSignGreaterThanOrEqualTo(String value) {
            addCriterion("cancel_sign >=", value, "cancelSign");
            return (Criteria) this;
        }

        public Criteria andCancelSignLessThan(String value) {
            addCriterion("cancel_sign <", value, "cancelSign");
            return (Criteria) this;
        }

        public Criteria andCancelSignLessThanOrEqualTo(String value) {
            addCriterion("cancel_sign <=", value, "cancelSign");
            return (Criteria) this;
        }

        public Criteria andCancelSignLike(String value) {
            addCriterion("cancel_sign like", value, "cancelSign");
            return (Criteria) this;
        }

        public Criteria andCancelSignNotLike(String value) {
            addCriterion("cancel_sign not like", value, "cancelSign");
            return (Criteria) this;
        }

        public Criteria andCancelSignIn(List<String> values) {
            addCriterion("cancel_sign in", values, "cancelSign");
            return (Criteria) this;
        }

        public Criteria andCancelSignNotIn(List<String> values) {
            addCriterion("cancel_sign not in", values, "cancelSign");
            return (Criteria) this;
        }

        public Criteria andCancelSignBetween(String value1, String value2) {
            addCriterion("cancel_sign between", value1, value2, "cancelSign");
            return (Criteria) this;
        }

        public Criteria andCancelSignNotBetween(String value1, String value2) {
            addCriterion("cancel_sign not between", value1, value2, "cancelSign");
            return (Criteria) this;
        }

        public Criteria andIdcardAIsNull() {
            addCriterion("idcard_a is null");
            return (Criteria) this;
        }

        public Criteria andIdcardAIsNotNull() {
            addCriterion("idcard_a is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardAEqualTo(String value) {
            addCriterion("idcard_a =", value, "idcardA");
            return (Criteria) this;
        }

        public Criteria andIdcardANotEqualTo(String value) {
            addCriterion("idcard_a <>", value, "idcardA");
            return (Criteria) this;
        }

        public Criteria andIdcardAGreaterThan(String value) {
            addCriterion("idcard_a >", value, "idcardA");
            return (Criteria) this;
        }

        public Criteria andIdcardAGreaterThanOrEqualTo(String value) {
            addCriterion("idcard_a >=", value, "idcardA");
            return (Criteria) this;
        }

        public Criteria andIdcardALessThan(String value) {
            addCriterion("idcard_a <", value, "idcardA");
            return (Criteria) this;
        }

        public Criteria andIdcardALessThanOrEqualTo(String value) {
            addCriterion("idcard_a <=", value, "idcardA");
            return (Criteria) this;
        }

        public Criteria andIdcardALike(String value) {
            addCriterion("idcard_a like", value, "idcardA");
            return (Criteria) this;
        }

        public Criteria andIdcardANotLike(String value) {
            addCriterion("idcard_a not like", value, "idcardA");
            return (Criteria) this;
        }

        public Criteria andIdcardAIn(List<String> values) {
            addCriterion("idcard_a in", values, "idcardA");
            return (Criteria) this;
        }

        public Criteria andIdcardANotIn(List<String> values) {
            addCriterion("idcard_a not in", values, "idcardA");
            return (Criteria) this;
        }

        public Criteria andIdcardABetween(String value1, String value2) {
            addCriterion("idcard_a between", value1, value2, "idcardA");
            return (Criteria) this;
        }

        public Criteria andIdcardANotBetween(String value1, String value2) {
            addCriterion("idcard_a not between", value1, value2, "idcardA");
            return (Criteria) this;
        }

        public Criteria andIdcardBIsNull() {
            addCriterion("idcard_b is null");
            return (Criteria) this;
        }

        public Criteria andIdcardBIsNotNull() {
            addCriterion("idcard_b is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardBEqualTo(String value) {
            addCriterion("idcard_b =", value, "idcardB");
            return (Criteria) this;
        }

        public Criteria andIdcardBNotEqualTo(String value) {
            addCriterion("idcard_b <>", value, "idcardB");
            return (Criteria) this;
        }

        public Criteria andIdcardBGreaterThan(String value) {
            addCriterion("idcard_b >", value, "idcardB");
            return (Criteria) this;
        }

        public Criteria andIdcardBGreaterThanOrEqualTo(String value) {
            addCriterion("idcard_b >=", value, "idcardB");
            return (Criteria) this;
        }

        public Criteria andIdcardBLessThan(String value) {
            addCriterion("idcard_b <", value, "idcardB");
            return (Criteria) this;
        }

        public Criteria andIdcardBLessThanOrEqualTo(String value) {
            addCriterion("idcard_b <=", value, "idcardB");
            return (Criteria) this;
        }

        public Criteria andIdcardBLike(String value) {
            addCriterion("idcard_b like", value, "idcardB");
            return (Criteria) this;
        }

        public Criteria andIdcardBNotLike(String value) {
            addCriterion("idcard_b not like", value, "idcardB");
            return (Criteria) this;
        }

        public Criteria andIdcardBIn(List<String> values) {
            addCriterion("idcard_b in", values, "idcardB");
            return (Criteria) this;
        }

        public Criteria andIdcardBNotIn(List<String> values) {
            addCriterion("idcard_b not in", values, "idcardB");
            return (Criteria) this;
        }

        public Criteria andIdcardBBetween(String value1, String value2) {
            addCriterion("idcard_b between", value1, value2, "idcardB");
            return (Criteria) this;
        }

        public Criteria andIdcardBNotBetween(String value1, String value2) {
            addCriterion("idcard_b not between", value1, value2, "idcardB");
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

        public Criteria andCopyIdcardPagesIsNull() {
            addCriterion("copy_idcard_pages is null");
            return (Criteria) this;
        }

        public Criteria andCopyIdcardPagesIsNotNull() {
            addCriterion("copy_idcard_pages is not null");
            return (Criteria) this;
        }

        public Criteria andCopyIdcardPagesEqualTo(Integer value) {
            addCriterion("copy_idcard_pages =", value, "copyIdcardPages");
            return (Criteria) this;
        }

        public Criteria andCopyIdcardPagesNotEqualTo(Integer value) {
            addCriterion("copy_idcard_pages <>", value, "copyIdcardPages");
            return (Criteria) this;
        }

        public Criteria andCopyIdcardPagesGreaterThan(Integer value) {
            addCriterion("copy_idcard_pages >", value, "copyIdcardPages");
            return (Criteria) this;
        }

        public Criteria andCopyIdcardPagesGreaterThanOrEqualTo(Integer value) {
            addCriterion("copy_idcard_pages >=", value, "copyIdcardPages");
            return (Criteria) this;
        }

        public Criteria andCopyIdcardPagesLessThan(Integer value) {
            addCriterion("copy_idcard_pages <", value, "copyIdcardPages");
            return (Criteria) this;
        }

        public Criteria andCopyIdcardPagesLessThanOrEqualTo(Integer value) {
            addCriterion("copy_idcard_pages <=", value, "copyIdcardPages");
            return (Criteria) this;
        }

        public Criteria andCopyIdcardPagesIn(List<Integer> values) {
            addCriterion("copy_idcard_pages in", values, "copyIdcardPages");
            return (Criteria) this;
        }

        public Criteria andCopyIdcardPagesNotIn(List<Integer> values) {
            addCriterion("copy_idcard_pages not in", values, "copyIdcardPages");
            return (Criteria) this;
        }

        public Criteria andCopyIdcardPagesBetween(Integer value1, Integer value2) {
            addCriterion("copy_idcard_pages between", value1, value2, "copyIdcardPages");
            return (Criteria) this;
        }

        public Criteria andCopyIdcardPagesNotBetween(Integer value1, Integer value2) {
            addCriterion("copy_idcard_pages not between", value1, value2, "copyIdcardPages");
            return (Criteria) this;
        }

        public Criteria andCopyIdcardAmountIsNull() {
            addCriterion("copy_idcard_amount is null");
            return (Criteria) this;
        }

        public Criteria andCopyIdcardAmountIsNotNull() {
            addCriterion("copy_idcard_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCopyIdcardAmountEqualTo(Double value) {
            addCriterion("copy_idcard_amount =", value, "copyIdcardAmount");
            return (Criteria) this;
        }

        public Criteria andCopyIdcardAmountNotEqualTo(Double value) {
            addCriterion("copy_idcard_amount <>", value, "copyIdcardAmount");
            return (Criteria) this;
        }

        public Criteria andCopyIdcardAmountGreaterThan(Double value) {
            addCriterion("copy_idcard_amount >", value, "copyIdcardAmount");
            return (Criteria) this;
        }

        public Criteria andCopyIdcardAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("copy_idcard_amount >=", value, "copyIdcardAmount");
            return (Criteria) this;
        }

        public Criteria andCopyIdcardAmountLessThan(Double value) {
            addCriterion("copy_idcard_amount <", value, "copyIdcardAmount");
            return (Criteria) this;
        }

        public Criteria andCopyIdcardAmountLessThanOrEqualTo(Double value) {
            addCriterion("copy_idcard_amount <=", value, "copyIdcardAmount");
            return (Criteria) this;
        }

        public Criteria andCopyIdcardAmountIn(List<Double> values) {
            addCriterion("copy_idcard_amount in", values, "copyIdcardAmount");
            return (Criteria) this;
        }

        public Criteria andCopyIdcardAmountNotIn(List<Double> values) {
            addCriterion("copy_idcard_amount not in", values, "copyIdcardAmount");
            return (Criteria) this;
        }

        public Criteria andCopyIdcardAmountBetween(Double value1, Double value2) {
            addCriterion("copy_idcard_amount between", value1, value2, "copyIdcardAmount");
            return (Criteria) this;
        }

        public Criteria andCopyIdcardAmountNotBetween(Double value1, Double value2) {
            addCriterion("copy_idcard_amount not between", value1, value2, "copyIdcardAmount");
            return (Criteria) this;
        }

        public Criteria andExpressOrdercodeIsNull() {
            addCriterion("express_ordercode is null");
            return (Criteria) this;
        }

        public Criteria andExpressOrdercodeIsNotNull() {
            addCriterion("express_ordercode is not null");
            return (Criteria) this;
        }

        public Criteria andExpressOrdercodeEqualTo(String value) {
            addCriterion("express_ordercode =", value, "expressOrdercode");
            return (Criteria) this;
        }

        public Criteria andExpressOrdercodeNotEqualTo(String value) {
            addCriterion("express_ordercode <>", value, "expressOrdercode");
            return (Criteria) this;
        }

        public Criteria andExpressOrdercodeGreaterThan(String value) {
            addCriterion("express_ordercode >", value, "expressOrdercode");
            return (Criteria) this;
        }

        public Criteria andExpressOrdercodeGreaterThanOrEqualTo(String value) {
            addCriterion("express_ordercode >=", value, "expressOrdercode");
            return (Criteria) this;
        }

        public Criteria andExpressOrdercodeLessThan(String value) {
            addCriterion("express_ordercode <", value, "expressOrdercode");
            return (Criteria) this;
        }

        public Criteria andExpressOrdercodeLessThanOrEqualTo(String value) {
            addCriterion("express_ordercode <=", value, "expressOrdercode");
            return (Criteria) this;
        }

        public Criteria andExpressOrdercodeLike(String value) {
            addCriterion("express_ordercode like", value, "expressOrdercode");
            return (Criteria) this;
        }

        public Criteria andExpressOrdercodeNotLike(String value) {
            addCriterion("express_ordercode not like", value, "expressOrdercode");
            return (Criteria) this;
        }

        public Criteria andExpressOrdercodeIn(List<String> values) {
            addCriterion("express_ordercode in", values, "expressOrdercode");
            return (Criteria) this;
        }

        public Criteria andExpressOrdercodeNotIn(List<String> values) {
            addCriterion("express_ordercode not in", values, "expressOrdercode");
            return (Criteria) this;
        }

        public Criteria andExpressOrdercodeBetween(String value1, String value2) {
            addCriterion("express_ordercode between", value1, value2, "expressOrdercode");
            return (Criteria) this;
        }

        public Criteria andExpressOrdercodeNotBetween(String value1, String value2) {
            addCriterion("express_ordercode not between", value1, value2, "expressOrdercode");
            return (Criteria) this;
        }

        public Criteria andExpressAmountIsNull() {
            addCriterion("express_amount is null");
            return (Criteria) this;
        }

        public Criteria andExpressAmountIsNotNull() {
            addCriterion("express_amount is not null");
            return (Criteria) this;
        }

        public Criteria andExpressAmountEqualTo(String value) {
            addCriterion("express_amount =", value, "expressAmount");
            return (Criteria) this;
        }

        public Criteria andExpressAmountNotEqualTo(String value) {
            addCriterion("express_amount <>", value, "expressAmount");
            return (Criteria) this;
        }

        public Criteria andExpressAmountGreaterThan(String value) {
            addCriterion("express_amount >", value, "expressAmount");
            return (Criteria) this;
        }

        public Criteria andExpressAmountGreaterThanOrEqualTo(String value) {
            addCriterion("express_amount >=", value, "expressAmount");
            return (Criteria) this;
        }

        public Criteria andExpressAmountLessThan(String value) {
            addCriterion("express_amount <", value, "expressAmount");
            return (Criteria) this;
        }

        public Criteria andExpressAmountLessThanOrEqualTo(String value) {
            addCriterion("express_amount <=", value, "expressAmount");
            return (Criteria) this;
        }

        public Criteria andExpressAmountLike(String value) {
            addCriterion("express_amount like", value, "expressAmount");
            return (Criteria) this;
        }

        public Criteria andExpressAmountNotLike(String value) {
            addCriterion("express_amount not like", value, "expressAmount");
            return (Criteria) this;
        }

        public Criteria andExpressAmountIn(List<String> values) {
            addCriterion("express_amount in", values, "expressAmount");
            return (Criteria) this;
        }

        public Criteria andExpressAmountNotIn(List<String> values) {
            addCriterion("express_amount not in", values, "expressAmount");
            return (Criteria) this;
        }

        public Criteria andExpressAmountBetween(String value1, String value2) {
            addCriterion("express_amount between", value1, value2, "expressAmount");
            return (Criteria) this;
        }

        public Criteria andExpressAmountNotBetween(String value1, String value2) {
            addCriterion("express_amount not between", value1, value2, "expressAmount");
            return (Criteria) this;
        }

        public Criteria andSurchargeIsNull() {
            addCriterion("surcharge is null");
            return (Criteria) this;
        }

        public Criteria andSurchargeIsNotNull() {
            addCriterion("surcharge is not null");
            return (Criteria) this;
        }

        public Criteria andSurchargeEqualTo(String value) {
            addCriterion("surcharge =", value, "surcharge");
            return (Criteria) this;
        }

        public Criteria andSurchargeNotEqualTo(String value) {
            addCriterion("surcharge <>", value, "surcharge");
            return (Criteria) this;
        }

        public Criteria andSurchargeGreaterThan(String value) {
            addCriterion("surcharge >", value, "surcharge");
            return (Criteria) this;
        }

        public Criteria andSurchargeGreaterThanOrEqualTo(String value) {
            addCriterion("surcharge >=", value, "surcharge");
            return (Criteria) this;
        }

        public Criteria andSurchargeLessThan(String value) {
            addCriterion("surcharge <", value, "surcharge");
            return (Criteria) this;
        }

        public Criteria andSurchargeLessThanOrEqualTo(String value) {
            addCriterion("surcharge <=", value, "surcharge");
            return (Criteria) this;
        }

        public Criteria andSurchargeLike(String value) {
            addCriterion("surcharge like", value, "surcharge");
            return (Criteria) this;
        }

        public Criteria andSurchargeNotLike(String value) {
            addCriterion("surcharge not like", value, "surcharge");
            return (Criteria) this;
        }

        public Criteria andSurchargeIn(List<String> values) {
            addCriterion("surcharge in", values, "surcharge");
            return (Criteria) this;
        }

        public Criteria andSurchargeNotIn(List<String> values) {
            addCriterion("surcharge not in", values, "surcharge");
            return (Criteria) this;
        }

        public Criteria andSurchargeBetween(String value1, String value2) {
            addCriterion("surcharge between", value1, value2, "surcharge");
            return (Criteria) this;
        }

        public Criteria andSurchargeNotBetween(String value1, String value2) {
            addCriterion("surcharge not between", value1, value2, "surcharge");
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

        public Criteria andCopyRecordTimeIsNull() {
            addCriterion("copy_record_time is null");
            return (Criteria) this;
        }

        public Criteria andCopyRecordTimeIsNotNull() {
            addCriterion("copy_record_time is not null");
            return (Criteria) this;
        }

        public Criteria andCopyRecordTimeEqualTo(Date value) {
            addCriterion("copy_record_time =", value, "copyRecordTime");
            return (Criteria) this;
        }

        public Criteria andCopyRecordTimeNotEqualTo(Date value) {
            addCriterion("copy_record_time <>", value, "copyRecordTime");
            return (Criteria) this;
        }

        public Criteria andCopyRecordTimeGreaterThan(Date value) {
            addCriterion("copy_record_time >", value, "copyRecordTime");
            return (Criteria) this;
        }

        public Criteria andCopyRecordTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("copy_record_time >=", value, "copyRecordTime");
            return (Criteria) this;
        }

        public Criteria andCopyRecordTimeLessThan(Date value) {
            addCriterion("copy_record_time <", value, "copyRecordTime");
            return (Criteria) this;
        }

        public Criteria andCopyRecordTimeLessThanOrEqualTo(Date value) {
            addCriterion("copy_record_time <=", value, "copyRecordTime");
            return (Criteria) this;
        }

        public Criteria andCopyRecordTimeIn(List<Date> values) {
            addCriterion("copy_record_time in", values, "copyRecordTime");
            return (Criteria) this;
        }

        public Criteria andCopyRecordTimeNotIn(List<Date> values) {
            addCriterion("copy_record_time not in", values, "copyRecordTime");
            return (Criteria) this;
        }

        public Criteria andCopyRecordTimeBetween(Date value1, Date value2) {
            addCriterion("copy_record_time between", value1, value2, "copyRecordTime");
            return (Criteria) this;
        }

        public Criteria andCopyRecordTimeNotBetween(Date value1, Date value2) {
            addCriterion("copy_record_time not between", value1, value2, "copyRecordTime");
            return (Criteria) this;
        }

        public Criteria andOriginIsNull() {
            addCriterion("origin is null");
            return (Criteria) this;
        }

        public Criteria andOriginIsNotNull() {
            addCriterion("origin is not null");
            return (Criteria) this;
        }

        public Criteria andOriginEqualTo(Integer value) {
            addCriterion("origin =", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotEqualTo(Integer value) {
            addCriterion("origin <>", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginGreaterThan(Integer value) {
            addCriterion("origin >", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginGreaterThanOrEqualTo(Integer value) {
            addCriterion("origin >=", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLessThan(Integer value) {
            addCriterion("origin <", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLessThanOrEqualTo(Integer value) {
            addCriterion("origin <=", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginIn(List<Integer> values) {
            addCriterion("origin in", values, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotIn(List<Integer> values) {
            addCriterion("origin not in", values, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginBetween(Integer value1, Integer value2) {
            addCriterion("origin between", value1, value2, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotBetween(Integer value1, Integer value2) {
            addCriterion("origin not between", value1, value2, "origin");
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