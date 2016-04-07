package Vorlesung;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.JLabel;



import javax.swing.JFrame;

public class BorderLayoutExample extends JFrame {

	
	public BorderLayoutExample() {
		
		BorderLayout bLayout = new BorderLayout();
		this.setLayout(bLayout);
		
		
		JPanel northPanel = new JPanel();
		northPanel.setLayout(new FlowLayout());
		JPanel centerPanel = new JPanel(new FlowLayout());
		JPanel southPanel = new JPanel(new FlowLayout());
		JPanel eastPanel = new JPanel(new FlowLayout());
		JPanel westPanel = new JPanel(new FlowLayout());
		
		JLabel text1 = new JLabel("North");
		JLabel text2 = new JLabel("South");
		JLabel text3 = new JLabel("West");
		JLabel text4 = new JLabel("East");
		JLabel text5 = new JLabel("Center");
	
		
		JButton buttonNorth = new JButton("North");
		
		northPanel.add(buttonNorth);
		centerPanel.add(text5);
		centerPanel.add(text1);
		southPanel.add(text2);
		westPanel.add(text3);
		eastPanel.add(text4);
		
		this.add(northPanel, BorderLayout.NORTH);
		this.add(southPanel, BorderLayout.SOUTH);
		this.add(westPanel, BorderLayout.WEST);
		this.add(eastPanel, BorderLayout.EAST);
		this.add(centerPanel, BorderLayout.CENTER);
		//this.add(text1);
		
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.pack();
	}
	
	
	public static void main(String[] args) {
		BorderLayoutExample frame = new BorderLayoutExample();

	}

}
