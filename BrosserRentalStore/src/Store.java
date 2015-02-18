/*Bryant Rosser
 * CSCI 1302
 * M/W 3:35-4:50
 * February 17, 2015
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Store 
{
    //An attribute for the name of the store
	private String storeName; 
	//An attribute for the store’s phone number
	private String storePhone;
	//A collection to store items (see below)
	private ArrayList<Item> itemList = new ArrayList<Item>();
	
	public Store (String storeName, String storePhone)
	{
		this.storeName = storeName;
		this.storePhone = storePhone;
	}
	
	
    //Method for adding a new movie
	 
	public void addItem()
	{
		Scanner kb = new Scanner(System.in);
				
		RentalStatus rentalStatus;
				
		System.out.print("\n\nHow many items would you like to add?\n");
		int numItems = kb.nextInt();
		kb.nextLine();
		
		for(int iN = 0; iN < numItems; iN++)
		{
			System.out.print("\nWhat is the name of item #" + (iN + 1) + "\n");
			String item = kb.nextLine();
			
			
			System.out.print("\nWhat type of product is " + item + "? (Video Game or Movie)\n");
			String itemType = kb.nextLine();
			
			
			System.out.print("\nWhat genre is " + item + "? \n");
			String genreType = kb.nextLine();
							
			System.out.print("\nWhat is " + item + "'s stock status?\n1. In Stock\n2. Rented\n3. On Order\n");
			int status = kb.nextInt();
			
			
			if (status == 1)
			{
				rentalStatus = RentalStatus.IN_STOCK;
			}
			else if (status == 2)
			{
				rentalStatus = RentalStatus.RENTED;
			}
			else 
				rentalStatus = RentalStatus.ON_ORDER;
						
			if (itemType.equals("Movie")
					||itemType.equals("movie"))
			{
				System.out.println("\nHow long is the movie? (In minutes)");
				int movieLength = kb.nextInt();
				kb.nextLine();
				
				Item knownItem = new Movie(item, itemType, movieLength, genreType, rentalStatus);
				itemList.add(knownItem);
			}
			
			if (itemType.equals("Video Game")
					||itemType.equals("Video game")
					||itemType.equals("video game"))
			{
				kb.nextLine(); //consume line, program skips platform input without
				
				while(true) //platform validation loop
				{
				System.out.println("\nWhat platform is this game for?");
				String platform = kb.nextLine();
				
					if(platform.equals("Xbox 360")
							||platform.equals("Xbox One")
							||platform.equals("Playstation 3")
							||platform.equals("Playstation 4")
							||platform.equals("PC"))
					{
				
					Item knownItem = new VideoGame(item, itemType, platform, genreType, rentalStatus);
					itemList.add(knownItem);
					break;
					}
					
					else
					{
						System.out.println("\nPlease enter a valid platform \n(Xbox 360, Xbox One, Playstation 3"
								+ ", Playstation 4, PC)");
					}
				}
				
			}
			
		}
		kb.close();
			
	}
	
	public String toString()
	{
		String str = storeName + "\n" + storePhone + "\n\n";
		
		for(Item i : itemList){
			str += i + "\n";
		}
		
		return str;
		
	}
}
