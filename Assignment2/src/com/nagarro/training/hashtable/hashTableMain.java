package com.nagarro.training.hashtable;
import java.util.Iterator;

//**Author HenaFatima*/


public class hashTableMain {
	
	public static void main(String[] args) {

		/*	here Custom hashMAp or Hash Table is imported 
		 * 
		 *  NOTE : We can create any type of HashTable just by passing their Data Type   
		 */		
			hashTable<String> hm = new hashTable<String>(10);
			
		/*
		 *	Here Insert Operation can be Done
		 */
			hm.insert(11, "Lucknow");
			hm.insert(12, "Delhi");
			hm.insert(13, "Mumbai");
			
		/*
		 *  Here Contains Operation can be Done. 
		 *  
		 *  Check is value is already present or not 
		*/
			System.out.println(hm.isContains("Lucknow"));
			
		/*
		 * 	Here Get value By key operation can be done.
		 * */
			
			System.out.println(hm.get(12));
		
		/*
		 * 	Here get Size of HashTable Operation can be done.
		 * 
		 * 	Means How many number of Items is Inserted in HashTable
		 * */
		
			System.out.println(hm.size_numberOfItems());
			
		/*
		 * 	Here Iterator Operation can be done.
		 * 
		 * */
			Iterator it = hm.getiterator();
			while(it.hasNext())
				System.out.println(it.next());
			
		/*
		 * 	Here Traverse/Print Operation can be done.
		 * */
			
			hm.Print();
			
			
			
		}


}
