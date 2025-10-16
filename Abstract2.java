package Chapter01;

abstract class Oop{
	abstract void pringMsg();	
	
}

class SubOop extends Oop{

	@Override
	void pringMsg() {
		System.out.println("자바! 공부합시다.");
	}
	
	
}

public class Abstract2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Oop o = new SubOop();
		o.pringMsg();

	}

}
