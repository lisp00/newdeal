package com.uinetworks.newdeal.mapper;

import com.uinetworks.newdeal.domain.GridVO;
import com.uinetworks.newdeal.domain.PlanVO;
import com.uinetworks.newdeal.domain.StGridVO;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDate;
import java.util.List;

public interface MainMapper {
    GridVO selectGrid();
    List<StGridVO> selectStGrid();
    Integer daysCount(@Param("from") LocalDate from, @Param("to") LocalDate to);
    PlanVO selectPlan();

    Integer allGridCount();
    Integer workGridCount();
    Integer editGridCount();

    Integer inspectionBGridCount();
    Integer inspectionTGridCount();
    Integer inspectionFGridCount();
}
