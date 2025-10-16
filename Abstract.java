package Chapter01;

//1. abstract is a half class so it can not create object itself but 하위 class extends will do .
//2. 
//3. use "extends " key word.

abstract class Shape{
	abstract void draw();
	abstract void computerArea(double a, double b);
	
}

class Rec2 extends Shape{

	@Override
	void draw() {
		System.out.println("drawing Rectangle");
		
	}

	@Override
	void computerArea(double a, double b) {
		System.out.println("Area of Rectangle : " +(a*b));
		
	}
	
}

class Triangle extends Shape{

	@Override
	void draw() {
		
		System.out.println("Draw triangle");
	}

	@Override
	void computerArea(double a, double b) {
		System.out.println("Area of triangle : "+ (a*b)/2);
		
	}
	
}


public class Abstract {

	public static void main(String[] args) {
		
		//Shape s = new Shape();
		
		Shape s = new Rec2();
		s.draw();
		s.computerArea(5.0, 10.0);
		
		s = new Triangle();
		s.draw();
		s.computerArea(5.0, 10.0);
		
	}

}
