package Chapter01;

class Member{
	 String name;
	 int age;
	 String tel;
	String email;
	
	public Member(String name, int age, String tel, String email) {
		this.name=name;
		this.age=age;
		this.tel=tel;
		this.email=email;
	}
	
	public void pringMsg() {
		System.out.println("이름   	: "+ name);
		System.out.println("나이   	: "+ age);
		System.out.println("전화번  	: "+ tel);
		System.out.println("이메일  	: "+ email);
	
	}
}

class Students extends Member{
	
	int score;
	
	public Students(String name, int age, String tel, String email,int score){
		super(name,age,tel,email);
		this.score = score;
		
	}

	@Override
	public void pringMsg() {
		// TODO Auto-generated method stub
		super.pringMsg();
		System.out.println("점수   	: 85");
	}
	
	
	
	
}
public class ClassDiagram03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s = new Students("Zinko", 24,"01059265992","johnminnaing152200@gmail.com",86);
		s.pringMsg();
	}

}
