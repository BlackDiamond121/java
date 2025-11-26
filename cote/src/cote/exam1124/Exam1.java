package cote.exam1124;

import java.util.Scanner;
import java.util.InputMismatchException;
public class Exam1 {
	//모든 예외를 try, cqtch로 쳐
	public static void main(String[] args) {
		int[] values = {1, 3, 5, 7, 9};
		try {
			int index = getIndex();
			System.out.println(values[index]);
		} catch (Exception e) {
			System.out.println("오류가 발생했습니다.");
		}
	}
	// 발생 가능한 exception을 throws
	public static int getIndex() {
		Scanner scanner = new Scanner(System.in);
		int index = scanner.nextInt();
		scanner.close();
		return index;
	}

}