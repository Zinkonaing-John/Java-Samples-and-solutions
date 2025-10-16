package chapter02;

import java.io.FileWriter;
import java.io.IOException;

public class Reading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "경선이와 태승이를 군대로!";
		
		try {
			FileWriter fw = new FileWriter("c.txt");
			
			fw.write(s);
			
			fw.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("파일 출력 오류!");
		} 

	}

}
