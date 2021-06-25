package com.uinetworks.newdeal.web;

import com.uinetworks.newdeal.domain.PlanVO;
import com.uinetworks.newdeal.service.MainService;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Log4j
@Controller
public class MainController {
    @Setter(onMethod_ = @Autowired)
    private MainService mainService;

    @GetMapping("/")
    public String main(Model model) {
        PlanVO plan = mainService.planInfo();
        log.info("in controller");
        model.addAttribute("editPlan", mainService.getEditPlan(plan));
        model.addAttribute("inspectionPlan", mainService.getInspectionPlan(plan));
        model.addAttribute("gridCount", mainService.getGridInfo());
        return "main/index";
    }
}
