package sec04.exam01;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator MyCalc = new Calculator();
		MyCalc.powerOn();
		
		int result1 = MyCalc.plus(5, 6);
		System.out.println("result1: " + result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = MyCalc.divide(x, y);
		System.out.println("result2: " + result2);
		
		MyCalc.powerOff();

	}

}