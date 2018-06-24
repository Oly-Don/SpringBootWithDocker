package com.south.oly.mock.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ticket")
public class Ticket {


    // CREATE TABLE ticket (id integer, targetcity varchar(255),startcity varchar(255),    targetdate date,startdate date,classtype  varchar(255),    retuencode integer,retueninfo  varchar(255),retuenremark  varchar(255));
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "targetcity")
    private String targetCity;
    @Column(name = "startcity")
    private String startCity;
    @Column(name = "targetdate")
    private java.util.Date targetDate;
    @Column(name = "startdate")
    private Date startDate;
    @Column(name = "classtype")
    private String classType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTargetCity() {
        return targetCity;
    }

    public void setTargetCity(String targetCity) {
        this.targetCity = targetCity;
    }

    public String getStartCity() {
        return startCity;
    }

    public void setStartCity(String startCity) {
        this.startCity = startCity;
    }

    public Date getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(Date targetDate) {
        this.targetDate = targetDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }
}
