package Chapter01;

class Max{

	public int max(int a, int b) {
		return (a > b) ? a : b;
	}
	
	 public double max(double a, double b) {
	        return (a > b) ? a : b;
	    }
	
	}

public class Task09_Method_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Max c = new Max();
		
		int intResult = c.max(4, 6); 
        System.out.println("두 정수 중 큰 값: " + intResult);
        
        double doubleResult = c.max(6.1, 5.8); 
        System.out.println("두 실수 중 큰 값: " + doubleResult);
		
		
	}

}
