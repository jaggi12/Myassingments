package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 23;
		boolean isprime = false;
		for(int i = 2; i<num/2; ++i) {
			if (num %i==0) {
					isprime = true;
					break;
			}
		}
		
		if (!isprime)
			System.out.println(num +" "+"is a prime number.");
		else
			System.out.println(num+" "+"is not a prime number.");
		
	}

}
