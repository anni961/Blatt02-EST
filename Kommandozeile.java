package est;

import java.util.Scanner;

public class Kommandozeile {
	public static void main(String[] args) {
		 scanForInput();
	}
	/**
	 * Scans and verifies user input
	 * 
	 */
	private static void scanForInput() {
		String userInput= "";
		boolean userInputOK = false;
		
		
		while(!userInputOK) {
		userInput = getUserInput();
		
	    try {
	       Integer.parseInt(userInput);
	       if(Integer.parseInt(userInput) <15 && Integer.parseInt(userInput) > 0) {
	    	   userInputOK = true;
	       }else {
	    	   System.out.println("Wrong input, please insert number from 1-14");	
	       }
	    } catch (NumberFormatException nfe) {
	        System.out.println("Wrong input, please insert number from 1-14");	
	  
	    }
		}
	    
	    
	    switch(Integer.parseInt(userInput)){
	        case 1:
	            System.out.println("Action executed succesfully!");
	            break;
	        case 2:
	            System.out.println("Action executed succesfully!");
	            break;
	        case 3:
	        	System.out.println("Action executed succesfully!");
	            break;
	        case 4:
	            System.out.println("Action executed succesfully!");
	            
	            break;
	        case 5:
	            System.out.println("Please insert the customer ID:");
	            readClientID();
	            System.out.println("Please insert the book ID:");
	            readBookID();
	            System.out.println("Book borrowed succesfully!");
	            break;
	        case 6:
	            System.out.println("Action executed succesfully!");
	            break;
	        case 7:
	            System.out.println("Action executed succesfully!");
	            break;
	        case 8:
	            System.out.println("Action executed succesfully!");
	            break;
	        case 9:
	            System.out.println("Action executed succesfully!");
	            break;
	        case 10:
	            System.out.println("Action executed succesfully!");
	            break;
	        case 11:
	            System.out.println("Action executed succesfully!");
	            break;
	        case 12:
	            System.out.println("Action executed succesfully!");
	            break;
	        case 13:
	            System.out.println("Action executed succesfully!");
	            break;
	        case 14:
	            System.out.println("Action executed succesfully!");
	            break;
	        

	    }
	}
	
	/**
	 * Reads Client ID
	 * 
	 */
	private static void readClientID() {
		Scanner scanner = new Scanner(System.in);
		String clientID = scanner.nextLine();
	}
	/**
	 * Reads Book ID
	 */
	private static void readBookID() {
		Scanner scanner = new Scanner(System.in);
		String bookID = scanner.nextLine();
	}

	/**
	 * Prints menu and returns user input
	 * 
	 * @return
	 */
	private static String getUserInput() {
		Scanner scanner = new Scanner(System.in);


		showFunctions();
	    
	    
	    System.out.println("");
	    System.out.println("Please choose action:");
	    String userInput = scanner.nextLine();
		return userInput;
	}

	/**
	 * Shows the menu
	 */
	private static void showFunctions() {
		System.out.println("1. Import CSV File with books ");
		System.out.println("2. Import CSV File with customers");
		System.out.println("3. Import CSV File with book copies");
		System.out.println("4. Search book copy");
		System.out.println("5. Borrow book copy");
		System.out.println("6. Return book copy");
		System.out.println("7. Delete customer");
	    System.out.println("8. Delete book");
	    System.out.println("9. Delete book copy");
	    System.out.println("10. Print all customers");
	    System.out.println("11. Print all books");
	    System.out.println("12. Print all not borrowed book copies");
	    System.out.println("13. Print all borrowed book copies");
	    System.out.println("14. Print all borrowed book copies of customer");
	}
}
