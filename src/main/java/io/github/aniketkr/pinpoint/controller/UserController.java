package io.github.aniketkr.pinpoint.controller;

import io.github.aniketkr.pinpoint.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/")
    public String viewUsersList(Model model) {
        model.addAttribute("listUsers", userService.getAllUsers());
        return "partials/navbar";
    }
}
