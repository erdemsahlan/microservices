package com.project.ticketservice.service.impl;

import com.project.ticketservice.dto.TicketDto;
import com.project.ticketservice.entity.PriorityType;
import com.project.ticketservice.entity.Ticket;
import com.project.ticketservice.entity.TicketStatus;
import com.project.ticketservice.entity.elasticSearch.TicketModel;
import com.project.ticketservice.repository.TicketRepository;
import com.project.ticketservice.repository.elasticSearch.TicketElasticRepository;
import com.project.ticketservice.service.TicketService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.annotation.Transient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class TicketServiceImpl implements TicketService {

    private final ElasticsearchRepository elasticsearchRepository;
    private final TicketRepository ticketRepository;
    private final TicketElasticRepository ticketElasticRepository;


    @Override
    @Transactional
    public TicketDto save(TicketDto ticketDto) {
        //Ticket Entity
        Ticket ticket= new Ticket();
        //TODO account API dan doğrula
        //ticket.setAssignee();

        if (ticketDto.getDescription() == null)
            throw new IllegalArgumentException("Description bos olamaz");


        ticket.setDescription(ticketDto.getDescription());
        ticket.setNotes(ticketDto.getNotes());
        ticketDto.setTicketDate(ticketDto.getTicketDate());
        ticket.setTicketStatus(TicketStatus.valueOf(ticketDto.getTicketStatus()));
        ticket.setPriorityType(PriorityType.valueOf(ticketDto.getPriorityType()));

        //MySql kaydet
        ticket=ticketRepository.save(ticket);

        //ticketmodel nesnesi yarat
        TicketModel model = TicketModel.builder()
                                    .description(ticket.getDescription())
                                    .notes(ticket.getNotes())
                                    .id(ticket.getId())
                                    .priorityType(ticket.getPriorityType().getLabel())
                                    .ticketStatus(ticket.getTicketStatus().getLabel())
                                    .ticketDate(ticket.getTicketDate()).build();

        //elastic kaydet
        ticketElasticRepository.save(model);

        //uluşan nesneyi döndür
        ticketDto.setId(ticket.getId());

        return ticketDto;
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
