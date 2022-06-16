package SimpleProjects;

import javax.swing.JOptionPane; // dialog box

public class Number_Guessing_Game 
{

	public static void main(String[] args) 
	{
		int computerNumber = (int) Math.random()*100 +1;
		int userAnswer = 0;
		System.out.println("the correct guess would be " + computerNumber);
		int count = 1;
		
		while (userAnswer != computerNumber)
		{
			String response = JOptionPane.showInputDialog //showInputDialog prompts user for input
					(null,"Enter a guess between 1 and 100", "Guessing Game", 3);
			userAnswer = Integer.parseInt(response);
			JOptionPane.showMessageDialog(null, "" + determineGuess(userAnswer, computerNumber, count));
			count++;
			//showMessageDialog means to show dialog box with message to user
		}

	}
	
	public static String determineGuess (int userAnswer, int computerNumber, int count)
	{
		if (userAnswer <=0 || userAnswer >100)
		{
			return "Your guess is invaid";
		}
		else if (userAnswer == computerNumber)
		{
			return "Correct!\nTotalGuesses: " + count;
		}
		else if (userAnswer > computerNumber)
		{
			return "Your guess is too high, try again\nTry number: " + count;
		}
		else if (userAnswer < computerNumber)
		{
			return "Your guess is too low, try again\nTry number: " + count;
		}
		else
		{
			return "Your guess is incorrect\nTry Number " + count;
		}
	}

}
