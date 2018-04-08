package com.myweb.pojo;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class User {
    private int id;
    private String address;
    private String signMessage;
    private String signedMessage;
    private String nickName;
    private String avatar;
    private String referCode;

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
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "sign_message")
    public String getSignMessage() {
        return signMessage;
    }

    public void setSignMessage(String signMessage) {
        this.signMessage = signMessage;
    }

    @Basic
    @Column(name = "signed_message")
    public String getSignedMessage() {
        return signedMessage;
    }

    public void setSignedMessage(String signedMessage) {
        this.signedMessage = signedMessage;
    }

    @Basic
    @Column(name = "nick_name")
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Basic
    @Column(name = "avatar")
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Basic
    @Column(name = "refer_code")
    public String getReferCode() {
        return referCode;
    }

    public void setReferCode(String referCode) {
        this.referCode = referCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                Objects.equals(address, user.address) &&
                Objects.equals(signMessage, user.signMessage) &&
                Objects.equals(signedMessage, user.signedMessage) &&
                Objects.equals(nickName, user.nickName) &&
                Objects.equals(avatar, user.avatar) &&
                Objects.equals(referCode, user.referCode);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, address, signMessage, signedMessage, nickName, avatar, referCode);
    }
}
