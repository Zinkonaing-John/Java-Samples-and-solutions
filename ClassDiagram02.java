package Chapter01;

class Parent{
	
	String name;
	
	 Parent() {
		
	}
	
}

class Child extends Parent{
	int age;
	float height;
	
	public Child(String name, int age,float height) {
		this.name=name;
		this.age = age;
		this.height = height;
	}

	public void printAll() {
		System.out.println("이름 : "+ name);
		System.out.println("나이 : "+ age);
		System.out.println("나이 : "+ height);
	}
}

public class ClassDiagram02 {

	public static void main(String[] args) {
		Child c1 = new Child("Dominica", 23, 183);
		System.out.println("### 인적사항 ###");
		c1.printAll();
	}

}
