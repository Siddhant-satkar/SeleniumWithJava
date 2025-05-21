package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		
		//Declaration
		HashMap <Integer, String>hm = new HashMap<Integer, String>();
		
		// adding pairs
		
		hm.put(101, "John");
		hm.put(102, "Krishna");
		hm.put(103, "Kanha");
		hm.put(104, "Radha");
		hm.put(102, "Kanha");
		
		System.out.println(hm);
		
		//Size of hashmap
		System.out.println(hm.size());
		
		//Remove pair
		hm.remove(103);
		System.out.println(hm);
		
		
		//access value of the key
		System.out.println(hm.get(102));
		
		//get all the keys from hashMap
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		
		//reading data from hashMap
		
			//using for..each
		
		for(int k:hm.keySet()) {
			System.out.println(k + hm.get(k));
		}
		
			//using iterator
		
		Iterator<Entry<Integer, String>> it = hm.entrySet().iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//clear
		
		hm.clear();
		System.out.println(hm.isEmpty());
	}

}
