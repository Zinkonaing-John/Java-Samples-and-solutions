package chapter02;

class Dog{
	String breed;
	int age;
	String color;
	
	public Dog() {
		this.breed = "york";
		this.age = 1;
		this.color = "orange";
		
	}
	
	public void doggy() {
		System.out.println(breed+", "+age+", "+  color);
	}
	
	public void barking() {
		System.out.println("barking!");
	}
	public void hungry() {
		System.out.println("hungry!");
	}
	public void sleeping() {
		System.out.println("sleeping!");
	}
}


public class ClassAndObj02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog dd = new Dog();
		
		dd.doggy();
		dd.barking();
		dd.hungry();
		dd.sleeping();
	}

}
