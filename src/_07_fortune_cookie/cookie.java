package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class cookie implements ActionListener {
	JButton button = new JButton();
	JFrame frame = new JFrame();

	public void showButton() {
		System.out.println("Button clicked");
		frame.setVisible(true);
		frame.add(button);
		frame.pack();
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Woohoo");
		int rand = new Random().nextInt(5);
		if (rand==0) {
			System.out.println("You have good luck!");
		} else if (rand==1) {
			System.out.println("You have bad luck!");
		} else if (rand==2) {
			System.out.println("You will be rich!");
		} else if (rand==3) {
			System.out.println("You will be broke!");
		} else if (rand==4) {
			System.out.println("You will die in 3 days!");
		}
	}

}
