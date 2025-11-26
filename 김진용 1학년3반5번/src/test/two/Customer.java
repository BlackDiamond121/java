package test.two;

public class Customer {
	public String name;
	public String phone;
	public int point;
	
	public Customer() {
		this.name = name;
		this.phone = phone;
		this.point = 0;
	}
	
	public Customer(String name, String phone) {
		this.name = name;
		this.phone = phone;
		this.point = 0;
	}
	
	public Customer(String name, String phone, int point) {
		this.name = name;
		this.phone = phone;
		this.point = point;
	}
	
	public int updatePoint(int amount) {
		int point = 0;
		point += amount;
		return point;
	}
	
	public int setPoint(int point) {
		point = this.point;
		return point;
	}
}
