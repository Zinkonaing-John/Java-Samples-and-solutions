package Chapter01;

class Overload{
	
	public void calc() {
		System.out.println("메게변수 없음");
	}
	
	public void calc(int w) {
		System.out.println("메게변수 없음 :"+ w*w);
	}
	
	public void calc(int w, int h) {
		System.out.println("메게변수 없음 :"+ w*h);
	}
	
	public void calc(int w, int h, int d) {
		System.out.println("메게변수 없음 :"+ w*h*d);
	}
}
public class Task08_Method_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overload o = new Overload();
		
		int input[] =new int[args.length];
		
		for(int i=0; i<args.length; i++) {
			input[i] = Integer.parseInt(args[i]);
		}
		
		switch(args.length) {
		case 0:
			o.calc();
			break;
		case 1:
			o.calc(input[0]);
			break;
		case 2:
			o.calc(input[0], input[1]);
			break;
		case 3 :
			o.calc(input[0], input[1], input[2]);
			break;
		default:
			System.out.println("인수가 너무 많습니다.");
		}
	}

}
