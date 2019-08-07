package MedSys.controller;


import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
		

		
	/*
	 * @RequestMapping(value = "/login", method = RequestMethod.POST) public String
	 * submit(Model model, @ModelAttribute("employee") Employee employee) { Employee
	 * tmpEmployee = (Employee)
	 * SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	 * 
	 * MedSys.domain.Employee employees =
	 * employeeRepo.findByusername(tmpEmployee.getUsername());
	 * 
	 * 
	 * if (employees.getUsername() != null & employees.getPassword() != null) {
	 * 
	 * if (employees.getUsername().equals("Admin") &&
	 * employees.getPassword().equals("password")) { model.addAttribute("userName",
	 * employee.getUsername()); model.addAttribute("password",
	 * employee.getPassword()); return "/WEB-INF/views/admin.jsp"; } else {
	 * model.addAttribute("error", "Invalid Details"); return
	 * "/WEB-INF/views/landing.jsp"; } } else { model.addAttribute("error",
	 * "Please enter Details"); return "/WEB-INF/views/recordspage.jsp"; }
	 */
		
	
		  
		@RequestMapping(value="/loginattempt", method=RequestMethod.GET)
		public String successLogin() { 
	        Employee authEmp = (Employee) SecurityContextHolder.getContext().getAuthentication().getPrincipal();  
	        MedSys.domain.Employee employee = employeeRepo.findByusername(authEmp.getUsername());
	        String view;
	        switch (employee.getRoleID().getEntryroleID()) {
	        	case "Admin":
	        		view = "redirect:/WEB-INF/views/admin.jsp";
	        		break;
	        	case "Doctor": 
	        		view = "redirect:/WEB-INF/views/recordspage.jsp"; 
	        		break;
	        		
	        	case "Nurse":
	        		view = "redirect:/WEB-INF/views/recordspage.jsp";
	        		break;
	        	case "Pharmacist": 
	        		view = "redirect:/WEB-INF/views/recordspage.jsp"; 
	        		break;
	        	case "Receptionist":
	        		view = "redirect:/WEB-INF/views/recordspage.jsp";
	        		break;
	        	case "Healthassist": 
	        		view = "redirect:/WEB-INF/views/recordspage.jsp"; 
	        		break;
	        	default: 
	        		view = "redirect:/WEB-INF/views/index.jsp"; 
	        		break;
	        }
	  
			return view;
		}
		  
}
