package Chapter01;

import java.util.Scanner;

class Sales{
	
	
	String article;
	protected int qty;
	protected int cost;
	protected static int cnt;
	protected static float discount;
	Scanner sc;
	
	public Sales(){
		sc = new Scanner(System.in);
	}
	
	public void setProcess() {
		System.out.print("품목 : ");
		article=sc.nextLine();
		System.out.print("수량 : ");
        qty = sc.nextInt();
        System.out.print("단가 : ");
        cost = sc.nextInt();
        System.out.print("할인율 : ");
        discount=sc.nextFloat();
        sc.nextLine();	
        
        int totalPrice = qty * cost;
        totalPrice = (int) (totalPrice * (1 - discount));
        System.out.println(article + totalPrice);
        cnt += qty;
        
       
	}
	public static void getDisplay() {
		
		
		 System.out.println("핀메건수 : " + cnt);
		
	}
	public static void setDiscount(float d) {
		 discount = d;
		
	}
	
	
}

public class December5_04 {
	
	
	public static void main(String[] args) {
		
		
		
		Sales.setDiscount(0.1f);
		
		for (int i = 1; i <= 2; i++) {
            if(i==1) {
            	Sales s1 = new Sales();
            	s1.setProcess();
            }else {
            	Sales s2 = new Sales();
            	s2.setProcess();
            }
          
	        
		}
	
		Sales.getDisplay();	

	}

}
