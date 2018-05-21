package com.myweb.vo;

import com.myweb.pojo.Company;
import com.myweb.pojo.Docfile;
import com.myweb.pojo.History;

import java.util.List;

public class AllThings {
    private Company company;
    private List<History> histories;
    private List<Docfile> docfiles;

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<History> getHistories() {
        return histories;
    }

    public void setHistories(List<History> histories) {
        this.histories = histories;
    }

    public List<Docfile> getDocfiles() {
        return docfiles;
    }

    public void setDocfiles(List<Docfile> docfiles) {
        this.docfiles = docfiles;
    }
}
