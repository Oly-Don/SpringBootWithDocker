package com.south.oly.mock.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ticket")
public class TicketResponce implements Serializable {

    private static final long serialVersionUID = 1L;
    // CREATE TABLE ticket (id integer, targetcity varchar(255),startcity varchar(255),
    // targetdate date,startdate date,classtype  varchar(255),
    // retuencode integer,retueninfo  varchar(255),retuenremark  varchar(255));
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "retuencode")
    private Integer code;
    @Column(name = "retueninfo")
    private String errorInfo;
    @Column(name = "retuenremark")
    private String remark;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
