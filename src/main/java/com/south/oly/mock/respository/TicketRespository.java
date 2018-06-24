package com.south.oly.mock.respository;

import com.south.oly.mock.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TicketRespository extends JpaRepository<Ticket, Long> {

    List<Ticket> findByTargetCity(String targetCity);
}
