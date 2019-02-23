import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	JFrame frame;
	JButton button;
	public static void main(String[] args) {

		FortuneCookie fc = new FortuneCookie();
		fc.showButton();
		
	}
	public void showButton() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(300, 300);
		button = new JButton();
		button.setText("Click me to receive a fortune");
		frame.add(button);
		button.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int rand = new Random().nextInt(5);
		if (rand == 0) {
			JOptionPane.showMessageDialog(null, "You will get straight A+'s");
		}
		else if (rand == 1) {
			JOptionPane.showMessageDialog(null, "You'll meet your idols lol");
		}
		else if (rand == 2) {
			JOptionPane.showMessageDialog(null, "You will become wealthy");
		}
		else if (rand == 3) {
			JOptionPane.showMessageDialog(null, "You'll be respected by everyone");
		}
		else if (rand == 4) {
			JOptionPane.showMessageDialog(null, "You will become famous one day");
		}
		JOptionPane.showMessageDialog(null, "Sorry, idk if these will even come true, \n" 
				+ "but you can work towards these goals. \n Good luck in achieving them tho!");
	}
}
