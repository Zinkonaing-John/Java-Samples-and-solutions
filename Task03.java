package Chapter01;

import java.util.Scanner;

class SimpleCircle{
	static final double PI = 3.14159;
}
public class Task03 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("원의 반지름 입력 : ");
		Scanner s = new Scanner(System.in);
		int ss = s.nextInt();
		System.out.println("원의 반지름 : "+ ss);
		System.out.println("원의 넓이 : " +(ss*ss*SimpleCircle.PI));


	}

}
