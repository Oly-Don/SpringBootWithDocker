package com.south.oly.mock.dao;

import com.south.oly.mock.entity.Ticket;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Resource
public interface IPCIMockDao {
    List<Ticket> queryTicket(String TargetCity, String StartCity, Date TargetDate, Date StartDate, String ClassType);
}
