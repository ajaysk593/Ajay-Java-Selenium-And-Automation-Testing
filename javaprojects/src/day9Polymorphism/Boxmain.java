package day9Polymorphism;

public class Boxmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("unused")
		Box b=new Box();
		@SuppressWarnings("unused")
		Box b1=new Box(10.5,15.5,5.0);
		
		Box b11=new Box(10.5);
		System.out.println(b11.volume());
		
		
	}

}
