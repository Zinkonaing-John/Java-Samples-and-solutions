package Chapter01;

class Ramyon{
	String ramyon="라면";
	String water = "물";
	String onion = "파";
	String topp = " ";
	
	public void boilWater() {
		System.out.println(water+"을 끓이다!");
	}

	
	public void cooking() {
		System.out.println(ramyon+ "과" +onion+"를 넣고 맛있게 드요.");
	}
	
	public void topping() {
		System.out.println(topp+"을 넣는다.");
	}
}

class RiceRamyon{

	String topp = "떡";
	
	Ramyon r = new Ramyon();
	
	public void topping() {
		System.out.println(topp+"을 넣는다.");
	}	
	
}

class CheeseRamyon {
	
	String toppp = "Cheese";
	
	Ramyon r = new Ramyon();
	
	public void topping() {
		System.out.println(toppp+ "을 던진다!");
	}
	
	
}
public class Heritage_Noddle{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ramyon r = new Ramyon();
		r.boilWater();
		r.cooking();
		
		System.out.println();
		
		RiceRamyon rr = new RiceRamyon();
		rr.r.boilWater();
		rr.topping();
		rr.r.cooking();
		System.out.println();
		
		CheeseRamyon ch = new CheeseRamyon();
		ch.r.boilWater();;
		ch.topping();
		ch.r.cooking();;


	}

}
