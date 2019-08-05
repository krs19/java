package MedSys.repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import MedSys.domain.Employee;
import MedSys.domain.EmployeeRoles;



public interface EmployeeRepository extends CrudRepository <Employee, Integer> {
		
		Set<Employee> findByemployeeID(int employeeID);
		public Employee findByusername(String username);
		public EmployeeRoles findByroleID(EmployeeRoles roleID);
		
		
	}
		
	

