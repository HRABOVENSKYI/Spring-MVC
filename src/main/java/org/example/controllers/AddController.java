package org.example.controllers;

import org.example.services.AddService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class AddController {

    @RequestMapping("/add")
    public ModelAndView add(@RequestParam("t1") int i, @RequestParam("t2") int j) {

        AddService service = new AddService();
        int k = service.add(i, j);

        ModelAndView mv = new ModelAndView();
        mv.setViewName("display");
        mv.addObject("result", k);

        return mv;
    }
}
