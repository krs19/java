package MedSys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 

@RequestMapping("/prescription/")


public class PrescriptiveHistoryController {

	
	
	@RequestMapping ("/")
	
	public String prescriptivePage() { 
		
		return "/WEB-INF/views/landing.jsp";
		
		
	}

	
	
	
	
	
	
	
}
