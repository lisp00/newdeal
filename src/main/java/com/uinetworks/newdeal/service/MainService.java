package com.uinetworks.newdeal.service;


import com.uinetworks.newdeal.domain.GridVO;
import com.uinetworks.newdeal.domain.PlanVO;
import com.uinetworks.newdeal.domain.StGridVO;

import java.util.List;
import java.util.Map;

public interface MainService {
    GridVO getGrid();
    List<StGridVO> getStGrid();
    Map<String, Object> getEditPlan(PlanVO plan);
    Map<String, Object> getInspectionPlan(PlanVO plan);
    PlanVO planInfo();
    Map<String, Object> getGridInfo();
}
