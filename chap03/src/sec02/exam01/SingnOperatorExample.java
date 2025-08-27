package sec02.exam01;

public class SingnOperatorExample {

	public static void main(String[] args) {
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		
		byte b = 100;
		//byte rsult3 = -b; //부호연산을 하면 int가 되므로 오류
		int result3 = -b;
		System.out.println("result3=" + result3);

	}

}
