package MedSys.repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.repository.CrudRepository;

import MedSys.domain.Employee;
import MedSys.domain.EmployeeRoles;



public interface EmployeeRolesRepository extends CrudRepository <EmployeeRoles, Integer> {

	
		public EmployeeRoles findByentryroleID(String entryroleID);
		public EmployeeRoles findByexpertise(String expertise);
		public Employee findByempID(Employee empID);

		
		
	}
		
	

