package oop_concept;

public class SessionMain {

	public static void main(String[] args) {
		
		Session11 ss = new Session11();
		ss.m1();
		
		int myAge = ss.m2();
		System.out.print(myAge);

		ss.m3(22);
		
		String checkname = ss.m4("Siddhant");
		System.out.println(checkname);
	}

}
