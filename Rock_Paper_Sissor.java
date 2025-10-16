package chapter02;

import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Sissor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		boolean running = true;
		
		while(running) {
			
			System.out.print(">>나[가위(1), 바위(2), 보(3), 종료(4)] 중 입력>> ");
			int user = sc.nextInt();
			
			if(user == 4) {
				System.out.println("System Exit");
				break;
			}
			
			if(user < 1 || user > 4) {
				
				System.out.println("The input should be 1-4.");
				continue;
			}
			
			int computer = r.nextInt(3)+1;
			String choices[] = {"", "가위", "바위", "보"};
			
			System.out.println("나(" + choices[user] + ") : 컴퓨터("+ choices[computer]+")");
			
			switch(user) {
			case 1:
				switch(computer) {
				case 1 -> System.out.println("Draw");
				case 2 -> System.out.println("Computer won!");
				case 3 -> System.out.println("User won!");
				
				}
				break;
			case 2:
				switch(computer) {
				case 1 -> System.out.println("User won!");
				case 2 -> System.out.println("Draw!");
				case 3 -> System.out.println("Computer won!");
				
				}
				break;
			case 3:
				switch(computer) {
				case 1 -> System.out.println("Computer won!");
				case 2 -> System.out.println("User won!");
				case 3 -> System.out.println("Draw!");
				
				}
				break;
			}
			
		}
		
		sc.close();
	}

}
