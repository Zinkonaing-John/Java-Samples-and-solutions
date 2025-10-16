package Chapter01;

class Rectangle{
	int width, height;
	
	public Rectangle(int width, int height) {
		
		this.width=width;
		this.height=height;
		
	}
}

class ColorRectangle extends Rectangle{
	
	String color1;
	
	public ColorRectangle(int width, int height, String color1) {
		super(width, height);
		this.color1=color1;
		
	}

	
	
	
}
public class Week14_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorRectangle obj = new ColorRectangle(100,100, "blue");
		
		System.out.println("가로: "+ obj.width);
		System.out.println("세로: "+ obj.height);
		System.out.println("색상: "+ obj.color1);
	}

}
