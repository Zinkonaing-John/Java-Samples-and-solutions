package Chapter01;


class Box101{
	int width;
	int height;
	int depth;
	
	double width1;
	double height1;
	double depth1;
	
	public Box101(int width) {
		this(1,1,1);
		this.width = width;
		height = 1;
		depth = 1;
		System.out.println("메개변수 1개인 생성자 메소드");
		int tmp1 = getArea();
		int tmp2 = getArea();
		System.out.println("input2 : "+getArea());
		
	}
	
	
	public Box101(double width) {
		this(1,1,1);
		this.width = width1;
		height = 1;
		depth = 1;
		System.out.println("메개변수 1개인 생성자 메소드");
		int tmp1 = getArea();
		int tmp2 = getArea();
		System.out.println("input2 : "+getArea());
		
	}
	
	public Box101(int width, int height) {
		this(1,1,1);
		this.width = width;
		this.height = height;
		depth = 1;
		System.out.println("메개변수 2개인 생성자 메소드");
		System.out.println("input2 : "+getArea());
		
	}

	public Box101(double width1, double height1) {
		this(1,1,1);
		this.width1 = width1;
		this.height1 = height1;
		depth = 1;
		System.out.println("메개변수 2개인 생성자 메소드");
		System.out.println("input2 : "+getArea());
		
	}
	public Box101(int width, int height, int depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
		System.out.println("메개변수 3개인 생성자 메소드");
		System.out.println("input2 : "+getArea());
	
	}
	
	public Box101(double width1, double height1, double depth1) {
		this.width1 = width1;
		this.height1 = height1;
		this.depth1 = depth1;
		System.out.println("메개변수 3개인 생성자 메소드");
		System.out.println("input2 : "+getArea());
	
	}
	private int getArea() {
		return width * height* depth;
	}
	
	private double getLoatArea() {
		return width * height* depth;
	}
	
}
public class Task05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box101 b = new Box101(10);
		Box101 b1 = new Box101(10,20);
		Box101 b2 = new Box101(10,20,30);
		
		Box101 b3 = new Box101(10.2,20,30);
		

	}

}
