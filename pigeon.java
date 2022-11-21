package abstractclass;

public class pigeon extends bird {

	@Override
	public void fly() {
		System.out.println("i can fly");
	}

	@Override
	public void color() {
		System.out.println("i am grey");
		
		
	}
	
	public static void main(String[] args) {
		pigeon p = new pigeon();
		p.fly();
		p.color();
	}
	
}
