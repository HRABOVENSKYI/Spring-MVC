package org.example.controllers;

import org.example.services.AddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {

    AddService service;

    @Autowired
    public AddController(AddService service) {
        this.service = service;
    }

    @RequestMapping("/add")
    public ModelAndView add(@RequestParam("t1") int i, @RequestParam("t2") int j) {

        int k = service.add(i, j);

        ModelAndView mv = new ModelAndView();
        mv.setViewName("display");
        mv.addObject("result", k);

        return mv;
    }
}
