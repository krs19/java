package MedSys.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import MedSys.domain.Employee;



public interface EmployeeRepository extends JpaRepository <Employee, Integer> {
		
		List<Employee> findByemployeeID(int employeeID);
		public Employee findByusername(String username);

		
		
	}
		
	

