package MedSys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

@RequestMapping("/adminpage/")


public class EmployeeRolesController {
	

	
	@RequestMapping ("/")
	
	public String adminpage() { 
		
		return "/WEB-INF/views/admin.jsp";
		
		
	}

	
	
	


}
