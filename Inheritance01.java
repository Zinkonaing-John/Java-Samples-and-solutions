package chapter02;

class BookShop{
	String bname;
	String author;
	int price;
	
	public BookShop(String bname, String author, int price) {
		this.bname = bname;
		this.author = author;
		this.price = price;
				
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}

public class Inheritance01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookShop ob = new BookShop("알기 쉽레 해설한 JAVA","김총" , 25000);
		
		System.out.println();
		System.out.println("책 이름 : "+ ob.getBname());
		System.out.println("저  자  : "+ ob.getAuthor());
		System.out.println("가  격  : "+ ob.getPrice());
		System.out.println();
		
		System.out.println("##<<값 변경 후 출력>>##");
		ob.setBname("알기 어렵은 JAVA");
		ob.setAuthor("김동현");
		ob.setPrice(30000);
		
		
		System.out.println("책 이름 : "+ ob.getBname());
		System.out.println("저  자  : "+ ob.getAuthor());
		System.out.println("가  격  : "+ ob.getPrice());

	}

}
