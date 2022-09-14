package HRMPowerModule;

import java.io.Serializable;

public class SearchEmployee implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private String firstName;
	private String dateofbirth;
	private String email;
	private String phonenumber;
	private String employeestatus;
	private String designation;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phonenumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phonenumber = phoneNumber;
	}
	public String getEmployeestatus() {
		return employeestatus;
	}
	public void setEmployeestatus(String employeestatus) {
		this.employeestatus = employeestatus;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	

}
      