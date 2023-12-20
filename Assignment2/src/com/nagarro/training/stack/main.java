package com.nagarro.training.stack;

import java.util.Scanner;
import java.util.InputMismatchException;
/**Author HenaFatima*/
public class main {
	
public static void main(String[] args){
		
		Stack st = new Stack();
		Scanner sc=new Scanner(System.in); // creating object for scanner class
		boolean status;
		while(true) {
			System.out.println("Enter you choices");

			System.out.print("\n1. Push\n2. Pop\n3. Peek"
                    + "\n4. Contains\n5. Size\n6. Centre\n7. Sort\n8. Reverse"
                    + "\n9. Traverse\n10. Stop\n");
			
			int op=0;
			// Checking the exception
			try
		    {
		        op = sc.nextInt();
		        sc.nextLine();
		    }
		    catch (InputMismatchException e)
		    {
		        System.out.println("Input Type can be Only integer.\n");
		        break;
		    }
		   
			
			if(op==10){
				status=false;
				break;
			}
			switch(op) {
			//inserting element
			case 1:
				System.out.println("Enter the item:");
				int item = sc.nextInt();
				st.push(item);
				break;
				
			case 2:
				//Deleting the element
				st.pop();
				break;
				
			case 3:
				//peek value
				st.peek();
				break;
			
			case 4:
				//for checking contains
				System.out.println("enter items:");
				int items=sc.nextInt();
				st.contains(items);
				break;
				
			case 5:
				//knowing the size of
				st.size();
				break;
			
			case 6:
				//for middle element
				st.middle();
				break;
			
			case 7:
				//for sorting
				st.sort();
				break;
			
			case 8:
				//for knowing the reverse value
				st.reverse();
				break;
			
			case 9:
				//displaying
				st.display();
				break;
			}
		}
		
	}
}

		
	
