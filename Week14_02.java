package Chapter01;

class Animal{
	
	void walk() {
		System.out.println("길을 수 있음 ");
	}
}

class Bird extends Animal{

	void fly() {
		System.out.println("날 수 있");
	}
	
	void sing() {
		System.out.println("노래할 수 있");
	}
}
public class Week14_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
	}

}
