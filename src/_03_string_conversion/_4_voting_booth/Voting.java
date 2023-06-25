package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class Voting {
	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("How old are you?");
		int ageAsInt = Integer.parseInt(age);
		if (ageAsInt >= 18) {
			JOptionPane.showInputDialog(null, "Who would you like as your president?");
		} else {
			JOptionPane.showMessageDialog(null, "Nobody cares about your opinion.");
		}
	}
}
