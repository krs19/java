package MedSys.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import MedSys.domain.Employee;
import MedSys.domain.EmployeeRoles;
@RequestMapping("/index")
@Controller
public class AddemployeeController {

    @GetMapping("/employeeAdd")
    public String greetingForm(Model model) {
    	return "/WEB-INF/views/recordspage.jsp";
    }
    @RequestMapping("/patient")
    @PostMapping("/patient")
    public String greetingSubmit(@ModelAttribute EmployeeRoles employeeRole) {
        return "/WEB-INF/views/recordspage.jsp";
    }

}