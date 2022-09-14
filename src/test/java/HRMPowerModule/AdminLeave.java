package HRMPowerModule;

import java.io.Serializable;

public class AdminLeave implements Serializable {
	/**
	 * 
	 */
	private String fromDate;
	private String toDate;
	private String selectLeaveStatus;
    private String selectLeavetype;
    
    
    
    
	public String getSelectLeavetype() {
		return selectLeavetype;
	}
	public void setSelectLeavetype(String selectLeavetype) {
		this.selectLeavetype = selectLeavetype;
	}
	public String getFromDate() {
		return fromDate;
	}
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	public String getToDate() {
		return toDate;
	}
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	public String getSelectLeaveStatus() {
		return selectLeaveStatus;
	}
	public void setSelectLeaveStatus(String selectLeaveStatus) {
		this.selectLeaveStatus = selectLeaveStatus;
	}

}
