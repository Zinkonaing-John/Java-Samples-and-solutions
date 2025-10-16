package Chapter01;

class Calculator{
	static int a,b,c;
		
}

class Calculation extends Calculator{
	
	
	public int Sum(int a, int b, int c) {
		return a+b+c;
	}
	
	public int Sum(int a, int b) {
		return a+b;
	}
	
	
}

public class Extends_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculation c = new Calculation();
		System.out.println(c.Sum(10, 20, 30));
		System.out.println(c.Sum(10, 20));
		

	}

}
