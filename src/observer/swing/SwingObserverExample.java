package observer.swing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingObserverExample {

	JFrame frame;
	
	public static void main(String[] args) {
		SwingObserverExample example = new SwingObserverExample();
		example.go();
	}
	
	public void go() {
		frame = new JFrame();
		JButton button = new JButton("click me!");
		button.addActionListener(new AngelListener());
		button.addActionListener(new DevilListener());
		
		frame.getContentPane().add(BorderLayout.CENTER, button);
		frame.setSize(new Dimension(100, 100));
		frame.setVisible(true);
	}
	
	class AngelListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Don't do it, you might regret it!");	
		}
	}
	
	class DevilListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Come on, do it!");	
		}
	}
}
