import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class wack implements ActionListener {
		
	JPanel panel; 
	String words = "retardted duck";
	int score = 0;
	int wrong = 0;
	static Date d;
	public static void main(String[] args) {
		
	wack wak = new wack();
	wak.createUI();

	wak.drawButton(new Random().nextInt(20));
	}
	public void createUI() {
		panel = new JPanel();
	JFrame frame = new JFrame();
	frame.setSize(500, 500);
	frame.add(panel);
	
	frame.setVisible(true);
	panel.setVisible(true);
	
	}
	public void drawButton( int x) {
	 
	
		for (int i = 0; i < 20; i++) {
			
			if(i == x ) {
			JButton button1 = new JButton();
			panel.add(button1);
			button1.setVisible(true);
			button1.setText("mole in da cia");
			button1.addActionListener(this);
			}
			else {
				JButton buton = new JButton();
				buton.addActionListener(this);
panel.add(buton);
			}
			
		}
	}
	void speak(String words) {
	     try {
	          Runtime.getRuntime().exec("say " + words).waitFor();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	private void endGame(Date timeAtStart, int molesWhacked) {
	     Date timeAtEnd = new Date();
	     JOptionPane.showMessageDialog(null, "Your whack rate is "
	          + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	          + " moles per second.");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
