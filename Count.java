package Exam;

import java.util.Scanner;

class Store {
	
 static int count =0;
	
	 public void StoreMethod(String a){
		 count += 1;
	System.out.println(a + "포함 현제까지 점포 개수 : "+count);
	
	 }
}
public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
	
		System.out.println("*** 점포 생성기 ***");
		
		System.out.print("Number of city you want(q to quit): : ");
		int input = s.nextInt();
		
		
		for(int i=0; i<input; i++) {
			
			System.out.println("점포 지역을 입력하세요 : ");
			String city = s.next();
			Store ss = new Store();
			
			if(city.charAt(0) == 'q') {
				System.out.println("total city is : "+ i);
				break;
				
			}
			
		}
		

	}
}


