package cote.exam1013;

import java.util.Scanner;

public class MenuExample {

	public static void main(String[] args) {
		Menu[] menus = new Menu[3];
		menus [0] = new Menu("피자", 9000);
		menus [1] = new Menu("고기", 4000);
		menus [2] = new Menu("치킨", 12000);
		
		Scanner scanner = new Scanner(System.in);
		int orderIndex = scanner.nextInt();
		int quantity = scanner.nextInt();
		scanner.close();
		
		//OrderItem 객체 생성
		if(orderIndex >= 0 && orderIndex < menus.length && quantity > 0) {
			OrderItem item = new OrderItem(menus[orderIndex], quantity);
			System.out.println(item.getPrice());
	    }
	}

}