package chapter02;

import java.util.Scanner;

public class Scanner_string_andCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		
		while(true) {
			
			System.out.print(">>");
			String input =s.nextLine();
			
			if(input.equals("종료")) {
				System.out.println("종료합니다.");
				break;
				
				
			}
			
			
				Scanner sc = new Scanner(input);
				int wordCount =0;
				
				while (sc.hasNext()) {
					sc.next();
					wordCount++;
				}
				
				System.out.println("어절 개수는 : "+ wordCount);
			
		}
		
		s.close();
	}

}
