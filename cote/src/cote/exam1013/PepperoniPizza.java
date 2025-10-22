package cote.exam1013;

public class PepperoniPizza extends Pizza{
	public PepperoniPizza() { this("M"); }
	public PepperoniPizza( String size ) {
		this.name = "페퍼로니피자";
		this.prices = new int[] { 20000, 25000, 30000 };
		this.size = size;
		this.toppings = "pepperoni";
	}
	
	@Override
	public void cook() {
		System.out.println(toppings+"을 추기힙니다.");
		super.cook();
	}
}