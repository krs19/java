package MedSys.domain;
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

import MedSys.domain.EmployeeRoles;


@Entity(name = "Employee") 
@Table (name = "Employee")

public class Employee {
	
	@Id
	public int employeeID;
	
	
	
	
	

	@OneToOne(cascade = CascadeType.ALL)  
	
	public EmployeeRoles roleID;
	


	@Column 
	
	public String username;
	
	@Column
	
	public String password;

	public Employee() {
		super();
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}


	public EmployeeRoles getRoleID() {
		return roleID;
	}

	public void setRoleID(EmployeeRoles roleID) {
		this.roleID = roleID;
	}


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
