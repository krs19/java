package MedSys.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity 

public class PrescriptiveHistory {
	
	
	
	@Id
	@GeneratedValue  (strategy = GenerationType.TABLE)
	
	public int prescriptiveID;
	
	@OneToOne (fetch = FetchType.LAZY )
	
	@JoinColumn(name = "patientID")
	
	 
	
	public Patient patientID;
	
	@Column
	
	public String medication;
	
	@Column
	
	public int medquantity;


	public PrescriptiveHistory() {
		super();
	}


	public int getPrescriptiveID() {
		return prescriptiveID;
	}


	public void setPrescriptiveID(int prescriptiveID) {
		this.prescriptiveID = prescriptiveID;
	}


	public int getPatientID() {
		return patientID.getPatientID();
	}


	


	public String getMedication() {
		return medication;
	}


	public void setMedication(String medication) {
		this.medication = medication;
	}


	public int getMedquantity() {
		return medquantity;
	}


	public void setMedquantity(int medquantity) {
		this.medquantity = medquantity;
	}

	
	
	
}



