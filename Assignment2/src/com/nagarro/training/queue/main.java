package com.nagarro.training.queue;

import java.util.InputMismatchException;
import java.util.Scanner;
//**Author HenaFatima*/

public class main {
	
public static void main(String[] args){
		
		Queue st = new Queue();
		Scanner sc=new Scanner(System.in); //// creating object for scanner class
		boolean status;
		while(true) {
			System.out.println("Enter you choices");

			System.out.print("\n1. Enqueue\n2. Dequeue\n3. Peek"
                    + "\n4. Contains\n5. Size\n6. Centre\n7. Sort\n8. Reverse"
                    + "\n9. Traverse\n10. Stop\n");
			
			int op=0;
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
			case 1:
				System.out.println("Enter the item:");
				int item = sc.nextInt();
				st.enqueue(item);
				break;
				
			case 2:
				st.dequeue();
				break;
				
			case 3:
				st.peek();
				break;
			
			case 4:
				System.out.println("enter items:");
				int items=sc.nextInt();
				st.contains(items);
				break;
				
			case 5:
				st.size();
				break;
			
			case 6:
				st.middle();
				break;
			
			case 7:
				st.sort();
				break;
			
			case 8:
				st.reverse();
				break;
			
			case 9:
				st.display();
				break;
			}
		}
		
	}
}