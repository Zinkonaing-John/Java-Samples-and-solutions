package chapter02;

class Calculator{
	
	int plus;
	int minus;
	
	String plus(int plus, int minus) {
		this.plus = plus + minus;
		
		return "두수의 힙게 : "+ this.plus;
	}
	
	String minus(int plus, int minus) {
		this.minus = plus - minus;
		
		return "두수의 minus : "+ this.minus;
	}
}

class MultiDiv extends Calculator{
	
	int multi;
	double div;
	
	
	String multi(int x, int y) {
		multi = x * y;
		return "두 수의 곱셈 : " + multi;
		
	}
	String div(int x, int y) {
		div = x / y;
		return "두 수의 나늣셈 : " + div;
		
	}
}
public class Calcu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiDiv ob1 = new MultiDiv();
		System.out.println(ob1.plus(5, 5));
		System.out.println(ob1.minus(20, 10));
		System.out.println(ob1.multi(10, 10));
		System.out.println(ob1.div(100, 10));
		
		
		
	}

}
