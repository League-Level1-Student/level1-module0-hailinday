package _01_houses;

import java.awt.Color;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot rob = new Robot("mini");

	public void run() {
		initializeUI();
	}

	public void initializeUI() {
		rob.penDown();
		rob.setSpeed(100);
		rob.setX(0);
		rob.setY(450);
		for (int i = 0; i < 10; i++) {
			int a;
			String color = JOptionPane.showInputDialog("Will the building be red, blue, or black?");
			if (color.equalsIgnoreCase("red")) {
				rob.setPenColor(Color.red);
			} else if (color.equalsIgnoreCase("Blue")) {
				rob.setPenColor(Color.blue);
			} else {
				rob.setPenColor(Color.black);
			}
			String size = JOptionPane.showInputDialog("Will the building be small, medium or large heights?");
			if (size.equalsIgnoreCase("Small")) {
				a = 60;
			} else if (size.equalsIgnoreCase("Medium")) {
				a = 120;
			} else {
				a = 250;

			}
			if (a > 165) {
				rob.turn(90);
				rob.move(35);
				rob.turn(-90);
				rob.move(a);
				drawRoofFlat();
				rob.move(a);
				rob.turn(180);
			} else {
				rob.turn(90);
				rob.move(35);
				rob.turn(-90);
				rob.move(a);
				drawRoofPoint();
				rob.move(a);
				rob.turn(180);
			}
		}
		rob.turn(90);
		rob.move(50);
	}
	public void drawRoofFlat() {
		rob.turn(90);
		rob.move(50);
		rob.turn(90);
	}
	public void drawRoofPoint() {
		rob.turn(45);
		rob.move(35);
		rob.turn(90);
		rob.move(35);
		rob.turn(45);
	}
}
