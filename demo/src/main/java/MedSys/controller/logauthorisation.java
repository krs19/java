package MedSys.controller;


import org.springframework.web.bind.annotation.RequestMethod;

import MedSys.domain.Employee;
import MedSys.repository.EmployeeRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/index/")

public class logauthorisation {

@RequestMapping ("/")
	
	public String index() { 
		System.out.println("case 3");
		return "/WEB-INF/views/admin.jsp";
		
		
	}
	
	
			
		@Autowired EmployeeRepository employeeRepo;
		
		
		
	//	@RequestMapping(value="/user-login", method=RequestMethod.GET)
	//	public String loginForm() {
		//	return "security/login-form";
	
	//	}
		
		
		@RequestMapping (value="/loginattempt", method=RequestMethod.GET)
		
		public String successLogin() { 
	        Employee authEmployee = (Employee) SecurityContextHolder.getContext().getAuthentication().getPrincipal();  
	        MedSys.domain.Employee employee = employeeRepo.findByusername(authEmployee.getUsername());
	        String view;
	        switch (employee.getRoleID().getJob_role()){
	        	case "ADMIN":
	        		view = "/admin.jsp";
	        		System.out.println("case 1");
	        		break;
	        
	        	default: 
	        		view = "/WEB-INF/views/recordspage.jsp"; 
	        		System.out.println("case 2");
	        		break;
	        }
	  
			return view;
		}

		
		
}
