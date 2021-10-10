package ru.savimar.demouserforkube.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.savimar.demouserforkube.service.CustomerService;

import java.security.Principal;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService service;

    @GetMapping(path = "/customers")
    public String customers(Principal principal, Model model) {
         model.addAttribute("customers", service.findAll());

        return "customers";
    }

}
