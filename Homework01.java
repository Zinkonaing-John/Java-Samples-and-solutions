package Chapter01;

class PlaneFigure{
	double base = 5.0;
	double height = 3.5;
	
	public double getArea(){
		return (base*height)/2;
		
	}
	
	public double getHypotenuse() {
		return Math.sqrt(base*base+height*height);
	}
	
	public double getPerimeter() {
		return base+height+Math.sqrt(base*base+height*height);
	}
}
public class Homework01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PlaneFigure cc = new PlaneFigure();
		
		System.out.println("삼각형의 넓이  : " +cc.getArea());
		System.out.println("삼각형의 빗변길이 : "+cc.getHypotenuse());
		System.out.println("삼각형의 돌각형의 둘레길이 : "+cc.getPerimeter());
		
	}

}
