package com.uinetworks.newdeal.mapper;

import com.uinetworks.newdeal.domain.GridVO;
import com.uinetworks.newdeal.domain.PlanVO;
import com.uinetworks.newdeal.domain.StGridVO;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDate;
import java.util.List;

public interface CountMapper {
    int totalCnt();
    int validCnt();
    int lvCnt(@Param("lv") int lv);
    int inspCnt(@Param("insp") int insp);
    int inspTotalCnt(@Param("inspTotal") int inspTotal);
    int vrfCnt(@Param("vrf") int vrf);
}
