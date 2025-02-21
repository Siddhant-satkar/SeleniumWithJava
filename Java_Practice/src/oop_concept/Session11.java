package oop_concept;

public class Session11 {
	
	// no parameters and  No return value
	
	void m1(){
		System.out.println("HareKrishna");
	}
	
	// No Parameters AND return value
	
	int m2() {
		
		int age = 10;
		return age;
	}
	
	// Take parameters but no return value
	
	void  m3(int num) {
		
		System.out.println("my age is" + num);
	}
	
	// Take params and return value
	
	String m4(String name) {
		
		String processedName = name.concat("Satkar");
		return processedName;
	}
	
}
