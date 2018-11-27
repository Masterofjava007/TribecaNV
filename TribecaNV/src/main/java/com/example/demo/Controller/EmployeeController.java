package com.example.demo.Controller;

import com.example.demo.Model.Employee;
import com.example.demo.Service.EmployeeServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@RequestMapping ("/Employee")
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeServiceImp employeeServiceImp;

    @GetMapping("/")
    public String home(){
        return "index";
    }

    @PostMapping("/create")
    public String create (@ModelAttribute Employee employee, Model model){
        model.addAttribute("employee", employee);
        employeeServiceImp.createEmployee(employee);
        return "createdemployee";
    }

    @GetMapping ("/created/{id}")
    public String created (@PathVariable ("id") int id, Model model){
        model.addAttribute("employee", employeeServiceImp.fetchEmployee(id));
                return "createdemployee";
    }

    @GetMapping("/viewAll")
    public String viewAll (@ModelAttribute Employee employee, Model model){
        model.addAttribute("employees", employeeServiceImp.fetchAllEmployees());
        return "viewallemployees";
    }

}
