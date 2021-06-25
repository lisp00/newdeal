package com.uinetworks.newdeal.domain;

import lombok.Data;

import java.util.Date;

@Data
public class GridVO {
    private int gridId;
    private String initGrdTp;
    private String finGrdTp;
    private Date uDe;
    private Date inspDe;
    private Date inspRde;
    private String cWkr;
    private String uWkr;
    private String inspWkr;
    private String inspRwkr;
    private String inspNd;
}
