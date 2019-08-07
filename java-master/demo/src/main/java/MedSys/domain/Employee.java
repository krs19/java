package MedSys.domain;
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
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import MedSys.domain.EmployeeRoles;


@Entity(name = "Employee") 
@Table (name = "Employee")

public class Employee {
	
	@Id
	@NotNull(message = "Cannot leave empty")



	public int employeeID;
	
	
	
	@OneToMany()
	
	public Set<VisitHistory> visits;

	

	@ManyToOne(cascade = CascadeType.ALL)  
	public EmployeeRoles roleID;
	


	@Column 
	@NotNull
	public String username;
	
	@Column
	@NotNull
	@Size(min = 1, message = "minimum 6 characters")
	
	public String password;






	public String getRolesID() {
		return rolesID;
	}

	public void setRolesID(String rolesID) {
		this.rolesID = rolesID;
	}

	private String rolesID;

	public Employee() {
		super();
	}
	
	public Employee(String rolesID) {
		this.rolesID = rolesID;
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
