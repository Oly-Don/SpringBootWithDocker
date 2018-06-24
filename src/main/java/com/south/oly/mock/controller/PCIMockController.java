package com.south.oly.mock.controller;


import com.south.oly.mock.entity.Ticket;
import com.south.oly.mock.entity.TicketResponce;
import com.south.oly.mock.service.IPCIMockService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/")
public class PCIMockController {

    @Resource
    IPCIMockService ipciMockService;

    @PostMapping(value = "/tickets", produces = "application/json")
    public List<Ticket> queryTickets() {
        return ipciMockService.findAll();
    }

    @GetMapping(value = "/ticket/{targetCity}", produces = "application/json")
    public List<Ticket> queryTickets(@PathVariable(value = "targetCity") String targetCity) {
        return ipciMockService.findByTargetCity(targetCity);
    }

    @PostMapping(value = "/saveticket", produces = "application/json")
    public TicketResponce saveTickets(@RequestParam(required = false) Ticket ticket) {
        return ipciMockService.save(ticket);
    }
}
