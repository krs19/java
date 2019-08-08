package MedSys.domain;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity(name = "EmployeeRoles")
public class EmployeeRoles {
	
	@Id

	
	
	public String entryroleID;
	
	

	




	@OneToMany(cascade = CascadeType.ALL)
	
	public Set<Employee> jobRoles;



	
	@ManyToOne(cascade = CascadeType.ALL)  

	public Employee empID;




	@Column
	

	public String first_name;
	
	@Column
	

	public String last_name;
	
	@Column
	

	public String expertise;
	
	@Column
	

	public String addressofwork;   
	
	@Column
	

	public int dob;
	
	
	@Column
	
	public String gender;
	







	public EmployeeRoles() {
		super();
	}









	public String getFirst_name() {
		return first_name;
	}




	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}




	public String getLast_name() {
		return last_name;
	}




	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}




	public String getExpertise() {
		return expertise;
	}




	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}




	public String getAddressofwork() {
		return addressofwork;
	}




	public void setAddressofwork(String addressofwork) {
		this.addressofwork = addressofwork;
	}
	
	
	

	public Set<Employee> getJobRoles() {
		return jobRoles;
	}

	
	public String getEntryroleID() {
		return entryroleID;
	}


	public void setEntryroleID(String entryroleID) {
		this.entryroleID = entryroleID;
	}


	public void setJobRoles(Set<Employee> jobRoles) {
		this.jobRoles = jobRoles;
	}

	public int getDob() {
		return dob;
	}


	public void setDob(int dob) {
		this.dob = dob;
	}
	

	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}


	
	public Employee getEmpID() {
		return empID;
	}









	public void setEmpID(Employee empID) {
		this.empID = empID;
	}



	
	
}

	