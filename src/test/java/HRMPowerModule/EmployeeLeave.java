package HRMPowerModule;

import java.io.Serializable;
public class EmployeeLeave implements Serializable  {
 
	/**
	 * 
	 */
	private static final long serialVersionUID =1L;

	private String requestFrom;
	private String requestTO;
	private String leaveTpye;
	private String reasonforleave;

	public String getRequestFrom() {
		return requestFrom;
	}
	public void setRequestFrom(String requestFrom) {
		this.requestFrom = requestFrom;
	}
	public String getRequestTO() {
		return requestTO;
	}
	public void setRequestTO(String requestTO) {
		this.requestTO = requestTO;
	}
	public String getLeaveTpye() {
		return leaveTpye;
	}
	public void setLeaveTpye(String leaveTpye) {
		this.leaveTpye = leaveTpye;
	}
	public String getReasonforleave() {
		return reasonforleave;
	}
	public void setReasonforleave(String reasonforleave) {
		this.reasonforleave = reasonforleave;
	

	}








}  
