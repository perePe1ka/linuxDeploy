package ru.vladuss.adminka_linux.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.vladuss.adminka_linux.models.User;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/users")
public class UserController {
    private List<User> listUsers = new ArrayList<>();

    @GetMapping("/allUsers")
    public String getAllUsers(Model model) {
        model.addAttribute("users", listUsers);
        return "Users";
    }

    @GetMapping("create")
    public String showFormForCreateUser(Model model) {
        model.addAttribute("user", new User());
        return "CreateUser";
    }

    @PostMapping("createUser")
    public String createUser(@ModelAttribute User user) {
        user.setId(Long.valueOf(listUsers.size() + 1));
        listUsers.add(user);
        return "redirect:/users/allUsers";
    }
}
