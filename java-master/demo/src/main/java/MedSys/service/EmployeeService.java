package MedSys.service;

import org.springframework.beans.factory.annotation.Autowired;

import MedSys.domain.Employee;
import MedSys.domain.EmployeeRoles;
import MedSys.repository.EmployeeRepository;
import MedSys.repository.EmployeeRolesRepository;

public class EmployeeService {

	

	private EmployeeRolesRepository empRoleRepository;
	private EmployeeRepository empRepository;

	
    @Autowired
    public EmployeeService(EmployeeRolesRepository empRoleRepository, EmployeeRepository empRepository) { 
      this.empRoleRepository = empRoleRepository;
      this.empRepository = empRepository;
    }
    
	public Employee findByEmployeeID(Employee empID) {
		return empRoleRepository.findByempID(empID);
	}
	

	
	public void saveUser(EmployeeRoles user) {
		empRoleRepository.save(user);
	}
	
	
}
