package chapter02;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Boox implements Serializable{
	int width;
	int height;
	int depth;
	
	
	public Boox(int width, int height, int depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
}



public class Object01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileOutputStream fos = new FileOutputStream("object.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			Boox ob = new Boox(10, 20 , 30);
			
			oos.writeObject(ob);
			
			oos.close();
			fos.close();
			
			 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error");
		} finally {
			
			System.out.println("Successful");
		}
		
		
		
	}

}


