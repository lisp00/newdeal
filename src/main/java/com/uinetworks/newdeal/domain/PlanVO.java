package com.uinetworks.newdeal.domain;

import lombok.Data;

import java.time.LocalDate;

@Data
public class PlanVO {
    private int palnNum;
    private LocalDate editBegin;
    private LocalDate editEnd;
    private LocalDate inspectionBegin;
    private LocalDate inspectionEnd;
}
