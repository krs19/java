package MedSys.service;



import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.security.core.userdetails.User;


import MedSys.domain.Employee;
import MedSys.domain.EmployeeRoles;
import MedSys.repository.EmployeeRepository;
import MedSys.MedSysApplication;


@Service
@Transactional(readOnly=true)

public class DetailsService implements UserDetailsService {
	
	
	   @Resource
	    private EmployeeRoles userDataService;
	
		
		@Autowired
		private EmployeeRepository employeeRepo;	

		public UserDetails loadUserByUsername(String username)
				throws UsernameNotFoundException {
			
			MedSys.domain.Employee domainEmployee = employeeRepo.findByusername(username);
			
			boolean enabled = true;
			boolean accountNonExpired = true;
			boolean credentialsNonExpired = true;
			boolean accountNonLocked = true;

			return new User(
					domainEmployee.getUsername(), 
					domainEmployee.getPassword(), 
					enabled, 
					accountNonExpired, 
					credentialsNonExpired, 
					accountNonLocked,
					getAuthorities(domainEmployee.getRoleID().getEntryroleID())
			);
		}
		
		private Collection<? extends GrantedAuthority> getAuthorities(String role) {
			List<GrantedAuthority> authList = getGrantedAuthorities(getRoles(role));
			return authList;
		}
		
		private List<String> getRoles(String empRole) {

			List<String> roles = new ArrayList<String>();

			if (empRole.equals("Admin")) {
				roles.add("Admin");
				
			} else if (empRole.equals("Doctor")) {
				roles.add("Doctor");
			}
			else if (empRole.equals("Nurse")) {
				roles.add("Nurse");
			}
			else if (empRole.equals("Pharmacist")) {
				roles.add("Pharmacist");
			}
			else if (empRole.equals("Receptionist")) {
				roles.add("Receptionist");
			}
			else if (empRole == "Healthassist") {
				roles.add("Healthassist");
			}
			
			return roles;
		}
		

	    public void saveUserData(RegistryCredentials credentials) {
	        UserData current = userDataService.getUserData(credentials
	                .getUsername());
	        current.setCity(credentials.getCity());
	        current.setEmail(credentials.getEmail());
	        current.setPassword(credentials.getPassword());
	        current.setStreet(credentials.getStreet());
	        current.setFirstname(credentials.getFirstname());
	        current.setLastname(credentials.getLastname());
	        current.setUsername(credentials.getUsername());
	        current.setRegistered(new Date());
	        Long activationKey = userDataService.updateUserData(current);
	        mailer.sendSubscriptionEmail(current, activationKey);
	    }
		
		private static List<GrantedAuthority> getGrantedAuthorities(List<String> roles) {
			List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
			
			for (String role : roles) {
				authorities.add(new SimpleGrantedAuthority(role));
			}
			return authorities;
		}
	}


