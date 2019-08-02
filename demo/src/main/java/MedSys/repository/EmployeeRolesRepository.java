package MedSys.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import MedSys.domain.EmployeeRoles;



public interface EmployeeRolesRepository extends CrudRepository <EmployeeRoles, Integer> {
		
		List<EmployeeRoles> findByjobRoles(String jobRoles);
		
		
		
	}
		
	

