package Chapter01;


class Box100{
	int width;
	int height;
	int depth;
	static Box100 b;
	
	private Box100() {
		
	}
	
	public static Box100 getInstance() {
		if(b == null) {
			b = new Box100();
		}
		return b;
	}
	
	
}



public class Task04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box100 box = Box100.getInstance();
		
		

	}

}
