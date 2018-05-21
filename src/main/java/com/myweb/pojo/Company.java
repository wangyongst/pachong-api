package com.myweb.pojo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "company")
public class Company {
    private String no;
    private String name;
    private String enname;
    private String type;
    private String incorporation;
    private String status;
    private String remarks;
    private String mode;
    private String dissorexit;
    private String charges;
    private String note;

    @Id
    @Column(name = "no")
    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
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
    @Column(name = "enname")
    public String getEnname() {
        return enname;
    }

    public void setEnname(String enname) {
        this.enname = enname;
    }

    @Basic
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "incorporation")
    public String getIncorporation() {
        return incorporation;
    }

    public void setIncorporation(String incorporation) {
        this.incorporation = incorporation;
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
    @Column(name = "remarks")
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Basic
    @Column(name = "mode")
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    @Basic
    @Column(name = "dissorexit")
    public String getDissorexit() {
        return dissorexit;
    }

    public void setDissorexit(String dissorexit) {
        this.dissorexit = dissorexit;
    }

    @Basic
    @Column(name = "charges")
    public String getCharges() {
        return charges;
    }

    public void setCharges(String charges) {
        this.charges = charges;
    }

    @Basic
    @Column(name = "note")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(no, company.no) &&
                Objects.equals(name, company.name) &&
                Objects.equals(enname, company.enname) &&
                Objects.equals(type, company.type) &&
                Objects.equals(incorporation, company.incorporation) &&
                Objects.equals(status, company.status) &&
                Objects.equals(remarks, company.remarks) &&
                Objects.equals(mode, company.mode) &&
                Objects.equals(dissorexit, company.dissorexit) &&
                Objects.equals(charges, company.charges) &&
                Objects.equals(note, company.note);
    }

    @Override
    public int hashCode() {

        return Objects.hash(no, name, enname, type, incorporation, status, remarks, mode, dissorexit, charges, note);
    }
}
