import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;

public class SoundEffects implements ActionListener {
	JFrame frame;
	JButton leftButton;
	JButton midButton;
	JButton rightButton;
	JPanel panel;
	public static void main(String[] args) {
		SoundEffects fc = new SoundEffects();
		fc.showButton();
	}
	public void showButton(){
		frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(200,100);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		panel = new JPanel();
		leftButton = new JButton();
		leftButton.setText("Dog");
		leftButton.addActionListener(this);
		midButton = new JButton();
		midButton.setText("Rain Wind");
		midButton.addActionListener(this);
		rightButton = new JButton();
		rightButton.setText("Bell");
		rightButton.addActionListener(this);
		frame.add(panel);
		panel.add(leftButton);
		panel.add(midButton);
		panel.add(rightButton);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton b = (JButton) e.getSource();
		if (b.equals(leftButton)) {
		     playSound("labrador-barking-daniel_simon2.wav");
		}
		else if (b.equals(midButton)) {
			playSound("heavy-rain-daniel_simon.wav");
		}
		else if (b.equals(rightButton)) {
			playSound("service-bell_daniel_simion.wav");
		}
	}
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
	     sound.play();
	}

}
