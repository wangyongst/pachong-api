package com.myweb.pojo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "history")
public class History {
    private String no;
    private String date;
    private String name;
    private String enname;

    @Basic
    @Column(name = "no")
    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    @Id
    @Column(name = "date")
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        History history = (History) o;
        return Objects.equals(no, history.no) &&
                Objects.equals(date, history.date) &&
                Objects.equals(name, history.name) &&
                Objects.equals(enname, history.enname);
    }

    @Override
    public int hashCode() {

        return Objects.hash(no, date, name, enname);
    }
}
