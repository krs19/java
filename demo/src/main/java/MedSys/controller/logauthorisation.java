package MedSys.controller;


import org.springframework.web.bind.annotation.RequestMethod;

import MedSys.domain.Employee;
import MedSys.repository.EmployeeRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/index/")

public class logauthorisation {

@RequestMapping ("/")
	
	public String index() { 
		return "/WEB-INF/views/index.jsp";
		
		
	}
	
	
			
		@Autowired EmployeeRepository employeeRepo;
		
		
		
	//	@RequestMapping(value="/user-login", method=RequestMethod.GET)
	//	public String loginForm() {
		//	return "security/login-form";
	
	//	}
		
		
		
		  @RequestMapping(method = RequestMethod.POST)
		  public String submit(Model model, @ModelAttribute("employee") Employee employee) {
		    if (employee != null && employee.getUsername() != null & employee.getPassword() != null) {
		      if (employee.getUsername().equals("Admin")) {
		        model.addAttribute(employee.getUsername());
				return "/WEB-INF/views/admin.jsp";
		      } else {
		        model.addAttribute("error", "Invalid Details");
				return "/WEB-INF/views/landing.jsp";
		      }
		    } else {
		      model.addAttribute("error", "Please enter Details");
				return "/WEB-INF/views/landing.jsp";
		}

		
		  }
}
