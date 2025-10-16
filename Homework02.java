package Chapter01;

import java.util.Scanner;

class MyCalc{
	int add;
	int sub;
	int mul;
	double div;

	public void addition(int a, int b) {
		System.out.println("Add : "+(a+b));
	}
	
	public void subtraction(int a, int b) {
		System.out.println("Sub : "+ (a-b));
	}
	
	public void multiplication(int a, int b) {
		System.out.println("Mul : "+(a*b));
	}
	
	public void division(int a, int b) {
		if(b==0) {
			System.out.println("div 0 error!");
		}else {
			System.out.println("Div : "+(double) a/b);
		}
	}

	
}

public class Homework02 {

	public static void main(String[] args) {
		
		
		
		Scanner s = new Scanner(System.in);
		
		MyCalc calculator = new MyCalc();
		
		
		while(true){
		System.out.print("Input Operation / (-1) to exit  : ");
		
		
		String input = s.nextLine();
		
		
		
		String[] data = input.split(" ");
		
		
		if (input.equals("-1")) {
            System.out.println("Exiting...");
            break;
        }
		
		if (data.length != 3) {
            System.out.println("operation error!");
            continue;
        }
		
		String operator;
		int a = Integer.parseInt(data[0]);
		operator = data[1];
		int b = Integer.parseInt(data[2]);
		
		
	
			switch(operator) {
			
			case"+":
				calculator.addition(a, b);
				break;
				
			case"-":
				calculator.subtraction(a, b);
				break;
				
			case"*":
				calculator.multiplication(a, b);
				break;
			
			case"/":
				calculator.division(a, b);
				
			
			}
			
			 
			
		
		}
		
		
		
	}
		
}	
		



