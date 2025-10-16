package Exam;

class PlaneFigure{
	double base = 5.0;
	double height = 3.5;
	
	public double getArea(){
		return (base*height)/2;
	}
	
	public double Hypo() {
		return Math.sqrt(base*base+height*height);
	}
	
	public double Parame() {
		return base+height+Hypo();
	}
}
public class GetSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PlaneFigure p = new PlaneFigure();
		
		System.out.println("Area : "+p.getArea());
		System.out.println("Hypo : "+p.Hypo());
		System.out.println("Parame : "+p.Parame());
		
	}

}
