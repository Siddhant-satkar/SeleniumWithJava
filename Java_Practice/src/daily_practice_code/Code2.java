package daily_practice_code;
// Swapping numbers without using a third variable
public class Code2 {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		
		a = a+b;
		b = a - b;
		a = a - b;
		
		System.out.println(a);
		System.out.println(b);
	}

}
