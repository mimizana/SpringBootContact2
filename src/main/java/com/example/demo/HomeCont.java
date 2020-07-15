package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeCont {
    @GetMapping("/contactform")
    public String loadFormPage(Model model){
        model.addAttribute("contact", new Contact());
        return "contactform";
    }
    @PostMapping("/contactform")
    public String loadFormPage(@ModelAttribute Contact contact, Model model){
        model.addAttribute("contact", contact);
        return "confirmcontact";

    }

}
