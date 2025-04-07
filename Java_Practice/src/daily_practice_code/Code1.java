package daily_practice_code;
import java.util.*;

// How to reverse the string in java?
public class Code1 {
	
	public void reverseString(String str) {
		
		String rString = null;
		
		int letterCount = str.length();
		
		System.out.println(letterCount);
		
		char[] arr = str.toCharArray();
		int start = 0;
		int end = str.length()-1;
		
		for(int i = end;i>=start;i--) {
			System.out.print(arr[i]);
		}
	}kanha

	

	public static void main(String args []) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string");
		
		String str = sc.nextLine();
		
		System.out.println("You have entered: " + str);
		
		Code1 obj = new Code1();
		
		obj.reverseString(str);
	}
}
