package Chapter01;

import java.util.Scanner;

// Student class with overloaded constructors
class Student {
    private String name;
    private String id;
    private String phone;

    // Constructor with only name
    public Student(String name) {
        this.name = name;
        this.id = "";
        this.phone = "";
    }

    // Constructor with name and ID
    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        this.phone = "";
    }

    // Constructor with name, ID, and phone
    public Student(String name, String id, String phone) {
        this.name = name;
        this.id = id;
        this.phone = phone;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getId() {
        return id.isEmpty() ? "-" : id;
    }

    public String getPhone() {
        return phone.isEmpty() ? "-" : phone;
    }
}

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*** 출석부 입력기 ***");
        System.out.print("출석부 입력 학생 수 : ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume the remaining newline

        // Array to store Student objects
        Student[] students = new Student[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println((i + 1) + " 번째 학생의 정보를 입력하세요: ");
            String input = scanner.nextLine();
            String[] data = input.split(" ");

            // Create Student object based on input length
            if (data.length == 1) {
                students[i] = new Student(data[0]);
            } else if (data.length == 2) {
                students[i] = new Student(data[0], data[1]);
            } else if (data.length == 3) {
                students[i] = new Student(data[0], data[1], data[2]);
            } else {
                System.out.println("잘못된 입력입니다. 다시 시도하세요.");
                i--; // Retry the current student's input
            }
        }

        // Output the attendance sheet
        System.out.println("\n이름\t학번\t전화번호");
        for (Student student : students) {
            System.out.println(student.getName() + "\t" + student.getId() + "\t" + student.getPhone());
        }

        scanner.close();
    }
}
