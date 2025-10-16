package chapter02;

import java.util.Scanner;

public class Scanner_Delimiter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s = "생각하는 자바, 재미있는 자바, 줄거운 자바, 신나는 자바";
		
		Scanner sc = new Scanner(s);
		
		sc.useDelimiter("자바, ");
		
		while (sc.hasNext()) {
			System.out.println(sc.next());
		}
		
	s = "1 fish 2 fish red fish blue fish";
	
	sc = new Scanner(s).useDelimiter("\\s*fish\\s*");
	
	System.out.println(sc.nextInt());
	System.out.println(sc.nextInt());
	System.out.println(sc.next());
	System.out.println(sc.next());
	
	sc.close();
				
	}

}
