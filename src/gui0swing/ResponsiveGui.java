package gui0swing;
import javax.swing.*;
import java.awt.event.*;

public class ResponsiveGui extends guibase0 implements ActionListener{
	//JButton button;
	static JButton jb0;
	ResponsiveGui gui;
	
	public static void main (String[] args) {
		ResponsiveGui gui = new ResponsiveGui();
		gui.go();
	}

	public void go() {
		jf0 = new JFrame();
		jb0 = new JButton("Push");
		jb0.addActionListener(this);
		jf0.getContentPane().add(jb0);
		jf0.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jf0.setSize(400,400);
		jf0.setVisible(true);		
	}

	public void actionPerformed(ActionEvent event) {
		jb0.setText("I’ve been clicked!");
	}
	
}
