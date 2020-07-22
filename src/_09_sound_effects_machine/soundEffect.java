package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class soundEffect implements ActionListener {
	JButton wood = new JButton();
	JButton ding = new JButton();

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	public void run() {
		frame.setVisible(true);
		frame.add(panel);
		wood.setText("Wood");
		ding.setText("Ding");
		wood.addActionListener(this);
		ding.addActionListener(this);
		panel.add(wood);
		panel.add(ding);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed == wood) {
			playSound("woodSound");
		} else if (buttonPressed == ding) {
			playSound("dingSound");
		}
	}

	private void playSound(String fileName) {
		// AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		// sound.play();
		System.out.println(fileName);
	}
}
