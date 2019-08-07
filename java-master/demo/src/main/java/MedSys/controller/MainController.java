package MedSys.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

public class MainController {

    @GetMapping("/")
    public String root() {
		return "/WEB-INF/views/index.jsp";
    }

    @RequestMapping("/user")
    public String userIndex() {
		return "/WEB-INF/views/recordspage.jsp";
    }

    @GetMapping("/login")
    public String login() {
		return "/WEB-INF/views/landing.jsp";
    }

    @GetMapping("/access-denied")
    public String accessDenied() {
		return "/WEB-INF/views/searchrecords.jsp";
    }

}
	
