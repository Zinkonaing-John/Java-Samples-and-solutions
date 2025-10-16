package chapter02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputStream01 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		// String data = "I need you babe";
		
			FileOutputStream fos = new FileOutputStream("data.txt");

		
		try {
			FileInputStream fis = new FileInputStream("data.txt");
			
			int a = fis.read();
			int b = fis.read();
			int c = fis.read();
		
		System.out.println(a + "" + b + "" + c);
			
			fis.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error!");
		} finally {
			System.out.println("Successful!");
		}
		
		
//		try {
//			FileInputStream fis = new FileInputStream("G-dragon.jpeg");
//			FileOutputStream fos = new FileOutputStream("dg_cpy.jpeg");
//			
//			int i;
//			
//			while((i=fis.read())!= -1) {
//				fos.write(i);
//			}
//			
//			fis.close();
//			fos.close();
//			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			System.out.println("Error!");
//		}finally {
//			System.out.println("Successful!");
//	}
  }
}
