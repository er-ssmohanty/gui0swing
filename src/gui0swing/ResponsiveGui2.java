package gui0swing;
import javax.swing.*;
import java.awt.event.*;

public class ResponsiveGui2 extends guibase0 implements ActionListener{
	//JButton button;
	static JButton jb0;
	ResponsiveGui2 gui;
	
	public static void main (String[] args) {
		ResponsiveGui2 gui = new ResponsiveGui2();
		gui.go();
	}
	public void go() {
		go1();
		jb0.addActionListener(this);
		go2();
	}
	public void go1() {
		jf0 = new JFrame();
		jb0 = new JButton("Push");
	}
	
	public void go2() {
		jf0.getContentPane().add(jb0);
		jf0.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jf0.setSize(400,400);
		jf0.setVisible(true);		
	}

	public void actionPerformed(ActionEvent event) {
		jb0.setText("I’ve been clicked!");
	}
	
}
