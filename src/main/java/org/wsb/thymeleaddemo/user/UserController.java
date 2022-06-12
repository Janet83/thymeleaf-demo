package org.wsb.thymeleaddemo.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/newuser")
    public String newUser(Model model) {
        User kacper = new User();
            kacper.email = "kacper.warda@logintegra.com";
            kacper.username = "kacper-warda";
            kacper.enabled = true;
            kacper.id = 1;

            model.addAttribute("person", kacper);

        System.out.println("weszliśmy na newuser");
        return "userForm";
    }
}
