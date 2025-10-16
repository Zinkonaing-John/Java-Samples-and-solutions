package Chapter01;

class BookShop{
	String bname;
	String author;
	int price;
	
	public BookShop(String bname, String author, int price){
		this.bname= bname;
		this.author=author;
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

public class ClassDiagram01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookShop ob = new BookShop("Web/Servlet","Dominice", 30000);
		System.out.println();
		
		
		System.out.println("책이름 : "+ob.getBname());
		System.out.println("저 자 : " +ob.getAuthor());
		System.out.println("가 격 : " +ob.getPrice());
		
		System.out.println("\n<<값 변경 후 출력>>");
		ob.setBname("안드로으 이렇레 시각하세");
		ob.setAuthor("Sue");
		ob.setPrice(30000);
		
		System.out.println();
		System.out.println("책이름 : " + ob.getBname());
		System.out.println("저 자 : " + ob.getAuthor());
		System.out.println("가 격 : " + ob.getPrice());
	}

}
