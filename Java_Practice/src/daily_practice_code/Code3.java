package daily_practice_code;
import java.util.*;
public class Code3 {

	boolean checkVovels(String str) {
		str = str.toLowerCase();
		
		for(int i=0;i<str.length();i++) {
			
			char ch = str.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				return true;
			}
			
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();
		
		Code3 obj = new Code3();
		
		if(obj.checkVovels(str)) {
			System.out.println("Given String contains the Vovels");
		}else {
			System.out.println("Given String does not contains the Vovels");
		}
		
		
	}

}
