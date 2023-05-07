package week1.day2;

public class Calculator {

	public int add(int num1, int num2) {

		return  num1+num2;
	}
	
	public int sub(int num1, int num2) {
		
		return num1-num2;
		
	}
	
	public void mul() {
		System.out.println(10*6);
	}
	
	public static void main(String args[]) {
		Calculator calc = new Calculator();
		System.out.println(calc.add(10, 20));
		System.out.println(calc.sub(20, 10));
		calc.mul();
	}
}
