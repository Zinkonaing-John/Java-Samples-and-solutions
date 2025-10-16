package Exam;

import java.util.Scanner;

class SimpleCircle{
	static final double PI = 3.14159;
	
	
}

public class Static01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Type the num : ");
		int a = s.nextInt();
		
		
		
		System.out.println("Your input Num : " + a);
		
		System.out.println("Area : "+(a*a*SimpleCircle.PI));
		
	}

}
