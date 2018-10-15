package com.ttn.spring_mvc_controller;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class StudentMultiActionController extends MultiActionController {

    public ModelAndView actionOne(HttpServletRequest httpServletRequest,
                                  HttpServletResponse httpServletResponse) {

        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }

    public void actionTwo(HttpServletRequest httpServletRequest,
                          HttpServletResponse httpServletResponse) throws Exception {

        httpServletResponse.setContentType("text/html");
        httpServletResponse.getWriter().println("<b>Hello from multiAction</b>");

    }

}
