package chapter02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


interface Action {
    void execute(Scanner scanner);
}


class Member2 {
    private String name;
    private int age;
    private String tel;
    private String email;

    public Member2(String name, int age, String tel, String email) {
        this.name = name;
        this.age = age;
        this.tel = tel;
        this.email = email;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getTel() { return tel; }
    public void setTel(String tel) { this.tel = tel; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}


class AddAction implements Action {
    private List<Member2> members;

    public AddAction(List<Member2> members) {
        this.members = members;
    }

    @Override
    public void execute(Scanner scanner) {
        System.out.print("이름 : ");
        String name = scanner.nextLine();

        System.out.print("나이 : ");
        while (!scanner.hasNextInt()) {  
            System.out.println("Invalid input. Please enter a number.");
            scanner.next();
        }
        int age = scanner.nextInt();
        scanner.nextLine();  

        System.out.print("전화번호 : ");
        String tel = scanner.nextLine();
        
        System.out.print("이메일 : ");
        String email = scanner.nextLine();

        members.add(new Member2(name, age, tel, email));
        System.out.println("✅ Member added successfully!");
    }
}

// SearchAction Class
class SearchAction implements Action {
    private List<Member2> members;

    public SearchAction(List<Member2> members) {
        this.members = members;
    }

    @Override
    public void execute(Scanner scanner) {
        System.out.print("Enter name to search: ");
        String name = scanner.nextLine();
        
        for (Member2 member : members) {
            if (member.getName().equalsIgnoreCase(name)) {
                System.out.println("✅ Member found: ");
                System.out.println("Name: " + member.getName() + ", Age: " + member.getAge() + ", Tel: " + member.getTel() + ", Email: " + member.getEmail());
                return;
            }
        }
        System.out.println("Member not found.");
    }
}

// PrintAction Class
class PrintAction implements Action {
    private List<Member2> members;

    public PrintAction(List<Member2> members) {
        this.members = members;
    }

    @Override
    public void execute(Scanner scanner) {
        if (members.isEmpty()) {
            System.out.println(" No members to display.");
            return;
        }
        System.out.println("📋 Member List:");
        for (Member2 member : members) {
            System.out.println("Name: " + member.getName() + ", Age: " + member.getAge() + ", Tel: " + member.getTel() + ", Email: " + member.getEmail());
        }
    }
}

// Task4 (Main Class)
public class Task4 {
    private static List<Member2> members = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Action addAction = new AddAction(members);
        Action searchAction = new SearchAction(members);
        Action printAction = new PrintAction(members);

        while (true) {
            System.out.println("\n 다음 메뉴 중 하나를 입력하세요 :");
            System.out.println("1.️회원기입");
            System.out.println("2.회원검색");
            System.out.println("3.목녹출력️");
            System.out.println("4.종료");
            System.out.print(" Choose an option: ");

            if (!scanner.hasNextInt()) {
                System.out.println(" Invalid input. Please enter a number.");
                scanner.next(); 
                continue;
            }
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1: addAction.execute(scanner); break;
                case 2: searchAction.execute(scanner); break;
                case 3: printAction.execute(scanner); break;
                case 4: 
                    System.out.println(" Exiting program...");
                    scanner.close();
                    return;
                default:
                    System.out.println(" Invalid option, please try again.");
            }
        }
    }
}
