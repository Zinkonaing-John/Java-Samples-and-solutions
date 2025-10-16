package Chapter01;

class Am{
	int count =1;
	void callme() {
		System.out.println("Am 클레스의 count 값 : "+ count);
	}
	
}

class Bm extends Am{
	int count=2;
	void callme() {
		System.out.println("Bm 클레스의 count 값 : "+ count);
	}
}


class Cm extends Bm{
	int count=3;
	void callme() {
		System.out.println("Cm 클레스의 count 값 : "+ count);
	}
}
public class Polpmosphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Am a = new Am();
		a.callme();
		System.out.println("a.count 값 : "+ a.count);
		
		a = new Bm();
		a.callme();
		System.out.println("a.count 값 : "+ a.count);
		
		a = new Cm();
		a.callme();
		System.out.println("a.count 값 : "+ a.count);

	}

}
