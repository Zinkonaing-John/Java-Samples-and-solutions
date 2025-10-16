package Exam;

import java.util.Scanner;

class MyCalc{
	
	public int  additon(int a, int b) {
		return a+b;

	}
	
	public int substraction(int a, int b) {
		return a-b;
	}
	
	public int multiplication(int a, int b) {
		return a*b;
	}
	
	public double division(double a, double b) {
		return a/b;
	}
}
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		MyCalc c = new MyCalc();
		
		while (true) {
			
			System.out.print("type 2 nums : ");
			
			String input = s.nextLine();
			
			String data[] = input.split(" ");
			
			
			
				
				
				if(input.equals("-1")) {
					System.out.println("Exit");
					break;
				}
				
				String operator;
				int a = Integer.parseInt(data[0]);
				operator =data[1];
				int b = Integer.parseInt(data[2]);
				
				
				switch(operator) {
				
				case "+" :
					System.out.println(c.additon(a, b));
					break;
					
				case "-" :
					System.out.println(c.substraction(a, b));
					break;
				case "*" :
					System.out.println(c.multiplication(a, b));
					break;
				case "/" :
					
					if(b == 0) {
						System.out.println("div 0 error");
						continue;
					}else {
					
					System.out.println(c.division(a, b));
					break;
				}
				
				}
				
				
			}
	}
	
}


