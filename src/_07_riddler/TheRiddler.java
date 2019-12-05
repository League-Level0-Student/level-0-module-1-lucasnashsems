package _07_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int Score= (0);
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String response =JOptionPane.showInputDialog("What occurs once in every minute, twice in every moment, yet never in a thousand years?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (response.equals("the letter m") ) { 
JOptionPane.showMessageDialog(null, "Correct!");} else {
        // 5. Otherwise, say "wrong" and tell them the answer
	JOptionPane.showMessageDialog(null, "Wrong");
}
		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	
}

}