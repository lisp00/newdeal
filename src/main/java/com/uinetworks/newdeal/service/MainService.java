package com.uinetworks.newdeal.service;


import com.uinetworks.newdeal.domain.GridVO;
import com.uinetworks.newdeal.domain.PlanVO;
import com.uinetworks.newdeal.domain.StGridVO;

import java.util.List;
import java.util.Map;

public interface MainService {
    Map<String, Object> getPlan();
    Map<String, Object> getCount();
}
