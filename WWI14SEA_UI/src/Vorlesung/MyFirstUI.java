package Vorlesung;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFirstUI {

	public static void main(String[] args) {
		
		JFrame myWindow = new JFrame();
		
		JButton okButton = new JButton("Nicht ok");
		
		
		FlowLayout myFlowLayout = new FlowLayout();
		myWindow.setLayout(myFlowLayout);
		
		
		
		//okButton.setSize(100, 50);
		
		
		
		JLabel text = new JLabel("Ich bin total motiviert!");
		
		
		myWindow.add(okButton);
		myWindow.add(text);
		
		
		
		
		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//myWindow.setSize(200, 200);
		myWindow.setVisible(true);
		myWindow.pack();

	}

}
