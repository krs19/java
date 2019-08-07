package MedSys.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import MedSys.domain.VisitHistory;




public interface VisitHistoryRepository extends CrudRepository <VisitHistory, Integer> {
		
		List<VisitHistory> findByvisitID(int visitID);
		
	}
		
	
