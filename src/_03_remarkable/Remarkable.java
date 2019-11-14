package _03_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;
public class Remarkable {
public static void main(String[] args) {
	

		// 1. Save something remarkable about each person in a variable
	String response1 = JOptionPane.showInputDialog(null,"Enter a name");
	
		// 2. Ask the user to enter a name. Store their answer in a variable.
if (response1.equals("Colin")) {
	JOptionPane.showMessageDialog(null, "He flinches a lot");
} else {
JOptionPane.showMessageDialog(null, "I dont know who that is");
}
		// 3. In a pop-up, tell the user what is remarkable about that person. 

	}
}

