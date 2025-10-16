package Chapter01;

class Noodle{
	String brand;
	String name;
	String egg;
	String onion;
	String water;
	
	public Noodle(String brand, String name){
		this.brand = brand;
		this.name = name;
		egg = "egg";
		onion = "onion";
		water = "1Liter";
	}

	public String cooking() {
		
		
		return "add water "+water+ " and wait"
				+ " until it boils then " 
		+ name + brand + "is placed into "
				+ "cooking pot and cook for 3mins."
				+ ""+" When it boils put "+ egg +" "+ 
				onion +"cook 1 more mins and eat it"; 
	}
	
 
}

class RiceNoodle extends Noodle{

	public RiceNoodle(String brand, String name) {
		super(brand, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String cooking() {
		// TODO Auto-generated method stub
		return "add ricesticks "+ brand + name;
	}
	
}
public class Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Noodle pot = new Noodle("Yan Yan", "Noodle");
		RiceNoodle pot2 = new RiceNoodle("Mar Mar", " Noodle");
		
		System.out.println(pot.cooking());
		System.out.println(pot2.cooking());
	}

}
