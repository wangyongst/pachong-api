package com.myweb.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Opslog {
    private int id;
    private int userId;
    private String action;
    private String txhash;
    private String memo;
    private String actionTime;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "user_id", nullable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "action", nullable = true, length = 255)
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
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
    @Column(name = "memo", nullable = true, length = 255)
    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @Basic
    @Column(name = "action_time", nullable = true, length = 0)
    public String getActionTime() {
        return actionTime;
    }

    public void setActionTime(String actionTime) {
        this.actionTime = actionTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Opslog opslog = (Opslog) o;

        if (id != opslog.id) return false;
        if (userId != opslog.userId) return false;
        if (action != null ? !action.equals(opslog.action) : opslog.action != null) return false;
        if (txhash != null ? !txhash.equals(opslog.txhash) : opslog.txhash != null) return false;
        if (memo != null ? !memo.equals(opslog.memo) : opslog.memo != null) return false;
        if (actionTime != null ? !actionTime.equals(opslog.actionTime) : opslog.actionTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + userId;
        result = 31 * result + (action != null ? action.hashCode() : 0);
        result = 31 * result + (txhash != null ? txhash.hashCode() : 0);
        result = 31 * result + (memo != null ? memo.hashCode() : 0);
        result = 31 * result + (actionTime != null ? actionTime.hashCode() : 0);
        return result;
    }
}
