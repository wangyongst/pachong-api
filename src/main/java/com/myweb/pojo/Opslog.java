package com.myweb.pojo;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Opslog {
    private int id;
    private int userId;
    private String action;
    private String txhash;
    private String memo;
    private String actionTime;

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
    @Column(name = "user_id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "action")
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
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
    @Column(name = "memo")
    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @Basic
    @Column(name = "action_time")
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
        return id == opslog.id &&
                userId == opslog.userId &&
                Objects.equals(action, opslog.action) &&
                Objects.equals(txhash, opslog.txhash) &&
                Objects.equals(memo, opslog.memo) &&
                Objects.equals(actionTime, opslog.actionTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, userId, action, txhash, memo, actionTime);
    }
}
