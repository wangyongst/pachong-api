package com.myweb.pojo;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Fishery {
    private int id;
    private String name;
    private String address;
    private String bindStatus;
    private String bindAddress;
    private String sellStatus;

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
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String userId) {
        this.address = userId;
    }

    @Basic
    @Column(name = "bind_status")
    public String getBindStatus() {
        return bindStatus;
    }

    public void setBindStatus(String bindStatus) {
        this.bindStatus = bindStatus;
    }

    @Basic
    @Column(name = "bind_address")
    public String getBindAddress() {
        return bindAddress;
    }

    public void setBindAddress(String bindAddress) {
        this.bindAddress = bindAddress;
    }

    @Basic
    @Column(name = "sell_status")
    public String getSellStatus() {
        return sellStatus;
    }

    public void setSellStatus(String sellStatus) {
        this.sellStatus = sellStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fishery fishery = (Fishery) o;
        return id == fishery.id &&
                Objects.equals(name, fishery.name) &&
                Objects.equals(address, fishery.address) &&
                Objects.equals(bindStatus, fishery.bindStatus) &&
                Objects.equals(bindAddress, fishery.bindAddress) &&
                Objects.equals(sellStatus, fishery.sellStatus);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, address, bindStatus, bindAddress, sellStatus);
    }
}
