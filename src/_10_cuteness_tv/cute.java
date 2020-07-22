package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class cute implements ActionListener {
	JButton video1 = new JButton();
	JButton video2 = new JButton();
	JButton video3 = new JButton();
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	public void run() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(video1);
		panel.add(video2);
		panel.add(video3);
		video1.addActionListener(this);
		video2.addActionListener(this);
		video3.addActionListener(this);
		frame.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
