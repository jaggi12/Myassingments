package week1.day2;

public class StringLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "TestLeaf";
		char[] charArray = input.toCharArray();
//		char[] str = input.toCharArray();
		
		for (int i = charArray.length-1; i>=0; i--) {
			System.out.print(charArray[i]);
		}
//		
//		for (int i =0; i<=str.length; i++) {
//			System.out.println(str[i]);
//		}
	}

}
