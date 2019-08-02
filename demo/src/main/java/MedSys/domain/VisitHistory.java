package MedSys.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity 

public class VisitHistory {
	
	
	
	@Id
	@GeneratedValue  (strategy = GenerationType.TABLE)
	
	public int visitID;
	
@OneToOne (fetch = FetchType.LAZY )
	
	@JoinColumn(name = "patientID")
 
	
	public Patient patientID;



@OneToOne (fetch = FetchType.LAZY )

@JoinColumn(name = "employeeID")
	
	public Employee employeeID;

	@Column
	
	public int hospitalID;
	
	@Column
	
	public String hospitaladdress;
	
	@Column
	
	public Date date;
	
	@Column
	
	public String visitreason;
	
	@Column
	
	public String visitdescription;
	
	@Column
	
	public String doctorsnotes;
	

	public VisitHistory() {
		super();
	}

	

	public int getVisitID() {
		return visitID;
	}

	public void setVisitID(int visitID) {
		this.visitID = visitID;
	}

	public int getPatientID() {
		return patientID.getPatientID();
	}

	

	public int getEmployeeID() {
		return employeeID.getEmployeeID();
	}

	public int getHospitalID() {
		return hospitalID;
	}

	public void setHospitalID(int hospitalID) {
		this.hospitalID = hospitalID;
	}

	public String getHospitaladdress() {
		return hospitaladdress;
	}

	public void setHospitaladdress(String hospitaladdress) {
		this.hospitaladdress = hospitaladdress;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getVisitreason() {
		return visitreason;
	}

	public void setVisitreason(String visitreason) {
		this.visitreason = visitreason;
	}

	public String getVisitdescription() {
		return visitdescription;
	}

	public void setVisitdescription(String visitdescription) {
		this.visitdescription = visitdescription;
	}

	public String getDoctorsnotes() {
		return doctorsnotes;
	}

	public void setDoctorsnotes(String doctorsnotes) {
		this.doctorsnotes = doctorsnotes;
	}
	
	
	
}



