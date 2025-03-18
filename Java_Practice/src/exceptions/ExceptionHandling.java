package exceptions;
import java.util.*;
public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program is started");
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the number");
		int num = sc.nextInt(); 
		
		try {
			System.out.println(100/num);
		}
		catch(ArithmeticException e){
			System.out.println("Invalid data..");
		}
		
		System.out.println("Program completed.");
	}

}
