package cote.exam1013;

public class PotatoPizza extends Pizza {
	public PotatoPizza() { this("M"); }
	public PotatoPizza(String size) {
		this.name = "포테이토피자";
		this.prices = new int[] {17000, 20000, 23000};
		this.size = size;
		this.toppings = "potato";
	}
	
	@Override
	public void cook() {
		System.out.println(toppings+"을 추기힙니다.");
		super.cook();
	}
}