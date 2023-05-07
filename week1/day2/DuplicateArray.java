package week1.day2;

public class DuplicateArray {
	
	public static void main(String[] args) {
		int [] numb = {2,5,3,7,9,5,3,2};
		
		for (int i=0; i< numb.length; i++) {
			for (int j =i+1; j<numb.length; j++) {
				if(numb[i]==numb[j]) {
					System.out.println(numb[j]);
				}
			}
		}
	}

}
