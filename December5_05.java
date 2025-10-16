package Chapter01;

class AutoCar{
	String color;
	int account;
	
	public AutoCar(String color, int account){
		this.color=color;
		this.account=account;
		
	}

	public String getColor() {
		return color;
	}

	public int getAccount() {
		return account;
	}

	@Override
	public String toString() {
		 return "[색상] " + color +"\t"+ "[생상수랑] " + account;
		
	}
	
}
class Monata extends AutoCar{
	
	String series;
	String use;
	
	Monata(String color,int account, String series, String use){
		super(color,account);
		this.series=series;
		this.use=use;
		
	}
	
	@Override
    public String toString() {
        return super.toString() +"\t"+ "[용도]" + series +"\t"+ "\t[시리즈]" + use;
    }
	
}

public class December5_05 {

	public static void main(String[] args) {
		
	
		// TODO Auto-generated method stub
		Monata car1 = new Monata("흰색", 5000, "승용", "NF");
        Monata car2 = new Monata("은색", 7000, "업무", "Brilliant");
        Monata car3 = new Monata("김홈색", 4000, "택", "EF");
        Monata car4 = new Monata("검정색", 6000, "승용", "Hybird");
        
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);

	}

}
