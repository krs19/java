package MedSys.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import MedSys.domain.PrescriptiveHistory;



public interface PrescriptiveRepository extends CrudRepository <PrescriptiveHistory, Integer> {
		
		List<PrescriptiveHistory> findByprescriptiveID(int prescriptiveID);
		
	}
		
	
