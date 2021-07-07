package com.project.ticketservice.dto;

import com.project.ticketservice.entity.PriorityType;
import com.project.ticketservice.entity.TicketStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TicketDto {

    private String id;
    private String description;
    private String notes;
    private String assignee;
    private Date ticketDate;
    private String  priorityType;
    private String ticketStatus;
}
