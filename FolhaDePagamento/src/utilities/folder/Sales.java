package utilities.folder;

public class Sales {
	private int day;
	private int month;
	private float value;
	private int employeeId;
	
	public Sales(int day, int month, float value, int employeeId) {
		super();
		this.day = day;
		this.month = month;
		this.value = value;
		this.employeeId = employeeId;
	}
	
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public float getValue() {
		return value;
	}
	public int getEmployeeId() {
		return employeeId;
	}

}
