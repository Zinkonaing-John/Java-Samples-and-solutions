package chapter02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOExpection {

	public static void main(String[] args)   {
		
		try {
			FileReader fr = new FileReader("a.txt");
			int i;
			while ((i = fr.read())!= -1){
				System.out.print((char)i);
			}
			//close the file..
			fr.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일 없음!");
		} catch (IOException e) {
			System.out.println("파일 읽기 오류!");
		} finally {
			System.out.println("파일 처리 종료!");
		}

	}

}
