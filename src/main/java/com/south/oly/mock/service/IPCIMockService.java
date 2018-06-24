package com.south.oly.mock.service;

import com.south.oly.mock.entity.Ticket;
import com.south.oly.mock.entity.TicketResponce;

import java.util.List;

public interface IPCIMockService {

    List<Ticket> findByTargetCity(String TargetCity);

    List<Ticket> findAll();

    TicketResponce save(Ticket ticket);
}
