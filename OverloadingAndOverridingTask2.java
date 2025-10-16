package chapter02;

class Cal{
	
	public void sum(int a, int b) {
		
		System.out.println("두 수의 합게 :" + (a + b));
	}
	public void sum(double a, double b) {
		
		System.out.println("두 수의 합게 :" + (a + b));
	}
	
	public void sum(int a, int b, int c) {
		
		System.out.println("세 수의 합게 :" + (a + b + c));
	}
}

public class OverloadingAndOverridingTask2 {

	public static void main(String[] args) {
		
		Cal obj = new Cal();
		
		obj.sum(10, 20, 30);
		obj.sum(10, 20);
		obj.sum(2.5, 3.6);
	}

}
