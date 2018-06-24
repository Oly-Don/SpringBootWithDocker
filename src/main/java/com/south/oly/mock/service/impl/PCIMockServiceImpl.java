package com.south.oly.mock.service.impl;

import com.south.oly.mock.entity.Ticket;
import com.south.oly.mock.entity.TicketResponce;
import com.south.oly.mock.respository.TicketRespository;
import com.south.oly.mock.service.IPCIMockService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PCIMockServiceImpl implements IPCIMockService {

//    @Resource
//    IPCIMockDao ipciMockDao;

    @Resource
    TicketRespository ticketRespository;

    @Override
    public List<Ticket> findByTargetCity(String targetCity) {
//        return ipciMockDao.queryTicket(targetCity,null,null,null,null);
        return ticketRespository.findByTargetCity(targetCity);
    }

    @Override
    public List<Ticket> findAll() {
        return ticketRespository.findAll();
    }

    @Override
    public TicketResponce save(Ticket ticket) {
        TicketResponce ticketResponce = new TicketResponce();
        Ticket save = null;
        try {
            save = ticketRespository.save(ticket);
        } catch (Exception e) {
            e.printStackTrace();
            ticketResponce.setErrorInfo(e.getMessage());
        }
        ticketResponce.setCode(save == null ? 1 : 0);
        ticketResponce.setRemark(save == null ? null : save.getId() + "==>" + save.getTargetCity() + ":" + save.getTargetDate());
        return ticketResponce;
    }

}
