package com.myweb.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Fishery {
    private int id;
    private String name;
    private String owner;
    private String bindStatus;
    private String bindAddress;
    private Integer sellStatus;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "owner", nullable = true, length = 255)
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Basic
    @Column(name = "bind_status", nullable = true, length = 255)
    public String getBindStatus() {
        return bindStatus;
    }

    public void setBindStatus(String bindStatus) {
        this.bindStatus = bindStatus;
    }

    @Basic
    @Column(name = "bind_address", nullable = true, length = 255)
    public String getBindAddress() {
        return bindAddress;
    }

    public void setBindAddress(String bindAddress) {
        this.bindAddress = bindAddress;
    }

    @Basic
    @Column(name = "sell_status", nullable = true)
    public Integer getSellStatus() {
        return sellStatus;
    }

    public void setSellStatus(Integer sellStatus) {
        this.sellStatus = sellStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Fishery fishery = (Fishery) o;

        if (id != fishery.id) return false;
        if (name != null ? !name.equals(fishery.name) : fishery.name != null) return false;
        if (owner != null ? !owner.equals(fishery.owner) : fishery.owner != null) return false;
        if (bindStatus != null ? !bindStatus.equals(fishery.bindStatus) : fishery.bindStatus != null) return false;
        if (bindAddress != null ? !bindAddress.equals(fishery.bindAddress) : fishery.bindAddress != null) return false;
        if (sellStatus != null ? !sellStatus.equals(fishery.sellStatus) : fishery.sellStatus != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (owner != null ? owner.hashCode() : 0);
        result = 31 * result + (bindStatus != null ? bindStatus.hashCode() : 0);
        result = 31 * result + (bindAddress != null ? bindAddress.hashCode() : 0);
        result = 31 * result + (sellStatus != null ? sellStatus.hashCode() : 0);
        return result;
    }
}
