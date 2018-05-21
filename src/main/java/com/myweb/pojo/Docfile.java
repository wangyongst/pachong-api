package com.myweb.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "docfile")
public class Docfile{
    private String id;
    private String no;
    private String name;
    private String year;
    private String submission;
    private String status;

    @Basic
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
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
    @Column(name = "year")
    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Id
    @Column(name = "submission")
    public String getSubmission() {
        return submission;
    }

    public void setSubmission(String submission) {
        this.submission = submission;
    }

    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Docfile docfile = (Docfile) o;
        return Objects.equals(id, docfile.id) &&
                Objects.equals(no, docfile.no) &&
                Objects.equals(name, docfile.name) &&
                Objects.equals(year, docfile.year) &&
                Objects.equals(submission, docfile.submission) &&
                Objects.equals(status, docfile.status);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, no, name, year, submission, status);
    }
}
