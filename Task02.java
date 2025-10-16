package Chapter01;
class Box33{
	
	private int width;
	private int height;
	private int depth;
	private int boxID;
	private static int id;
	
	 int MAX = 10;
	
	public Box33() {
		System.out.println("자동 생성자 호출!");
		boxID = ++id;
	}
	
	public Box33(int width, int height, int depth) {
		System.out.println("메개변수를 가진 생성자 호출!");
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	public int getVol() {
		return width*height*depth;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public int getBoxID() {
		return boxID;
	}

	public void setBoxID(int boxID) {
		this.boxID = boxID;
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Box33.id = id;
	}
	
}


public class Task02 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Box33 mybox1 = new Box33(2,2,2);
//		
		
		
//		System.out.println(mybox1.getWidth()+", "+mybox1.getHeight()+", "+mybox1.getDepth());
//		System.out.println("mybox1 부피 : "+mybox1.getVol());
		Box33 mybox[] = new Box33[10];
		int k =0;
		
		for(int i=0; i<mybox.length; i++) {
			mybox[i] = new Box33(k,k,k);
			k++;
			
			System.out.println("mybox ["+i+"]의 부피 : "+ mybox[i].getVol());
			
		}
		
		
		
		
		System.out.println("최대 만들 수 있는 벅스 개수 : " + mybox[0].MAX);
		
		
		
//		for(int i=0; i<mybox.length; i++) {
//			
//			
//			System.out.println("mybox ["+i+"]의 부피 : "+ mybox[i].getVol());
//		}
		
//		System.out.println(":mybox1의 번호 : "+ mybox1.getBoxID());
//		
//		Box33 mybox2 = new Box33();
//		System.out.println(":mybox1의 번호 : "+ mybox2.getBoxID());
//		
//		Box33 mybox3 = new Box33();
//		System.out.println(":mybox1의 번호 : "+ mybox3.getBoxID());
//		
//		Box33 mybox4 = new Box33();
//		System.out.println(":mybox1의 번호 : "+ mybox4.getBoxID());
//		
//		System.out.println("the number is : "+ Box33.getId());
		
	}

}
