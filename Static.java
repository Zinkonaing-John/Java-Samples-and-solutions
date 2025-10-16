package Exam;

class Static1{
	public int a = 20;
	private int b = 5;
	static int c;
	
}
public class Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		Static1.c = a;
		Static1 st = new Static1();
		System.out.println((Static1.c)++);
		System.out.println(st.c);
		System.out.println(a);
		System.out.println(st.a);
		
		
		
	}

}
