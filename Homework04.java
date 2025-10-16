package Chapter01;


import java.util.Scanner;

class Student{
	private String name;
	private String id;
	private String phone;

	public Student(String name) {
		this.name = name;
		this.id = "";
		this.phone = "";
	}
	
	public Student(String name, String id) {
		this.name = name;
		this.id = id;
		this.phone = "";
	}

	public Student(String name, String id,String phone) {
		this.name = name;
		this.id = id;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id.isEmpty() ? " " : id;
	}

	public String getPhone() {
		return phone.isEmpty() ? " " : phone;
	}
	
	

	
}
public class Homework04 {

	
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("*** 출석부 입력기 ***");
		System.out.print("출석부 입력 학생수 : ");
		int numStudents = s.nextInt();
		s.nextLine();
		
		
		Student[] students = new Student[numStudents];
		
		for(int i=0; i<numStudents; i++) {
			System.out.println((i+1)+" 번째 힉생의 점보를 입력하세요 : ");
			String input = s.nextLine();
			String[] data = input.split(" ");
			
			
			if (data.length == 1) {
				students[i] = new Student(data[0]);
            } else if (data.length == 2) {
            	students[i] = new Student(data[0], data[1]);
            } else if (data.length == 3) {
            	students[i] = new Student(data[0], data[1], data[2]);
            } else {
                System.out.println("잘못된 입력입니다. 다시 입력하세요.");
                i--; 
            }
			
		}
		
		System.out.println("\n이름\t학번\t전화번호");
        for (Student student : students) {
            System.out.println(student.getName() + "\t" + student.getId() + "\t" + student.getPhone());
        }
		
	}

}
