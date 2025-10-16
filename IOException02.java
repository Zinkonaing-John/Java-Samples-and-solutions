package chapter02;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class IOException02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileReader fr = new FileReader("b.txt");
			int i;
			
			while((i = fr.read())!= -1) {
				System.out.print((char)i);
			}
			
			fr.close();
			
		} catch (FileNotFoundException e) {
			
			System.out.println("파일 없음!");
		}catch (Exception e) {
			
			System.out.println("파일 읽기 오류!");
		} finally {
			System.out.println("파일 읽기 완료.");
		}
		

	}

}
