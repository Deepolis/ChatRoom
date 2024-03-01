package com.deepolis.serian;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String login() {return "login.jsp";}

    @RequestMapping("/login")
    public String home() {
        return "home.jsp";
    }


}
