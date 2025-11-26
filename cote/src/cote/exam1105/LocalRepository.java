package cote.exam1105;

public class LocalRepository implements MemoRepository{

	@Override
	public void addMemo(String id, String body) {
		System.out.println("PC에 매모를 저장합니다.");
		
	}

	@Override
	public void getMemos() {
		System.out.println("PC에 매모를 조회합니다.");
		
	}

	@Override
	public void updateMemo(String id, String body) {
		System.out.println("PC에 매모를 수정합니다.");
		
	}

	@Override
	public void deleteMemo(String id) {
		System.out.println("PC에 매모를 삭제합니다.");
		
	}
	
}
              