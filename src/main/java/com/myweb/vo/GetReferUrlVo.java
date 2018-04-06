package com.myweb.vo;

import java.math.BigDecimal;

public class GetReferUrlVo {

    private String referCode;
    private int referCount;
    private BigDecimal sumReferFee;

    public String getReferCode() {
        return referCode;
    }

    public void setReferCode(String referCode) {
        this.referCode = referCode;
    }

    public int getReferCount() {
        return referCount;
    }

    public void setReferCount(int referCount) {
        this.referCount = referCount;
    }

    public BigDecimal getSumReferFee() {
        return sumReferFee;
    }

    public void setSumReferFee(BigDecimal sumReferFee) {
        this.sumReferFee = sumReferFee;
    }
}
