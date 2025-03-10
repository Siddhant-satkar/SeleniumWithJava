package encpsulation;

public class Animal {

	void color() {
		System.out.println("Red");
	}
	
	void eat() {
		System.out.println("Animal is eating");
	}
}

class Dog extends Animal {
	
	void color() {
		System.out.println("Black");
	}
	
	void eat() {
		System.out.println("dog is eating");
		super.eat();
	}
}
