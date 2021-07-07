package com.project.ticketservice.entity;

import lombok.Getter;

import java.security.SecureRandom;

@Getter
public enum PriorityType {
    URGENT("Acil"),
    LOW("Düşük Öncelik"),
    HİGH("Yüksek Öncelik");
    private String label;
    PriorityType(String label){
        this.label=label;
    }
}
