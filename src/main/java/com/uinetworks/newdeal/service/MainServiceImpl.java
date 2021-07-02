package com.uinetworks.newdeal.service;

import com.uinetworks.newdeal.domain.GridVO;
import com.uinetworks.newdeal.domain.PlanVO;
import com.uinetworks.newdeal.mapper.CountMapper;
import com.uinetworks.newdeal.mapper.PlanMapper;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@Log4j
@Service
public class MainServiceImpl implements MainService {
    @Setter(onMethod_ = @Autowired)
    private PlanMapper planMapper;

    @Setter(onMethod_ = @Autowired)
    private CountMapper countMapper;

    @Transactional
    @Override
    public Map<String, Object> getPlan() {
        log.info("getPlan");
        PlanVO plan = planMapper.selectPlan();

        LocalDate editFrom = plan.getEditBegin();
        LocalDate editTo = plan.getEditEnd();;

        LocalDate inspectionFrom = plan.getInspectionBegin();
        LocalDate inspectionTo = plan.getInspectionEnd();

        Map<String, Object> result = new HashMap<>();
        result.put("editFrom", editFrom);
        result.put("editTo", editTo);
        result.put("editPlan", planMapper.daysCount(editFrom, editTo));
        result.put("inspectionFrom", inspectionFrom);
        result.put("inspectionTo", inspectionTo);
        result.put("inspectionPlan", planMapper.daysCount(inspectionFrom, inspectionTo));
        log.info(result);
        return result;
    }

    @Override
    public Map<String, Object> getCount() {
        log.info("getCount");
        DecimalFormat form = new DecimalFormat("#.##");

        int totalCnt = countMapper.totalCnt();
        int validCnt = countMapper.validCnt();
        int lv0Cnt = countMapper.lvCnt(0);
        int lv1Cnt = countMapper.lvCnt(1);
        int lv2Cnt = countMapper.lvCnt(2);
        int lv3Cnt = countMapper.lvCnt(3);
        int lv4Cnt = countMapper.lvCnt(4);
        int insp1TotalCnt = countMapper.inspTotalCnt(1);
        int insp2TotalCnt = countMapper.inspTotalCnt(2);
        int insp1Cnt = countMapper.inspCnt(1);
        int insp2Cnt = countMapper.inspCnt(2);
        int vrf1Cnt = countMapper.vrfCnt(1);
        int vrf2Cnt = countMapper.vrfCnt(2);

        Map<String, Object> result = new HashMap<>();
        result.put("totalCnt", totalCnt);
        result.put("validCnt", validCnt);
        result.put("lv0Cnt", lv0Cnt);
        result.put("lv1Cnt", lv1Cnt);
        result.put("lv2Cnt", lv2Cnt);
        result.put("lv3Cnt", lv3Cnt);
        result.put("lv4Cnt", lv4Cnt);
        result.put("insp1TotalCnt", insp1TotalCnt);
        result.put("insp2TotalCnt", insp2TotalCnt);
        result.put("insp1Cnt", insp1Cnt);
        result.put("insp2Cnt", insp2Cnt);
        result.put("vrf1Cnt", vrf1Cnt);
        result.put("vrf2Cnt", vrf2Cnt);

        if(totalCnt == 0) {
            result.put("validCntP", 0);
        } else {
            result.put("validCntP", form.format((double)validCnt / (double)totalCnt * 100));
        }

        if(validCnt == 0) {
            result.put("lv0P", 0);
            result.put("lv1P", 0);
            result.put("lv2P", 0);
            result.put("lv3P", 0);
            result.put("lv4P", 0);

            result.put("vrf1P", 0);
            result.put("vrf2P", 0);
        } else {
            result.put("lv0P", form.format((lv0Cnt / validCnt) * 100));
            result.put("lv1P", form.format((lv1Cnt / validCnt) * 100));
            result.put("lv2P", form.format((lv2Cnt / validCnt) * 100));
            result.put("lv3P", form.format((lv3Cnt / validCnt) * 100));
            result.put("lv4P", form.format((lv4Cnt / validCnt) * 100));

            result.put("vrf1P", form.format((vrf1Cnt / validCnt) * 100));
            result.put("vrf2P", form.format((vrf2Cnt / validCnt) * 100));
        }

        if(insp1TotalCnt == 0) {
            result.put("insp1P", 0);
        } else {
            result.put("insp1P", form.format((insp1Cnt / insp1TotalCnt) * 100));
        }

        if(insp2TotalCnt == 0) {
            result.put("insp2P", 0);
        } else {
            result.put("insp2P", form.format((insp2Cnt / insp2TotalCnt) * 100));
        }
        return result;
    }
}
