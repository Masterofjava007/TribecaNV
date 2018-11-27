package com.example.demo.Controller;

import com.example.demo.Model.Renter;
import com.example.demo.Service.RentersServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/Renter")

@Controller
public class RenterController {

    @Autowired
    private RentersServiceImp rentersServiceImp;

    @GetMapping("/")
    public String home(){
        return "index";
    }

    @PostMapping ("/create")
    public String create(@ModelAttribute Renter renter, Model model){
        model.addAttribute("renter", renter);
        rentersServiceImp.createRenter(renter);
        return "createdrenter";
    }

    @GetMapping("/viewallrenters")
    public String viewallrenters(@ModelAttribute Renter renter, Model model){
        model.addAttribute("renter", rentersServiceImp.fetchAllRenters());
        return "viewallrenters";
    }
}
