package wrapper_class;

public class DataConversionMethod {

	public static void main(String[] args) {
		// String datatype to Primitive type

		// String --> int
		
		String s1 = "10";
		String s2 = "20";
		
		int x = Integer.parseInt(s1);
		int y = Integer.parseInt(s2);
		
		System.out.println(x+y);
		
		// String --> double
		
		String a1 = "10.20";
		String a2 = "20.50";
		
		System.out.println(Double.parseDouble(a1)+Double.parseDouble(a2));
		
		// String to bool
		
		String ans = "True";
		
		System.out.println(Boolean.parseBoolean(ans));
		
		
		// Primitive datatype to String type
		
		int a=10;
		double b=10.5;
		boolean check = true;
		char z = 's';
		
		String num = String.valueOf(a);
		System.out.println(num);
		
		String per = String.valueOf(b);
		System.out.println(per);
		
		String bool = String.valueOf(check);
		System.out.println(bool);
		
		String chara = String.valueOf(z);
		System.out.println(chara);
		
		
	}

}
