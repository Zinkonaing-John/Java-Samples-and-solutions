package Chapter01;

abstract class Oop1 {
   
    public abstract void printMsg();
}


class SubOop1 extends Oop1 {
    
    @Override
    public void printMsg() {
        System.out.println("자바! 공부합시다");
    }
}

public class Exam007 {

	public static void main(String[] args) {
		

		 Oop1 obj = new SubOop1();

	        
	        obj.printMsg();
	}

}
