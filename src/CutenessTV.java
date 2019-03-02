import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton ducks;
	JButton frog;
	JButton unicorns;
	public static void main(String[] args) {
		CutenessTV fc = new CutenessTV();
		fc.showButton();
	}
	public void showButton() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(200,100);
		panel = new JPanel();
		frame.add(panel);
		ducks = new JButton();
		ducks.setText("Ducks");
		ducks.addActionListener(this);
		frog = new JButton();
		frog.setText("Frog");
		frog.addActionListener(this);
		unicorns = new JButton();
		unicorns.setText("Unicorns");
		unicorns.addActionListener(this);
		panel.add(ducks);
		panel.add(frog);
		panel.add(unicorns);
	}
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(ducks)) {
			showDucks();
		}
		if (e.getSource().equals(frog)) {
			showDucks();
		}
		if (e.getSource().equals(unicorns)) {
			showDucks();
		}
	}
}
