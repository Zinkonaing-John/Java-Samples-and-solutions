package chapter02;

class Parent{
	String name;
	
}

class Child extends Parent{
	int age;
	float height;
	
	
	public  Child(String name, int age, float height) {
		this.name = name;
		this.age = age;
		this.height = height;
		
	}
	
	public void printAll() {
		System.out.println("### 인적사항 ###");
		System.out.println("이름 : "+ name);
		System.out.println("나이 : "+ age);
		System.out.println("신장 : "+ height);
	}
}


public class Inheritance02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c1 = new Child("Dominica", 23, 183);
		c1.printAll();

	}

}
