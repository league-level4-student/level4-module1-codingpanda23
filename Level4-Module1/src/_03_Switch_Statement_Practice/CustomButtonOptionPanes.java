package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		switch (input) {
		case 0: //Sunday
			JOptionPane.showMessageDialog(null, "Lazy Sundae");
			break;
		case 1: //Monday
			JOptionPane.showMessageDialog(null, "Monday: Deal with it");
			break;
		case 2: //Tuesday
			JOptionPane.showMessageDialog(null, "It's two's day! :p");
			break;
		case 3: //Wednesday
			JOptionPane.showMessageDialog(null, "Hump Day");
			break;
		case 4: //Thursday
			JOptionPane.showMessageDialog(null, "Thorsday");
			break;
		case 5: //Friday
			JOptionPane.showMessageDialog(null, "The day of the French Fry");
			break;
		case 6: //Saturday
			JOptionPane.showMessageDialog(null, "Sit all day");
			break;
		default:
			JOptionPane.showMessageDialog(null, ":(");
			break;
		}
	}
}
