package b.lambda;

import java.awt.event.ActionEvent;


import javax.swing.*;

public class GUIBeispiel extends JFrame{

	public GUIBeispiel() {
		JButton b = new JButton("Klick mich");
		b.addActionListener((ActionEvent e) -> System.out.println("Klick"));
		add(b);
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new GUIBeispiel();

	}

}
