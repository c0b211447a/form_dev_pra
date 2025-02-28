package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


//いらんコメントを追加.
@Controller
public class Register {

    @RequestMapping("/")
    public String start() {
        return "form_practice/input_form.html";
    }

    @RequestMapping("/register")
    public ModelAndView register
        (@ModelAttribute RegisterBean rb, ModelAndView m) {
            m.addObject("rb", rb);
            m.setViewName("form_practice/register.html");
            return m;
        }
}
