package abstraction;

interface Shape{
	
	int length = 10;
	int width = 20;
	
	default void square() {
		System.out.println("This is square");
	}
	
	static void rectangle() {
		System.out.println("This is rectangle");
	}
	
	void circle();
}
public class InterfaceDemo implements Shape{
	
	public static void main(String[] args) {
		
		InterfaceDemo check = new InterfaceDemo();
		check.square();
		check.circle();
		Shape.rectangle(); // Static method can directly access from interface
		
		check.triangle();
		
		Shape sh = new InterfaceDemo();
		sh.circle();
		sh.square();
		Shape.rectangle();
	}

	@Override
	public void circle() {
		
		System.out.println("This is cirlce");
	}
	
	void triangle() {
		System.out.println("This is traingle");
	}
	
	

}
