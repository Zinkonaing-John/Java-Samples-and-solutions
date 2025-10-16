package Chapter01;

class Box111{
	
	private int vol;
	
	public Box111(int w, int h, int d) {
		vol = w*h*d;
	}
	public String getVol() {
		return "Area : " + vol;
	}
}
public class Task07_objectarrray_And_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box111[] box = new Box111[10];
		
		for(int i=0; i<box.length; i++) {
			box[i] = new Box111(i*10, i*20, i*30);
		}
		
		for(Box111 b : box) {
			System.out.println(b.getVol());
		}
	}

}
