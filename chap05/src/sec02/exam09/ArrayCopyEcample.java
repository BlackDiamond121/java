package sec02.exam09;

public class ArrayCopyEcample {

	public static void main(String[] args) {
		String[] oldStrArray = { "java", "array", "copy"};
		String[] newStrArray = {"java", "array", "new"};
		
		System.arraycopy( oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for(int  i=0; i<newStrArray.length; i++) {
			System.out.println(newStrArray[i] + ", ");
		}

	}

}
