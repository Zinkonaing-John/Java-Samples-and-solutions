package Exam;

class Parent{
	String name;
	
	Parent(String name){
		this.name=name;
	}
}

class Child extends Parent{
	int age;
	float height;
	

	Child(String name,int age, float height) {
		super(name);
		this.age=age;
		this.height=height;	
	}
	
	public void printAll(){
		System.out.println("### 인적사항 ###");
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("신장 : "+height);
		
	}
	
}
public class Heritance14_2O {

	public static void main(String[] args) {
		Child c = new Child("Dominica",23,183);
		c.printAll();
		
		

	}

}
