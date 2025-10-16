package Chapter01;

class Circle{
	protected int radius;
	public Circle(int r) {radius=r;}
}

class Pizza{
	String pizza;
	int size;
	
	Pizza(String pizza, int size){
		this.pizza=pizza;
		this.size=size;
	}
	
	void print(){
		System.out.println("피자의 종류 : "+pizza);
		System.out.println("피자의 크디 : "+size);
	}
}

public class Week14_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pizza obj = new Pizza( "Pepperon1", 20);
		obj.print();

	}

}
