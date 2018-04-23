package com.myweb.pojo;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "refer")
public class Refer {
    private int id;
    private String txhash;
    private String referCode;
    private String status;
    private String createTime;
    private BigDecimal referFee;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "txhash")
    public String getTxhash() {
        return txhash;
    }

    public void setTxhash(String txhash) {
        this.txhash = txhash;
    }

    @Basic
    @Column(name = "refer_code")
    public String getReferCode() {
        return referCode;
    }

    public void setReferCode(String referCode) {
        this.referCode = referCode;
    }

    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "create_time")
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "refer_fee")
    public BigDecimal getReferFee() {
        return referFee;
    }

    public void setReferFee(BigDecimal referFee) {
        this.referFee = referFee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Refer refer = (Refer) o;
        return id == refer.id &&
                Objects.equals(txhash, refer.txhash) &&
                Objects.equals(referCode, refer.referCode) &&
                Objects.equals(status, refer.status) &&
                Objects.equals(createTime, refer.createTime) &&
                Objects.equals(referFee, refer.referFee);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, txhash, referCode, status, createTime, referFee);
    }
}
