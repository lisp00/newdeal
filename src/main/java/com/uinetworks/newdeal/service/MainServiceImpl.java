package com.uinetworks.newdeal.service;

import com.uinetworks.newdeal.domain.GridVO;
import com.uinetworks.newdeal.domain.PlanVO;
import com.uinetworks.newdeal.domain.StGridVO;
import com.uinetworks.newdeal.mapper.MainMapper;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Log4j
@Service
public class MainServiceImpl implements MainService {
    @Setter(onMethod_ = @Autowired)
    private MainMapper mainMapper;

    private static final int EDIT_BEGIN_YEAR = 2021;
    private static final int EDIT_BEGIN_MONTH = 07;
    private static final int EDIT_BEGIN_DAY = 19;
    private static final int EDIT_END_YEAR = 2021;
    private static final int EDIT_END_MONTH = 10;
    private static final int EDIT_END_DAY = 1;

    private static final int INSPECTION_BEGIN_YEAR = 2021;
    private static final int INSPECTION_BEGIN_MONTH = 10;
    private static final int INSPECTION_BEGIN_DAY = 04;
    private static final int INSPECTION_END_YEAR = 2021;
    private static final int INSPECTION_END_MONTH = 11;
    private static final int INSPECTION_END_DAY = 12;

    @Override
    public GridVO getGrid() {
        return mainMapper.selectGrid();
    }

    @Override
    public List<StGridVO> getStGrid() {
        return mainMapper.selectStGrid();
    }

    @Override
    public Map<String, Object> getEditPlan(PlanVO plan) {
        log.info("editPlan");
        LocalDate from = plan.getEditBegin();
        LocalDate to = plan.getEditEnd();;

        Map<String, Object> result = new HashMap<>();
        result.put("beginDay", from);
        result.put("dDay", to);
        result.put("dDayCount", mainMapper.daysCount(from, to));
        log.info(result);

        return result;
    }

    @Override
    public Map<String, Object> getInspectionPlan(PlanVO plan) {
        log.info("inspectionPlan");
        LocalDate from = plan.getInspectionBegin();
        LocalDate to = plan.getInspectionEnd();

        Map<String, Object> result = new HashMap<>();
        result.put("beginDay", from);
        result.put("dDay", to);
        result.put("dDayCount", mainMapper.daysCount(from, to));
        log.info(result);

        return result;
    }

    @Override
    public Map<String, Object> getGridInfo() {
        Map<String, Object> result = new HashMap<>();

        int allGridCount =  mainMapper.allGridCount();
        int workGridCount = mainMapper.workGridCount();

        double allGridP = allGridCount==0?0:(workGridCount/allGridCount)*100;

        int editGridCount = mainMapper.editGridCount();
        double workGridP = workGridCount==0?0:(editGridCount/workGridCount)*100;

        int inspectionBGridCount = mainMapper.inspectionBGridCount();
        int inspectionTGridCount = mainMapper.inspectionTGridCount();
        int inspectionFGridCount = mainMapper.inspectionFGridCount();

        double inspectionGridP = inspectionBGridCount==0?0:(inspectionTGridCount/inspectionBGridCount)*100;

        result.put("allGridCount",allGridCount);
        result.put("workGridCount", workGridCount);
        result.put("allGridP", allGridP);

        result.put("editGridCount", editGridCount);
//        result.put("workGridCount", workGridCount);
        result.put("editGridCountP", workGridP);

        result.put("inspectionBGridCount", inspectionBGridCount);
        result.put("inspectionTGridCount", inspectionTGridCount);
        result.put("inspectionFGridCount", inspectionFGridCount);
        result.put("inspectionGridP", inspectionGridP);

        return result;
    }

    @Override
    public PlanVO planInfo() {
        return mainMapper.selectPlan();
    }
}
