package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		// Declaration 
		
		//Type 1
		ArrayList mylist = new ArrayList();
		
		//Type 2
		//List muList = new ArrayList();
		
		// If you want to save the same (Homogenious type of the data)
		//ArrayList <Integer> mylist = new ArrayList<Integer>();
		
		// This Employee class can hold many emp objects
		//ArrayList <Employee> mylist = new ArrayList<Employee>();

		
		// Adding data into array list
		
		mylist.add(100.5);
		mylist.add(100);
		mylist.add(true);
		mylist.add(true);
		mylist.add(null);
		mylist.add("Welcome");
		
		// If you want to find an length of arrayList
		
		System.out.println(mylist.size());
		
		// Printing an arraylist
		System.out.println(mylist);
		
		// Remove items from arraylist
		mylist.remove(3);
		System.out.println(mylist);
		
		// insert element in the arrayList
		mylist.add(2, false);
		System.out.println(mylist);
		
		//Modify element
		mylist.set(2,"Java");
		System.out.println(mylist);
		
		// Access specific element from arraylist
		System.out.println(mylist.get(3));
		
		//Reading all the elements from arraylist
		
			//Normal for loop
		for(int i=0;i<mylist.size();i++) {
			
			System.out.println(mylist.get(i));
		}
		
			// Using iterator - Specifically created for the collection
		Iterator it = mylist.iterator(); //Prefer using while loop // Need to import from util
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// Checking arraylist is empty or not
		System.out.println(mylist.isEmpty());
		
		// Remove all the elements from the array list (Group of specific elements)
		ArrayList mylist2 = new ArrayList();
		
		mylist2.add("100");
		mylist2.add("Welcome");
		mylist.removeAll(mylist2);
		
		System.out.println(mylist);
		
		//Remove all the elements/clear
		mylist.clear();
		System.out.println(mylist.isEmpty());
		
	}

}
