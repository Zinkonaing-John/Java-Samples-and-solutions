package Chapter01;
class A {
	private static int counter = 0;//change counter as static
	
	
	
public static int getCount() {
	return counter; //정적 메서드로 선언되었습니다.
 }
public A() {
counter++;
}
}

public class HW09 {

	public static void main(String[] args) {
		
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
		System.out.println(A.getCount());

	}
}