import javax.swing.JOptionPane;
public class Verify
{
	public static void main(String[] args)
	{
		
	

	boolean valid = false;
	String password;
	int numDigits = 0;
	int numLetters = 0;
	int numUpper = 0;
	
	password = JOptionPane.showInputDialog("What is your password?");
	
	if(password.length() >= 7)
		for(int count = 0; count < password.length(); count++)
		{
			if(Character.isDigit(password.charAt(count)))
			{
				numDigits++;
			}
			else if(Character.isLetter(password.charAt(count)))
			{
				numLetters++;
			
				if(Character.isUpperCase(password.charAt(count)))
				{
					numUpper++;
				}
			}
		}
		if(numDigits == 3 && numLetters == 4 && numUpper >= 1)
		{
			valid = true;
		}
		
		if(valid)
			JOptionPane.showMessageDialog(null, "Your password is valid");
		else
			JOptionPane.showMessageDialog(null, "Your password is invalid");
	}
}
