package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

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
		video1.setText("Video 1");
		video2.addActionListener(this);
		video2.setText("Video 2");
		video3.addActionListener(this);
		video3.setText("Video 3");
		frame.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed==video1) {
			showDucks();
		} else if (buttonPressed==video2) {
			showFrog();
		} else if (buttonPressed==video3) {
			showFluffyUnicorns();
		}
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
	     
	     // Workaround for Linux because "Desktop.getDesktop().browse()" doesn't
	     //work on some Linux implementations
	     try {
	     if (System.getProperty("os.name").toLowerCase().contains("linux")) {
	     if (Runtime.getRuntime().exec(new String[] {
	      "which", "xdg- open" }).getInputStream().read() != -1) {
	     Runtime.getRuntime().exec(new String[] { "xdg-open", videoID });
	     }
	     } else {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     }      } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
}
