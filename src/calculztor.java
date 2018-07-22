import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calculztor implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField text = new JTextField();
	JTextField text2 = new JTextField();
	JButton button = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	
public static void main(String[] args) {
	new calculztor().gui();

	
	
	
	
	
}
public void gui() {
	
	frame.setVisible(true);
	frame.setSize(500, 500);
	frame.add(panel);
	panel.add(text);
	panel.add(text2);
	panel.add(button);
	panel.add(button2);
	panel.add(button3);
	panel.add(button4);
button.setText("add");

button2.setText("sub");
button3.setText("mult");
button4.setText("div");
text.setColumns(3);
text2.setColumns(3);
frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
button.addActionListener(this);
button2.addActionListener(this);
button3.addActionListener(this);
button4.addActionListener(this);

}


public void actionPerformed(ActionEvent e) {
	
	JButton buttonPressed = (JButton) e.getSource();
	

	if (buttonPressed.equals(button)) {
		//do math of button
	System.out.println();
	}
	
	if (buttonPressed.equals(button2)) {
		//do math

	}
	if (buttonPressed.equals(button3)) {
		//do math of button
	}
	if (buttonPressed.equals(button4)) {
		//do math of button
	}
	
}
}
