package com.myweb.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Refer {
    private int id;
    private String txhash;
    private String referCode;
    private Integer status;
    private String createTime;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "txhash", nullable = true, length = 255)
    public String getTxhash() {
        return txhash;
    }

    public void setTxhash(String txhash) {
        this.txhash = txhash;
    }

    @Basic
    @Column(name = "refer_code", nullable = true, length = 255)
    public String getReferCode() {
        return referCode;
    }

    public void setReferCode(String referCode) {
        this.referCode = referCode;
    }

    @Basic
    @Column(name = "status", nullable = true)
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Basic
    @Column(name = "create_time", nullable = true, length = 255)
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Refer refer = (Refer) o;

        if (id != refer.id) return false;
        if (txhash != null ? !txhash.equals(refer.txhash) : refer.txhash != null) return false;
        if (referCode != null ? !referCode.equals(refer.referCode) : refer.referCode != null) return false;
        if (status != null ? !status.equals(refer.status) : refer.status != null) return false;
        if (createTime != null ? !createTime.equals(refer.createTime) : refer.createTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (txhash != null ? txhash.hashCode() : 0);
        result = 31 * result + (referCode != null ? referCode.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        return result;
    }
}
