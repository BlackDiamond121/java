package cote.exam1020;

public class PartTimeEmployee extends Employee{
	
	private int hourRate;
	private int workHour;
	
	public PartTimeEmployee(String name, String employeeId, int hourRate, int workHour) {
		super(name, employeeId);
		this.hourRate =  hourRate;
		this.workHour = workHour;
	}

	
	
	public int getHourRate() {
		return hourRate;
	}



	public void setHourRate(int hourRate) {
		this.hourRate = hourRate;
	}



	public int getWorkHour() {
		return workHour;
	}



	public void setWorkHour(int workHour) {
		this.workHour = workHour;
	}



	@Override
	public int calculatePay() {
		return hourRate * workHour;
	}
}
