package Chapter01;

class Ct{
	public Ct() {
		System.out.println( "매개변수 없음" ); }
	public Ct(int a) {
		System.out.println( "매개변수 int a" ); }
	public Ct(double a) {
		System.out.println( "매개변수 double a" ); }
	public Ct(int a, double b) {
		System.out.println( "매개변수 int a, double b" ); 
		}
}
public class HW03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ct cto = new Ct( );
		cto = new Ct( 4 );
		cto = new Ct( 4, 4.15 );
		cto = new Ct( 6.0 );
		cto = new Ct( 3, 7 );
	}

}

//다음 프로그램의 출력 결과는

/*매개변수 없음
매개변수 int a
매개변수 int a, double b
매개변수 double a
매개변수 int a, double b*/