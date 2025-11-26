package cote.exam1105;

public class MemoExam {

	public static void main(String[] args) {
		MemoRepository r = new LocalRepository();
		
		r = new LocalRepository();
		r.addMemo("1", "123");
		
		r = new RemoteRepository();
		r.addMemo("1", "12345ge");

	}

}
