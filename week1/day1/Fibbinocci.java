package week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNum = 0;
		int	secNum = 1;
		int sum;
		
		System.out.println(firstNum+" "+secNum);
		for(int i=0; i<11; i++)
		{
		sum = firstNum+secNum;
		firstNum = secNum;
		secNum = sum ;
		System.out.println(" " + sum);
		}
	}

}
