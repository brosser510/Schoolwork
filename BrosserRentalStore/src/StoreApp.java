/*Bryant Rosser
 * CSCI 1302
 * M/W 3:35-4:50
 * February 17, 2015
 */

import java.util.Scanner;


public class StoreApp 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		/* Creates an instance of the Store class with the necessary input from the user
           Invokes the addItem method from the Store class
		 */
		
		System.out.println("Rosser Inventory System \nVersion 0.2b\n\n ");
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is the name of the store?");
		String storeName = kb.nextLine();
		
		System.out.println("\nWhat is the phone number of the store?");
		String storePhone = kb.nextLine();
		
		Store xStore = new Store(storeName, storePhone);
		xStore.addItem();
		//xStore.addVideoGame();
		System.out.println();
		
		System.out.println(xStore);
		
		kb.close();
	}

}
