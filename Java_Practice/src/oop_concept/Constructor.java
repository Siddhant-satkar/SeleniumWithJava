package oop_concept;

public class Constructor {
	
	int x, y;
	
	Constructor(){ // Default Constructor
		
		x=100;
		y=200;
	}
	
	Constructor(int a, int b){ // Parameterized Constructor
	
		x=a;
		y=b;
	}
	
	void sum() {
		
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		
		Constructor con = new Constructor(10, 20);
		con.sum();
	}

}
