package Chapter01;

class Sport{
	
	String getName() {
		return "이직 결정되지 읺음";
		
	}
	
	int getPlayers() {
		return 0;
	}
}

class Soccer extends Sport{

	@Override
	String getName() {
		// TODO Auto-generated method stub
		return "축구";
	}

	@Override
	int getPlayers() {
		// TODO Auto-generated method stub
		return 11;
	}
	
	
}

public class Week14_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Soccer s = new Soccer();
	System.out.println("경기이    :"+s.getName());
	System.out.println("경기자수	:"+ s.getPlayers());
	
	}

}
