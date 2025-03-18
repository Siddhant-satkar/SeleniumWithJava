package exceptions;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		
		System.out.println("Program is started");
		
		String s = null;
		
		try {
			System.out.println(s.length());
		}
		
		catch(ArithmeticException e) {
			System.out.println("Handle exception ..");
			System.out.println(e.getMessage());
		}
		
		catch(NullPointerException e) {
			System.out.println("Handle exception ..");
			System.out.println(e.getMessage());
		}
		
		catch(NumberFormatException e) {
			System.out.println("Handle exception ..");
			System.out.println(e.getMessage()); // This method gets the message from the exception
		}
		
		catch(Exception e) { // By using this you need to write the multiple catch blocks as Exception class is the parent class of all other exceptions
			System.out.println("Handle exception ..");
			System.out.println(e.getMessage()); 
		}
	}

}
