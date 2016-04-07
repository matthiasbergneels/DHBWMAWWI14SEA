package Vorlesung;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class GridLayoutExample extends JFrame {

	public GridLayoutExample() {
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		this.setLayout(new GridLayout(0, 2));
		
		JPanel buttonPanel = new JPanel(new FlowLayout());
		
		JLabel text1 = new JLabel("Text 1");
		JLabel text2 = new JLabel("Text 2");
		JLabel text3 = new JLabel("Text 3");
		JLabel text4 = new JLabel("Text 4");
		JLabel text5 = new JLabel("Text 5");
		JButton button1 = new JButton("Ende");
		
		
		buttonPanel.add(button1);
		
		this.add(text1);
		this.add(text2);
		this.add(text3);
		this.add(text4);
		this.add(text5);
		this.add(buttonPanel);
		
		
		
		this.pack();
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		GridLayoutExample frame = new GridLayoutExample();

	}

}
