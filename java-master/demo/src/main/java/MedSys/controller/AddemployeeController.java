package MedSys.controller;


import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import MedSys.repository.EmployeeRolesRepository;
import MedSys.service.EmployeeService;
import MedSys.domain.Employee;
import MedSys.domain.EmployeeRoles;
@Controller 

@RequestMapping("/")


public class AddemployeeController {

	private BCryptPasswordEncoder bCryptPasswordEncoder;

	private EmployeeService empService;
 
    @Autowired
    public AddemployeeController(BCryptPasswordEncoder bCryptPasswordEncoder, EmployeeService empService) {
      
      this.bCryptPasswordEncoder = bCryptPasswordEncoder;
      this.empService = empService;
    
    }
	
	
	@RequestMapping ("/addemployee")
	
	public String patientPage() { 
		
		return "/WEB-INF/views/admin.jsp";		
		
	}

	

	@RequestMapping(value="/addemployee", method = RequestMethod.GET)
	public ModelAndView showRegistrationPage(ModelAndView modelAndView, Employee emp){
		modelAndView.addObject("employee", emp);
		modelAndView.setViewName("register");
		return modelAndView;
	}
	
	// Process form input data
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ModelAndView processRegistrationForm(ModelAndView modelAndView, @Valid EmployeeRoles role,Employee emp, BindingResult bindingResult, HttpServletRequest request) {
				
		// Lookup user in database by e-mail
		EmployeeRoles userExists = empService.findByEmployeeID(role.getEmpID().getEmployeeID());
		
		System.out.println(userExists);
		
		if (userExists != null) {
			modelAndView.addObject("alreadyRegisteredMessage", "Oops!  There is already a user registered with the email provided.");
			modelAndView.setViewName("register");
			bindingResult.reject("email");
		}
			
		if (bindingResult.hasErrors()) { 
			modelAndView.setViewName("register");		
		} else { // new user so we create user and send confirmation e-mail
					
			// Disable user until they click on confirmation link in email
		    user.setEnabled(false);
		      
		    // Generate random 36-character string token for confirmation link
		    user.setConfirmationToken(UUID.randomUUID().toString());
		        
		    userService.saveUser(user);
				
			String appUrl = request.getScheme() + "://" + request.getServerName();
			
			SimpleMailMessage registrationEmail = new SimpleMailMessage();
			registrationEmail.setTo(user.getEmail());
			registrationEmail.setSubject("Registration Confirmation");
			registrationEmail.setText("To confirm your e-mail address, please click the link below:\n"
					+ appUrl + "/confirm?token=" + user.getConfirmationToken());
			registrationEmail.setFrom("noreply@domain.com");
			
			emailService.sendEmail(registrationEmail);
			
			modelAndView.addObject("confirmationMessage", "A confirmation e-mail has been sent to " + user.getEmail());
			modelAndView.setViewName("register");
		}
			
		return modelAndView;
	}
	
	// Process confirmation link
	@RequestMapping(value="/confirm", method = RequestMethod.GET)
	public ModelAndView showConfirmationPage(ModelAndView modelAndView, @RequestParam("token") String token) {
			
		User user = userService.findByConfirmationToken(token);
			
		if (user == null) { // No token found in DB
			modelAndView.addObject("invalidToken", "Oops!  This is an invalid confirmation link.");
		} else { // Token found
			modelAndView.addObject("confirmationToken", user.getConfirmationToken());
		}
			
		modelAndView.setViewName("confirm");
		return modelAndView;		
	}
	

	
}
