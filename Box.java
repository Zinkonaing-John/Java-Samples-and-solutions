package chapter02;

class Box{
	//속섣(멤바변)
	int width;
	int height;
	int depth;
	
	//기능(메소드)
	public Box(int width, int height, int depth) {
	this.width = width;
	this.height=height;
	this.depth=depth;	
	}
	
	public int getArea() {
		return width*height;
	}

	public void calVolume() {
		System.out.println("백스 부피 : "+ (width*height*depth));
	}
	
}
	


public class Box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b1 = new Box(10,20,30);
		System.out.println("벅스 면적 : "+b1.getArea());
		b1.calVolume();
	}

}
