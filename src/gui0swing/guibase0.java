package gui0swing;
import javax.swing.*;

public class guibase0{
	static JFrame jf0;
	static JButton jb0;

	public static void main(String[] args) {
		guibase0 gui = new guibase0();
		gui.go1();
		gui.go2();
	}
	public void go1() {
		jf0 = new JFrame();
		jb0 = new JButton("Push");
	}
	public void go2(){
		jf0.getContentPane().add(jb0);
		
		jf0.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jf0.setSize(400,400);
		jf0.setVisible(true);		
	}
}
