package extra;

import javax.swing.JOptionPane;

public class borat {
	public static void main(String[] args) {

		String pass1 = JOptionPane.showInputDialog("Enter 1st password");
		String pass2 = JOptionPane.showInputDialog("Enter 2nd password");
		String pass3 = JOptionPane.showInputDialog("Enter 3rd password");
		String pass4 = JOptionPane.showInputDialog("Enter 4th password");
		String pass5 = JOptionPane.showInputDialog("Enter 5th password");
		String pass6 = JOptionPane.showInputDialog("Enter 6th password");
		String pass7 = JOptionPane.showInputDialog("Enter 7th password");
		String pass8 = JOptionPane.showInputDialog("Enter 8th password");

		String pass1char = Character.toString(pass1.charAt(0));

		String pass2char = Character.toString(pass2.charAt(1));

		String pass3char = Character.toString(pass3.charAt(2));

		String pass4char = Character.toString(pass4.charAt(3));

		String pass5char = Character.toString(pass5.charAt(4));

		String pass6char = Character.toString(pass6.charAt(5));

		String pass7char = Character.toString(pass7.charAt(6));

		String pass8char = Character.toString(pass8.charAt(7));

		String password = pass1char + pass2char + pass3char + pass4char + pass5char + pass6char + pass7char + pass8char;
	if(password.equals("qwertyui")) {
		System.out.println("welcome "+ password);
	}
	
	}
}
