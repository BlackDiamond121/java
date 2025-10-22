package cote.exam1020;

public class BookExample {

	public static void main(String[] args) {
		Book[] books = new Book[3];
		books [0] = new Book("자바", "홍길동", "123-456-7890");
		books [1] = new Book("파이썬", "홍길동", "123-456-7890");
		books [2] = new Book("리엑터", "홍길동", "123-456-7890");
		
		for(int i = 0; i < books.length; i++) {
			System.out.println(books[i].getTitle());
		}
	}

}
