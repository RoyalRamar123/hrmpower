package HRMPowerModule;
import java.io.Serializable;


public class AddEmployee implements Serializable {
	
	
       //POJO class contains variables and their Getters and Setters.
		private static final long serialVersionUID = 1L;
		private String firstName;
		private String lastName;
		private String gender;
		private String dateOfBirth;
		private String addressLine1;
		private String city;
		private String States;
		private String zipcode;
		private String Select ;
		private String email;
		private String mobileNumber;
		private String maritalStatus;
		private String aadharno;
		private String panno;
		private String bloodgroup;
		private boolean expected;
		
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}

		 public String getDateOfBirth() 
		  { 
			  return dateOfBirth;
		  } 
		  public void setDateOfBirth(String dateOfBirth) { 
			  this.dateOfBirth = dateOfBirth; 
		}
		 
		public String getAddressLine1() {
			return addressLine1;
		}
		public void setAddressLine1(String addressLine1) {
			this.addressLine1 = addressLine1;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getStates() {
			return States;
		}
		public void setStates(String states) {
			States = states;
		}
		public String getZipcode() {
			return zipcode;
		}
		public void setZipcode(String zipcode) {
			this.zipcode = zipcode;
		}
		public String getSelect() {
			return Select;
		}
		public void setSelect(String select) {
			Select = select;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getMobileNumber() {
			return mobileNumber;
		}
		public void setMobileNumber(String mobileNumber) {
			this.mobileNumber = mobileNumber;
		}
		public String getMarital() {
			return maritalStatus;
		}
		public void setMarital(String maritalStatus) {
			this.maritalStatus = maritalStatus;
		}
		public String getAadharno() {
			return aadharno;
		}
		public void setAadharno(String aadharno) {
			this.aadharno = aadharno;
		}
		public String getPanno() {
			return panno;
		}
		public void setPanno(String panno) {
			this.panno = panno;
		}
		public String getBloodgroup() {
			return bloodgroup;
		}
		public void setBloodgroup(String bloodgroup) {
			this.bloodgroup = bloodgroup;
		}
		public boolean isExpected() {
			return expected;
		}
		public void setExpected(boolean expected) {
			this.expected = expected;
		}
		
		
		
		
	}
		
		

	
	
	
	


