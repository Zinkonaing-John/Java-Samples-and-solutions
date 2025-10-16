package chapter02;

class Member{
	String name;
	int age;
	String tel;
	String email;
	
	public Member(String name, int age, String tel, String email) {
		this.name = name;
		this.age = age;
		this.tel = tel;
		this.email = email;
	}
	
	public void pringMsg() {
		System.out.println("이름 :"+ name);
		System.out.println("나이 :"+ age);
		System.out.println("전화번호 :"+ tel);
		System.out.println("이메일 :"+email);
		
	}
	
}

class Student extends Member{
	
	int score;
	
	public Student(String name, int age, String tel, String email, int score) {
		super(name, age, tel, email);
		this.score = score;
		
	}
	
	public void pringMsg(){
		super.pringMsg();
		System.out.println("점수 :"+ score);
		
	}

	
	
	
	
}
public class InheritanceTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std = new Student("홍길동", 25, "010-111-1111","hong@naver.com",85);
		std.pringMsg();
	}

}
