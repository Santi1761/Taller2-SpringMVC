package icesi.edu.co.LibrarySystem.LibrarySystem.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {
    @RequestMapping("")
    public String getHome(){
        return "home";
    }
}
