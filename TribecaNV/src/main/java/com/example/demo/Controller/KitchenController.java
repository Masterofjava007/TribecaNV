package com.example.demo.Controller;

import com.example.demo.Service.KitchenServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/Kitchen")
@Controller
public class KitchenController {

    @Autowired
    KitchenServiceImp kitchenService;

    @GetMapping("/")
    public String home(){
        return "index";
    }
}