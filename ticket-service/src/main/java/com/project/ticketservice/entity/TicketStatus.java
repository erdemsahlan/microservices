package com.project.ticketservice.entity;

import lombok.Getter;

@Getter
public enum TicketStatus {
        OPEN("Açık"),
    IN_PROGRESS("Üzerinde Çalışılıyor"),
    RESULT("Çözüldü"),
    CLOSE("Kapandı");
    private String label;
    TicketStatus(String label){
        this.label=label;
    }
}
