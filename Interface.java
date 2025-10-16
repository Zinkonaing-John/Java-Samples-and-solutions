package Chapter01;

abstract class Aa{
	int a;
	void print(){
		System.out.println("A 크래스의 print() 메소드 ");
	}
	
abstract void printMsg();
}

interface  AA{
	final int a = 100;
	abstract void draw();
	
}

interface BB{
	void drawBB();
}

class B extends Aa implements AA,BB{ 
	@Override
	void printMsg() {
		System.out.println("B 크래스의 print() 메소드 ");
		
	}

	@Override
	public void draw() {
		System.out.println("AA interface's draw() 메소드 overriding ");
		
	}

	@Override
	public void drawBB() {
		System.out.println("BB interface's drawBB() 메소드 overriding ");
		
	} 
	
}

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aa obj = new B();
		obj.printMsg();

	}

}
