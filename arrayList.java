package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {

	private ArrayList<String> groceryList = new ArrayList<String>();
	
	
	
	public ArrayList<String> getGroceryList(){
		return groceryList;
	}
	

	public void addGroceryItem(String item) {
		groceryList.add(item);
	}

	public void printGroceryList() {
		System.out.println("You have " + groceryList.size() + " in your grocery list.");
		for (int i = 0; i < groceryList.size(); i++) {
			System.out.println(i + 1 + " . " + groceryList.get(i));
		}

	}

	public void modifyGroceryItem(String oldItem, String newItem) {

		int position = groceryList.indexOf(oldItem);
		if (position >= 0)
			groceryList.set(position, newItem);
		System.out.println("Grocery Item " + (position + 1) + " has been modified");
	}

	public void removeGroceryItem(String theItem) {
		// String theItem = groceryList.get(position);
		int position = groceryList.indexOf(theItem);
		groceryList.remove(position);
	}

	public int findItem(String searchItem) {

		return groceryList.indexOf(searchItem);
	}
	
	

}
