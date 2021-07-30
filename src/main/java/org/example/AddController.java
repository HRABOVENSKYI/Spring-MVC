package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class AddController {

    @RequestMapping("/add")
    public ModelAndView add(HttpServletRequest request) {

        int i = Integer.parseInt(request.getParameter("t1"));
        int j = Integer.parseInt(request.getParameter("t2"));
        int k = i + j;

        ModelAndView mv = new ModelAndView();
        mv.setViewName("display.jsp");
        mv.addObject("result", k);

        return mv;
    }
}
