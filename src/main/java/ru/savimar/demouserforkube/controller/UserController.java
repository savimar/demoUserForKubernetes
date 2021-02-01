package ru.savimar.demouserforkube.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.savimar.demouserforkube.entity.User;
import ru.savimar.demouserforkube.service.UserService;

import java.util.List;
import java.util.Optional;


@Controller
@RequestMapping("/")
public class UserController {


    @Autowired
    UserService userService;


    @RequestMapping("/health")
    public String health() {
        return "{\"status\": \"OK\"}";
    }


    @RequestMapping
    public String showUserList(Model model) {
        List<User> userList = userService.findAll();
        model.addAttribute("userList", userList);
        return "index";
    }

    @RequestMapping(path = {"/edit", "/edit/{id}"})
    public String editEmployeeById(Model model, @PathVariable("id") Optional<Integer> id) {
        if (id.isPresent()) {
            User entity = userService.getUserById(id.get());
            model.addAttribute("user", entity);
        } else {
            model.addAttribute("user", new User());
        }
        return "adduser";
    }

    @RequestMapping(path = "/delete/{id}")
    public String deleteEmployeeById(Model model, @PathVariable("id") Integer id){
        userService.delete(id);
        return "redirect:/";
    }

    @RequestMapping(path = "/createUser", method = RequestMethod.POST)
    public String createOrUpdateEmployee(User user)
    {
        userService.save(user);
        return "redirect:/";
    }
}
