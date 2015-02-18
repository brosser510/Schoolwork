/*Bryant Rosser
 * CSCI 1302
 * M/W 3:35-4:50
 * February 17, 2015
 */

public class VideoGame extends Item
{

	private String platform;
	
	public VideoGame(String item, String itemType, String platform, String genreType, RentalStatus rentalStatus) 
	{
		super(item, itemType, platform, genreType, rentalStatus);
		
		this.platform = platform;
	}

	@Override
	public String toString() 
	{
	
		return super.toString() + "Platform: " + platform + "\n";
	}

}
