package com.uinetworks.newdeal.domain;

import lombok.Data;

import java.util.Date;

@Data
public class GridVO {
    private int gridId;
    private Boolean initGrdTp;
    private Boolean finGrdTp;
    private Date lv1De;
    private String lv1Wkr;
    private Date lv2De;
    private String lv2Wkr;
    private Date lv3De;
    private String lv3Wkr;
    private Date lv4De;
    private String lv4Wkr;
    private String guName;
    private Date verify1De;
    private Date verify2De;
    private Boolean insp1Nd;
    private Date insp1De;
    private Date insp1Rde;
    private String insp1Wkr;
    private String insp1Rwkr;
    private Boolean insp2Nd;
    private Date insp2De;
    private Date insp2Rde;
    private String insp2Wkr;
    private String insp2Rwkr;
    private int workLevel;
}
