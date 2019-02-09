/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		int score = 0;
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
                quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // This will make sure the program exits when you close the window

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image Address”)
String picture = "https://thebiaslistcom.files.wordpress.com/2018/07/twice-dance-the-night-away.jpg?w=610&h=406";
		// 2. create a variable of type "Component" that will hold your image
Component image = createImage("https://thebiaslistcom.files.wordpress.com/2018/07/twice-dance-the-night-away.jpg?w=610&h=406");
		// 3. use the "createImage()" method below to initialize your Component

		// 4. add the image to the quiz window
quizWindow.add(image);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String twice = JOptionPane.showInputDialog("Is this picture from What is Love?");
		// 7. print "CORRECT" if the user gave the right answer
if (twice.equalsIgnoreCase("yes")) {
	System.out.println("Inorrect");
	}
		// 8. print "INCORRECT" if the answer is wrong
else if (twice.equalsIgnoreCase("no")) {
	System.out.println("Correct");
	score ++;
}
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
quizWindow.remove(image);
		// 10. find another image and create it (might take more than one line of code)
String picture2 = "https://pm1.narvii.com/6292/3b1d1a11b285a803652fa1cff0d3effdc9766fe5_hq.jpg";
Component image2 = createImage("https://pm1.narvii.com/6292/3b1d1a11b285a803652fa1cff0d3effdc9766fe5_hq.jpg");
		// 11. add the second image to the quiz window
quizWindow.add(image2);
		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question
String tzuyu = JOptionPane.showInputDialog("Is this Tzuyu from Twice?");
		// 14+ check answer, say if correct or incorrect, etc.
if (tzuyu.equalsIgnoreCase("yes")) {
	System.out.println("Correct");
	score ++;
}
else if (tzuyu.equalsIgnoreCase("no")) {
	System.out.println("Incorrect");
}
System.out.println(score);
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}
}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
	





