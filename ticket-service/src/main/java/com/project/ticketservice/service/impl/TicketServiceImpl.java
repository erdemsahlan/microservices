package com.project.ticketservice.service.impl;

import com.project.ticketservice.dto.TicketDto;
import com.project.ticketservice.service.TicketService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class TicketServiceImpl implements TicketService {
    @Override
    public TicketDto save(TicketDto ticketDto) {
        return null;
    }

    @Override
    public TicketDto update(String id,TicketDto ticketDto) {
        return null;
    }

    @Override
    public Page<TicketDto> getPagination(Pageable pageable) {
        return null;
    }

    @Override
    public TicketDto getById(String ticketId) {
        return null;
    }
}
