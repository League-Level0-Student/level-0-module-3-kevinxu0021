//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(101-1);
		// 2. Print out the random variable above
		// 11. do the following 10 times
		boolean win = false;
		for (int i = 0; i < 10; i++) {
			
		
			// 1. ask the user for a guess using a pop-up window, and save their response 
		String Guess = JOptionPane.showInputDialog("Guess a number between 1 and 100.");
			// 4. convert the users’ answer to an int (Integer.parseInt(string))
			int Number = Integer.parseInt(Guess);
			// 5. if the guess is correct
			if(Number == random) {
				// 6. win
				win = true;
				JOptionPane.showMessageDialog(null, "You win with the number " + random);
				break;
			}else if(Number > random) {
				JOptionPane.showMessageDialog(null, "The number " + Number + " is too high.");
			}else if(Number < random) {
				JOptionPane.showMessageDialog(null, "The number " + Number + " is too low.");
			}
				
			// 7. if the guess is high
				// 8. tell them it's too high
			// 9. if the guess is low
				// 10. tell them it's too low
		}
		// 12. tell them they lose
		if(win == false) {
			JOptionPane.showMessageDialog(null, "You lose. The correct number is " + random);
		}
	}

}


