import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot idk;
	public static void main(String[] args) {
		
		idk = new Robot();
		idk.setSpeed(30);
		idk.turn(270);
		idk.move(450);
		idk.turn(270);
		idk.move(300);
		idk.turn(270);
		idk.penDown();
		Random n = new Random();
		for (int i = 0; i < 10; i++) {
			int rand = n.nextInt(3);
			if (rand == 0) {
				house("small");
			}
			else if (rand == 1) {
				house ("medium");
			}
			else if (rand == 2) {
				house ("large");
			}
		}
	}
	
	public static void house (String height) {
		int h = 101;
		if (height.equals("small")) {
			h=60;
			idk.setPenColor(255,0,0);
			idk.turn(270);
			idk.move(h);
			drawPointyRoof();
		}
		else if (height.equals("medium")) {
			h=120;
			idk.setPenColor(0,255,0);
			idk.turn(270);
			idk.move(h);
			drawPointyRoof();
		}
		else if (height.equals("large")) {
			h=250;
			idk.setPenColor(0,0,255);
			idk.turn(270);
			idk.move(h);
			drawFlatRoof();
		}
		idk.move(h);
		idk.turn(270);
		idk.setPenColor(0, 255, 0);
		idk.move(20);
		}
	public static void drawPointyRoof() {
		idk.turn(45);
		idk.move(20);
		idk.turn(90);
		idk.move(20);
		idk.turn(45);
	}
	public static void drawFlatRoof () {
		idk.turn(90);
		idk.move(30);
		idk.turn(90);
	}

	}
	
