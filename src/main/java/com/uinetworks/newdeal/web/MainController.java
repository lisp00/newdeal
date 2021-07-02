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
        log.info("in controller");
        model.addAttribute("plan", mainService.getPlan());
        model.addAttribute("count", mainService.getCount());
        return "main/index";
    }
}
