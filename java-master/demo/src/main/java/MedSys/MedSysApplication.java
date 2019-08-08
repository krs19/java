package MedSys;


import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import MedSys.domain.Employee;
import MedSys.domain.EmployeeRoles;
import MedSys.repository.EmployeeRepository;
import MedSys.repository.EmployeeRolesRepository;




@SpringBootApplication
public class MedSysApplication implements CommandLineRunner{
	



	
	@Autowired
	private EmployeeRepository employeeRepo;		
    
	private EmployeeRolesRepository empRoleRepo;



	public static void main(String[] args) {
		SpringApplication.run(MedSysApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		BCryptPasswordEncoder pe = new  BCryptPasswordEncoder();


		Employee employee = new Employee();
		employee.setUsername("Admin");
		employee.setEmployeeID(111);
		employee.setPassword(pe.encode("password"));
		EmployeeRoles role = new EmployeeRoles();
		role.setEntryroleID("Admin");;
		
		employee.setRoleID(role);
		Set<Employee> jobRoles = new HashSet<Employee>();
		 jobRoles.add(employee);
		 role.setEmpID(employee);


		employeeRepo.save(employee);
	
		
		
		}
	

	
	 
}

