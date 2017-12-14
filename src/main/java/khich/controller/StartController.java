package khich.controller;

import khich.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StartController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String index(){ return "index"; }


    @PostMapping("/save")
    public String saveMe(@RequestParam String name , @RequestParam String email ){
        userService.save(name,email);
        return "index";
    }
}
