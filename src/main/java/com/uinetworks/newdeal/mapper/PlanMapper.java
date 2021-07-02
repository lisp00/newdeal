package com.uinetworks.newdeal.mapper;

import com.uinetworks.newdeal.domain.GridVO;
import com.uinetworks.newdeal.domain.PlanVO;
import com.uinetworks.newdeal.domain.StGridVO;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDate;
import java.util.List;

public interface PlanMapper {
    PlanVO selectPlan();
    Integer daysCount(@Param("from") LocalDate from, @Param("to") LocalDate to);
}
