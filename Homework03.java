package Chapter01;

import java.util.Scanner;

class Store{
	static int count = 0;
	
	public String result(String store) {
		return  store+"포함 현재 까지 점포 개 : ";
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Store.count = count;
	}
	
	
	
}

public class Homework03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("*** 점포 생성기 ***");
		System.out.print("생성 가능한 점포의최 개수를 입력하세요.(종료 : q) :");
		
		int input = s.nextInt();
		
		
		
		for(int i=1; i<=input; i++) {
			
			System.out.println("점포 지열을 입력하세요 : ");
			String input1 = s.next();
			Store ss = new Store();
			
			if(input1.charAt(0)=='q') {
				System.out.println("생성된 전체 점포 개수 : "+ ss.getCount());
				break;
			}else {
				
				System.out.println(ss.result(input1)+i);
				System.out.println();
				ss.setCount(i);
			}
			
			
			
			
		}
		
		
		
	}

}
