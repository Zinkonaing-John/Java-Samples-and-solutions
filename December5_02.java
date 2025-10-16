package Chapter01;

import java.util.Scanner;

class AttendanceBook{
	String name;
	String no;
	String tel;
	
	AttendanceBook(){
		
	}
	
	AttendanceBook(String name){
		this.name=name;
		this.no = " ";
		this.tel = " ";
		
		
	}
	
	
	AttendanceBook(String name, String no){
		this.name=name;
		this.no = no;
		this.tel = " ";
		
	}

	AttendanceBook(String name,String no, String tel){
		this.name=name;
		this.no = no;
		this.tel = tel;
	
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name  + no  + tel;
	}
	
	
	
	
}

public class December5_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner s = new Scanner(System.in);
	System.out.print("출석부 입력 학생 수 : ");
	int totalStudent = Integer.parseInt(s.nextLine());
	
	AttendanceBook[] std = new AttendanceBook[totalStudent];
	
	for(int i=0; i<totalStudent; i++) {
		System.out.print((i+1)+"번째 학생의 정보를 입력하세 : ");
		String input = s.nextLine();
		String[] data = input.split(",");
		
		if (data.length == 1) {
            std[i] = new AttendanceBook(data[0]);
        } else if (data.length == 2) {
            std[i] = new AttendanceBook(data[0], data[1]);
        } else if (data.length == 3) {
            std[i] = new AttendanceBook(data[0], data[1], data[2]);
        } else {
            System.out.println("잘못된 입력입니다. 다시 시도하세요.");
            i--; 
        }
		
	}
	
	System.out.println("*** 입력한 학생들의 정보 ***");
	System.out.println("성명\t\t학번\t\t전화번호");
	for(AttendanceBook students : std) {
		System.out.println(students.name+"\t\t"+students.no+"\t\t"+students.tel);
	}
	
	
	

	}

}
