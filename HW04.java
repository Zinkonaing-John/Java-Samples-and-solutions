package Chapter01;

class Constructor{
public int a = 3 ;
public int b = 5 ;
public int c = 7 ;


public Constructor(int a, int b) {
	
	a = a; // 매개변수 a 를 필드 a 에 할당하지 안다.
	b = b; // 매개변수 b 를 필드 b 에 할당하지 안다.
	
	}
}
public class HW04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor ct = new Constructor( 2, 4 );
		System.out.println("객체변수 a : " + ct.a );
		System.out.println("객체변수 b : " + ct.b );
		System.out.println("객체변수 c : " + ct.c );
		}
	}


