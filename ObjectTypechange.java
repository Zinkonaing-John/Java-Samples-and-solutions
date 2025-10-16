package Chapter01;

class Rec{
	
	public int width;
	public int height;
	
	public Rec(int w, int h) {
		width = w;
		height = h;
		
	}
	
	public int computeRecArea() {
		return width*height;
	}
	
	public void callme() {
		System.out.println("Rec의 callme() 메소드");
	}
}

class Cube extends Rec{
	
	public int depth;

	public Cube(int w, int h, int d) {
		super(w, h);
		depth = d;
		
	}
	
	public int computerCubeArea() {
		return super.computeRecArea()*depth;
	}

	@Override
	public void callme() {
		System.out.println("Cube의 callme()");
	}
	
	
	
}

public class ObjectTypechange {

	public static void main(String[] args) {
		
		Rec obj = new Cube(10,20,30);
		System.out.println(obj.computeRecArea());
		
		obj.callme();
		
		boolean result;
		
		result = (obj instanceof Cube)? true:false;
		System.out.println(result);
		
		Cube c = new Cube(10,20,30);
		result = (c instanceof Rec)? true:false;
		System.out.println(result);
		
		Rec r = new Rec(10,20);
		result = (r instanceof Object)? true:false;
		System.out.println(result);
		
		

	}

}
