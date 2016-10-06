package com.lu.pizza;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Lusai on 10/6/16.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String redirectToFlow(){
        return "redirect:/pizza";
    }
}
