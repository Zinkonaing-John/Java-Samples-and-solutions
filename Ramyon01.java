package chapter02;

class Ramyon{
	
	public void printMsg() {
		System.out.println("Ramyon class 입니다.");
	}
}

class CheeseRamyon extends Ramyon{
	public void printMsg() {
		
		System.out.println("CheeseRamyon class 입니다.");
	}
	
}
public class Ramyon01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Ramyon r = new Ramyon();
	 
	 r.printMsg();
	 
	 r = new CheeseRamyon();
	 r.printMsg();
	 
	}

}
