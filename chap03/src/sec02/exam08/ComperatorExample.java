package sec02.exam08;

public class ComperatorExample {

	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3); //true
		
		double v4 = 0.1;
		float v5 = 0.1f; // float 0.1는 정확히 0.1이 X, 0.1보다 미세하게 더 큼
		System.out.println(v4 == v5); //false
		System.out.println((float)v4 == v5); //true
		System.out.println((int)(v4*10) == (int)(v5*10)); //true
		

	}

}
