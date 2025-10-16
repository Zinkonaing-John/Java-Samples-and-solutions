package Chapter01;

class Max1{
	
	
	Max1(){
		
	}
	
	public int min(int a, int b) {
		return (a < b) ? a :b;
		
		
	}
	
	public double min(double a, double b) {
		return (a < b) ? a :b;
	}
}
public class December5_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Max1 m = new Max1();
		int resultInt= m.min(6, 5);
		System.out.println("두 정수 중 큰 값은 : "+resultInt);
		double resultDouble=m.min(6.1, 5.8);
		System.out.println("두 정수 중 큰 값은 : "+resultDouble);
		
		
	}

}
