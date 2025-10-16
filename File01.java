package chapter02;

import java.io.FileReader;
import java.io.FileWriter;

public class File01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "암카야! 만화 그만!\n태승아! 검색 그만!";
		
//		try {
//			FileWriter fw = new FileWriter("data.txt");
//			
//			fw.write(data);
//			
//			fw.close();
//			
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			System.out.println("File error!");
//		} finally {
//			System.out.println("File writing successful!");
//		}
		
		try {
			FileReader fr = new FileReader("data.txt");
			FileWriter fw = new FileWriter("data_cpy.txt");
			int i;
			
			while((i = fr.read())!= -1) {
				
				fw.write((char)i);
			}
			
			fr.close();
			fw.close();
			
		} catch(Exception e) {
			
			System.out.println("파일 잌출력 오류!");
		} finally {
			System.out.println("File copy successful.^^");
		}

	}

}
