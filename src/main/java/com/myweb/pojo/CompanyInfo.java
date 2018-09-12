package com.myweb.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "companyinfo")
public class CompanyInfo {
    private String no;
    private String enname;
    private String address;
    private String infono;
    private String corpname;
    private String corpename;
    private String branchname;
    private String branchename;

    @Column(name = "no")
    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
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
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "infono")
    public String getInfono() {
        return infono;
    }

    public void setInfono(String infono) {
        this.infono = infono;
    }

    @Basic
    @Column(name = "corpname")
    public String getCorpname() {
        return corpname;
    }

    public void setCorpname(String corpname) {
        this.corpname = corpname;
    }

    @Basic
    @Column(name = "corpename")
    public String getCorpename() {
        return corpename;
    }

    public void setCorpename(String corpename) {
        this.corpename = corpename;
    }

    @Basic
    @Column(name = "branchname")
    public String getBranchname() {
        return branchname;
    }

    public void setBranchname(String branchname) {
        this.branchname = branchname;
    }

    @Basic
    @Column(name = "branchename")
    public String getBranchename() {
        return branchename;
    }

    public void setBranchename(String branchename) {
        this.branchename = branchename;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompanyInfo companyInfo = (CompanyInfo) o;
        return Objects.equals(no, companyInfo.no) &&
                Objects.equals(enname, companyInfo.enname) &&
                Objects.equals(address, companyInfo.address) &&
                Objects.equals(infono, companyInfo.infono) &&
                Objects.equals(corpname, companyInfo.corpname) &&
                Objects.equals(corpename, companyInfo.corpename) &&
                Objects.equals(branchname, companyInfo.branchname) &&
                Objects.equals(branchename, companyInfo.branchename);
    }

    @Override
    public int hashCode() {

        return Objects.hash(no, enname, address, infono, corpname, corpename, branchname, branchename);
    }
}
