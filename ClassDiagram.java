package Chapter01;

import java.util.Scanner;
import java.util.ArrayList; // Import ArrayList

// Member class remains the same
class Member {
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
		System.out.println("이름   \t: " + name);
		System.out.println("나이   \t: " + age);
		System.out.println("전화번 \t: " + tel);
		System.out.println("이메일 \t: " + email);
	}
}

// Students class remains the same (prints actual score)
class Students extends Member {

	int score;

	public Students(String name, int age, String tel, String email, int score) {
		super(name, age, tel, email);
		this.score = score;
	}

	@Override
	public void pringMsg() {
		super.pringMsg();
		System.out.println("점수   \t: " + score);
	}
}

// --------------------------------------------------

public class ClassDiagram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Use an ArrayList to store multiple Students objects
		ArrayList<Students> studentList = new ArrayList<>(); 
		
		int choice = 0;

		while (choice != 3) {
			
			// --- Show Menu ---
			System.out.println("\n==================================");
			System.out.println("메뉴:");
			System.out.println("1. Enrollment (학생 등록)");
			System.out.println("2. Show Table (정보 표시)");
			System.out.println("3. Exit (종료)");
			System.out.println("==================================");
			System.out.print("선택하세요 (1-3): ");

			// Read and validate user's choice
			if (scanner.hasNextInt()) {
				choice = scanner.nextInt();
				scanner.nextLine(); // Consume the newline
			} else {
				System.out.println("🚨 잘못된 입력입니다. 숫자를 입력해주세요.");
				scanner.nextLine(); 
				continue;
			}


			switch (choice) {
				case 1:
					// --- 1. Enrollment (Add student) ---
					System.out.println("\n--- 학생 정보 입력 ---");
					
					System.out.print("이름을 입력하세요: ");
					String name = scanner.nextLine();
					
					System.out.print("나이를 입력하세요: ");
					int age = scanner.nextInt();
					scanner.nextLine(); 
					
					System.out.print("전화번호를 입력하세요: ");
					String tel = scanner.nextLine();
					
					System.out.print("이메일을 입력하세요: ");
					String email = scanner.nextLine();
					
					System.out.print("점수를 입력하세요: ");
					int score = scanner.nextInt();
					scanner.nextLine(); 

					// Create a new Students object
					Students newStudent = new Students(name, age, tel, email, score);
					
					// Add the new student object to the ArrayList
					studentList.add(newStudent); 
					
					System.out.println("✅ 학생 (" + name + ") 정보가 등록되었습니다. (총 " + studentList.size() + "명)");
					break;

				case 2:
					// --- 2. Show Table (Display all students) ---
					System.out.println("\n--- 전체 학생 정보 표시 ---");
					
					if (studentList.isEmpty()) {
						System.out.println(" 등록된 학생 정보가 없습니다. 1번을 선택하여 먼저 등록해주세요.");
					} else {
						// Loop through every Student object in the list
						for (int i = 0; i < studentList.size(); i++) {
							System.out.println("\n--- 학생 #" + (i + 1) + " ---");
							studentList.get(i).pringMsg(); // Call pringMsg() for each student
						}
					}
					break;

				case 3:
					System.out.println("\n프로그램을 종료합니다. 감사합니다! 👋");
					break;

				default:
					System.out.println("🚨 잘못된 메뉴 선택입니다. 1, 2, 또는 3을 입력하세요.");
					break;
			}
		}

		scanner.close();
	}
}