/*Bryant Rosser
 * CSCI 1302
 * M/W 3:35-4:50
 * February 17, 2015
 */
public abstract class Item
{

	//Attributes for titles of items
	private String itemName;
	
	//Attributes for the genre in which the item belongs
	private String typeName;
	private String genre;
	private RentalStatus rentalStatus;
	
	//Static variable that starts at 100 and increments by 5
	private static int stockID = 100;
	private int ItemID;

	public void setItemID()
	{
		ItemID = stockID;
		stockID+=5;
	}
	

	public Item(String item, String itemType, int length, String genreType, RentalStatus rentalStatus)
	{
		this.itemName = item;
		this.typeName = itemType;
		this.rentalStatus = rentalStatus;
		this.genre = genreType;
		setItemID();
	}
	
	public Item(String item, String itemType, String platform, String genreType, RentalStatus rentalStatus)
	{
		this.itemName = item;
		this.typeName = itemType;
		this.rentalStatus = rentalStatus;
		this.genre = genreType;
		setItemID();
	}
	
	
	public String toString()
	{
				
		String str = "Item ID: " + ItemID + "\nName: " + itemName + "\nType: " + 
						typeName + "\nGenre: " + genre + "\nCurrent Status: " + rentalStatus + "\n";
				
		return str;
		
	}
}
