package com.suixingpay.demo2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class testAc {

    @GetMapping("/index")
    public ModelAndView test(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("name", "zhangshan");
        mv.setViewName("index");
        return mv;
    }
}
