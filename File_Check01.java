package chapter02;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_Check01 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String data = "Today is a great day!"+ "\n" +"today is a beautiful day.";
		try {
			FileOutputStream fos = new FileOutputStream("tt.txt");
			DataOutputStream dos = new DataOutputStream(fos);
			dos.writeUTF(data);
			

			fos.close();
			dos.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Error!"); 
		}finally {
			System.out.println("Complete!");
		}
	}

}
