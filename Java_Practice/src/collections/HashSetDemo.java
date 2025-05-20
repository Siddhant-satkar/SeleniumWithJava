package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		// Declaration
		
		HashSet myset = new HashSet();
		
		//Set myset = new HashSet();
		
		//HashSet <String> myset = new HashSet<String>(); // If you want only the homogenious data 
		
		// Adding elements in hashset
		
		myset.add(100);
		myset.add(100.5);
		myset.add(100);
		myset.add(true);
		myset.add(true);
		myset.add(null);
		myset.add("Welcome");
		
		//printing hashset
		System.out.println(myset); // Automatically remove the duplicates // insertion order is not maintained
		
		
		//removing element
		myset.remove("Welcome");
		System.out.println(myset);
		
		//Inserting element - Not possible
		
		//Access specific element - not element
		
		//Convert HashSet into ArrayList
		ArrayList mylist = new ArrayList(myset);
		System.out.println(mylist);
		System.out.println(mylist.get(2));
		
		//read all the elements using looping statement -- Normal for loop is not possible -- for..each loop can be used
		for(Object x:myset) {
			System.out.println(x);
		}
		
		// using iterator
		Iterator it = myset.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//clearing all elements from set
		
		myset.clear();
		System.out.println(myset);
		System.out.println(myset.isEmpty());
		
		System.out.println(myset.size());
	}

}
