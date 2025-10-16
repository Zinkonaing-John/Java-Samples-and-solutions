package chapter02;

import java.util.StringTokenizer;

public class Sting_delimeters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Name Zinko Age 25 Gender male";
		String s2 = "Name,Zinko,Age,25,Gender,male";
		
		StringTokenizer s = new StringTokenizer(s2, ",");
		
		while(s.hasMoreTokens()) {
			String first = s.nextToken();
			String second = s.nextToken();
			System.out.println(first+ "\t" + second);
		}
		
	}

}
