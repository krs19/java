package MedSys.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import MedSys.domain.Patient;



public interface PatientRepository extends CrudRepository <Patient, Integer> {
		
		List<Patient> findBypatientID(int patientID);
		
	}
		
	
