package HRMPowerModule;

import java.io.Serializable;

public class AddHoliday implements Serializable {
	/**
	 * 
	 */
	
	private static final long serialVersionUID =1L;
	private String holidayName;
	private String holiadyDate;
	private String holidaymonth;
	private String holidayyear;
	
	public String getHolidayName() {
		return holidayName;
	}
	public void setHolidayName(String holidayName) {
		this.holidayName = holidayName;
	}
	public String getHoliadyDate() {
		return holiadyDate;
	}
	public void setHoliadyDate(String holiadyDate) {
		this.holiadyDate = holiadyDate;
	}
	public String getHolidaymonth() {
		return holidaymonth;
	}
	public void setHolidaymonth(String holidaymonth) {
		this.holidaymonth = holidaymonth;
	}
	public String getHolidayyear() {
		return holidayyear;
	}
	public void setHolidayyear(String holidayyear) {
		this.holidayyear = holidayyear;
	}
}
