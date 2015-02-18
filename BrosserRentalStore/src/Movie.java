/*Bryant Rosser
 * CSCI 1302
 * M/W 3:35-4:50
 * February 17, 2015
 */

public class Movie extends Item 
{


	private int movieLength;
	
	public Movie(String item, String itemType, int movieLength, String genreType, RentalStatus rentalStatus) 
	{
		super(item, itemType, movieLength, genreType, rentalStatus);
		
		this.movieLength = movieLength;
	}
		
	@Override
	public String toString() {
					
		return super.toString() + "Length: " + movieLength + " minutes\n";
			
	}

}
