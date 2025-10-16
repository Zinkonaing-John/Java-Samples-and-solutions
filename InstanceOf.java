package Chapter01;

class Studentss{}
class GStudent extends Studentss{}
class UStudent extends GStudent{}
public class InstanceOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studentss st = new UStudent();
		System.out.println(st instanceof Studentss); //t
		System.out.println(st instanceof GStudent); //t
		System.out.println(st instanceof UStudent); //t
		st = new GStudent();
		System.out.println(st instanceof Studentss); //t
		System.out.println(st instanceof GStudent); //t
		System.out.println(st instanceof UStudent); //f
		st = new Studentss();
		System.out.println(st instanceof Studentss); //t
		System.out.println(st instanceof GStudent); //f
		System.out.println(st instanceof UStudent); //f
		GStudent us = new GStudent();
		System.out.println(us instanceof Studentss); //t
		System.out.println(us instanceof GStudent); //t
		System.out.println(us instanceof UStudent); //f

	}

}
