package sec2.exam01;

public class TryCatchFinalExample {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("string2");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}

}
