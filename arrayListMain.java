package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayListMain {
	private static Scanner scanner = new Scanner(System.in);
	private static arrayList GroceryList = new arrayList();

	public static void main(String[] args) {
		
		boolean quit = false;
		int choice = 0;
		printInstructions();
		
		while(true) {
			System.out.println("Enter your choice");
			choice = scanner.nextInt();
			scanner.nextLine();
			
			switch(choice) {
			case 0:
				printInstructions();
				break;
			case 1:
				GroceryList.printGroceryList();
				break;
			case 2:
				addItem();
				break;
			case 3:
				modifyItem();
				break;
			case 4:
				removeItem();
				break;
			case 5:
				searchItem();
				break;
			case 6:
				processArrayList();
			case 7:
				quit=true;
				break;
			
			}
			
		}

	}
	
	public static void printInstructions() {
		System.out.println("Press");
		System.out.println("0 to print choice option.");
		System.out.println("1 - to print list of itrms.");
		System.out.println("2 - to add items to list.");
		System.out.println("3 - to modify item in the list.");
		System.out.println("4 - to remove an item from the list.");
		System.out.println("5 - to search an item from the list.");
		System.out.println("6 - to quit the application.");
				
	}
	
	public static void addItem() {
		System.out.println("Enter the Item.");
		GroceryList.addGroceryItem(scanner.nextLine());
	}
	
	public static void modifyItem() {
		System.out.println("Enter the Item.");
		String oldItem =scanner.nextLine();
		
		System.out.println("Enter the replacement Item.");
		String nwItem = scanner.nextLine();
		GroceryList.modifyGroceryItem(oldItem, nwItem);
	}
	
	public static void removeItem() {
		System.out.println("Enter the Item.");
		String item =scanner.nextLine();
		
		GroceryList.removeGroceryItem(item);
	}
	
	public static void searchItem() {
		System.out.println("Enter Item to search for .");
		String searchItem = scanner.nextLine();
		if(GroceryList.findItem(searchItem) >= 0) {
			System.out.println(searchItem +" found in grocery List.");
		}else {
			System.out.println(searchItem +" wasn't find in list.");
		}
		
	}
	
	public static void processArrayList() {
		ArrayList<String> newArray = new ArrayList<String>();
		newArray.addAll(GroceryList.getGroceryList());
		
		//other way to copy to a new array the content of old array
		
		ArrayList<String> nextArray = new ArrayList<String>(GroceryList.getGroceryList());
		
		
		//how to move the content of ArrayList to regular array
		String[] myArray = new String[GroceryList.getGroceryList().size()];
		myArray = GroceryList.getGroceryList().toArray(myArray);
	}

}
