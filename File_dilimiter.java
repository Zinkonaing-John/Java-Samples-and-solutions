package chapter02;

import java.util.Scanner;
import java.io.File;

public class File_dilimiter {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner p = new Scanner(System.in);
		
		System.out.println("Type ID number : ");
		int id = p.nextInt();
		
		Scanner s = new Scanner(new File("phone.txt"));
		while (s.hasNext()) {
			if(id == s.nextInt()) {
				System.out.println(id + "학생의 phone no: is " + s.next());
				return;
			}else {
				
				s.next();
			}
		}
		
		System.out.println("학생의 번호가 저장되어 않습니다.");

	}

}
