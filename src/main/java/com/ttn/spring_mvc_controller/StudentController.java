package com.ttn.spring_mvc_controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;


@Controller
@RequestMapping("/springmvc")
public class StudentController extends AbstractController {

    @RequestMapping("/index.html")
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {

        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("message", "Welcome to spring mvc.");
        return modelAndView;
    }


    //    @ResponseBody
    @RequestMapping(value = "/formPage}", method = RequestMethod.GET)
    public ModelAndView hello(@PathVariable() Map<String, String> mapNames) {

//        String firstName = mapNames.get("firstName");
//        String lastName = mapNames.get("lastName");

//        return "Hello, Your first name is " + firstName + " and last name is " + lastName;

        ModelAndView modelAndView = new ModelAndView("applicationForm");
        return modelAndView;
    }


    @RequestMapping(value = "/successPage", method = RequestMethod.POST)
    public ModelAndView success(@RequestParam("firstName") String fname,
                                @RequestParam("lastName") String lname) {
//        return fname + " " + lname;

        ModelAndView modelAndView = new ModelAndView("studentformsuccess");
        modelAndView.addObject("data", "First name: " + fname + " Last Name: " + lname);
        return modelAndView;
    }


    @RequestMapping("/details")
    public ModelAndView student() {

        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("student1", "Details of student");
        return modelAndView;
    }


    @RequestMapping(value = "/form.html", method = RequestMethod.GET)
    public ModelAndView form() {
        ModelAndView modelAndView = new ModelAndView("applicationForm");
        return modelAndView;
    }

    @RequestMapping(value = "/submitForm.html", method = RequestMethod.POST)
//    @ResponseBody
    public ModelAndView submitForm(@ModelAttribute("studentCO") StudentCO studentCO) {
//        return "First Name " + firstName + " Last Name " + lastName;
//
//        StudentCO studentCO = new StudentCO();
//        studentCO.setFirstName(firstName);
//        studentCO.setLastName(lastName);

        ModelAndView modelAndView = new ModelAndView("studentformsuccess");
//    modelAndView.addObject("studentCO",studentCO);
        return modelAndView;

    }

    @ModelAttribute
    public void addCommonObj(Model model) {

        model.addAttribute("appForm", "This is Application Form");
        model.addAttribute("appFormSuccess", "This is Success Page");
    }


}
