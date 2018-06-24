package com.south.oly.mock.dao.impl;

import com.south.oly.mock.dao.IPCIMockDao;
import com.south.oly.mock.entity.Ticket;

import java.util.Date;
import java.util.List;

public class PCIMockDaoImpl implements IPCIMockDao {

    @Override
    public List<Ticket> queryTicket(String TargetCity, String StartCity, Date TargetDate, Date StartDate, String ClassType) {
        //Todo
        return null;
    }
}
