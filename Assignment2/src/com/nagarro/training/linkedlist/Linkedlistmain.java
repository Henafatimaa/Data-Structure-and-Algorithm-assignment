package com.nagarro.training.linkedlist;

import java.util.InputMismatchException;
import java.util.Scanner;
//Author HenaFatima
public class Linkedlistmain {
	Scanner sc = new Scanner(System.in); // creating object for scanner class

	public void functions() {
		linkedlist opr = new linkedlist();

		while (true) {

			System.out.println("\n Linked List \n");

			System.out.print("\n1. Insert\n2. Insert At Position\n3. Delete"
					+ "\n4. Delete At Position\n5. Center\n6. Sort\n7. Reverse\n8. Size"
					+ "\n9. Iterator\n10. Traverse\n");

			System.out.print("Enter Your Option: ");

			int c = handleIntInput();

			switch (c) {

			case 1:
				System.out.print("Enter The Element: ");
				int elm = handleIntInput();
				opr.insert(elm);
				break;

			case 2:
				System.out.print("Enter The Element: ");
				elm = handleIntInput();
				System.out.print("Enter The Position: ");
				int p = handleIntInput();
				opr.insertAtPosition(elm, p);
				break;

			case 3:
				System.out.print("Enter The Element: ");
				elm = handleIntInput();
				opr.delete(elm);
				break;

			case 4:
				System.out.print("Enter The Position: ");
				p = handleIntInput();
				opr.deleteAtPosition(p);
				break;

			case 5:
				System.out.println("Center Element: " + opr.center());
				break;

			case 6:
				opr.sort();
				break;

			case 7:
				opr.reverse();
				break;

			case 8:
				System.out.println("Size Of Linked List: " + opr.size());
				break;

			case 9:
				iterator it = new iterator(opr.head);
				while (it.hasNext()) {
					System.out.print(it.next() + " ");
				}
				break;

			case 10:
				System.out.print("Linked List: ");
				opr.traverse();
				break;

			default:
				System.out.println("\nInvalid Input.\n");
				break;
			}

			System.out.print("\nDo You Want To Continue? (y/n): ");
			String option = sc.nextLine().toLowerCase();

			if (option.equals("n")) {
				break;
			}
		}
	}

	// Method to handle Integer inputs from scanner class
	private int handleIntInput() {
		try {
			int val = sc.nextInt();
			sc.nextLine();

			return val;
		} catch (NumberFormatException nfe) {
			System.out.println("\nInput Type Can Only Be Integer.\n");
		} catch (InputMismatchException ime) {
			System.out.println("\nInput Type Can Only Be Integer.\n");
		} catch (Exception e) {
			System.out.println("\nSome Error Occurred.\n");
		}

		sc.nextLine();
		return handleIntInput();
	}

}
