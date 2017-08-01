package utilities.folder;

public class PointCard {
	private int day;
	private int month;
	private int hours;
	private int employeeId;
	
	public PointCard(int day, int month, int hours, int employeeId) {
		super();
		this.day = day;
		this.month = month;
		this.hours = hours;
		this.employeeId = employeeId;
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getHours() {
		return hours;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
}
