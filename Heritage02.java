package Chapter01;

class C1{
	String name ;
	
	public C1(String name) {
		
		this.name = name;
		
	}
}



class C2 extends C1{
	int age;
	float height;
	
	
	public C2(String name, int age,float height) {
		super(name);
		this.age = age;
		this.height = height;
	}
	
	
	public void printAll() {
		
		
		
		System.out.println("name : "+name);
		System.out.println("나이 : "+ age);
		System.out.println("나이 : "+ height);
	}
	
	
}

public class Heritage02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C2 c = new C2("Dominica", 23, 183);
		c.printAll();

	}
	
	

}
