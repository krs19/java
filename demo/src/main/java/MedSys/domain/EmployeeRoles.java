package MedSys.domain;
import java.util.ArrayList;
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

@Entity(name = "EmployeeRoles")
public class EmployeeRoles {
	
	@Id

	@GeneratedValue  (strategy = GenerationType.TABLE)
	
	
	public int ID;
	
	

	@OneToMany(cascade = CascadeType.ALL)
	
	public Set<Employee> jobRoles ;



	




	@Column 
	
	public String job_role;
	
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
	
	

	

	public EmployeeRoles() {
		super();
	}


	public EmployeeRoles(String jobRole) {
		this.job_role = jobRole;
	}






	public String getJob_role() {
		return job_role;
	}




	public void setJob_role(String job_role) {
		this.job_role = job_role;
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
	
	
	public int getID() {
		return ID;
	}




	public void setID(int iD) {
		ID = iD;
	}




	public Set<Employee> getJobRoles() {
		return jobRoles;
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


	
	
}

	