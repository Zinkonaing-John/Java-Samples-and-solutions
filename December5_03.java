package Chapter01;

import java.util.Scanner;

class Studentt{
	String name;
	int age;
	
	Studentt(String name, int age){
		this.name=name;
		this.age = age;
	
		
	}
	
	Studentt(int age, String name){
		this.name=name;
		this.age = age;
		
		
	}
	
	Studentt(String name){
		this.name=name;
		this.age =0;
		
	}
	
	Studentt(int age){
		this.name=" ";
		this.age=age;
		
		
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void display(int number) {
		System.out.printf("%d\t%s\t%d\n",number,name,age);
	}

	
	
}

public class December5_03 {

	public static void main(String[] args) {
		
		
		Studentt[] students = {
	            new Studentt("홍길동", 27),
	            new Studentt("황진이", 26),
	            new Studentt("김영철", 0),
	            new Studentt(" ", 25)
	        };
		
        
		
		Scanner s = new Scanner(System.in);
        
		while (true) {
            System.out.println("*** 학생 정보 ***");
            System.out.println("번호\t이름\t나이");
            for (int i = 0; i < students.length; i++) {
                students[i].display(i + 1);
            }

           
            
            System.out.println("\n수정할 사용자 번호 입력(종료-0): ");
            int choice = s.nextInt();

            if (choice == 0) { 
                System.out.println("프로그램 종료");
                break;
            }

            if (choice < 1 || choice > students.length) { // Invalid input
                System.out.println("잘못된 번호입니다. 다시 입력하세요.");
                continue;
            }

            
            Studentt ss = students[choice - 1];
            
            System.out.print("ToUpdate (type:update) : ");
            String field = s.next();

            switch (field){
            
            case "update": // Update both name and age
                System.out.print("이름: ");
                String newName = s.next();
                System.out.print("나이: ");
                int newAge = s.nextInt();
                ss.setName(newName);
                ss.setAge(newAge);
                break;

                default:
                    System.out.println("Try again!");
                    break;
            }
		}
		
	}
}

