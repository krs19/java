package MedSys.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import MedSys.domain.Employee;
import MedSys.domain.EmployeeRoles;

@Controller 

@RequestMapping("/patient/")


public class Patientcontroller {

	
	
	@RequestMapping ("/")
	
	public String patientPage() { 
		
		return "/WEB-INF/views/recordspage.jsp";		
		
	}

	



	
}
