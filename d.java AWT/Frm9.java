/*7-2-22*/
/*
Study of the windowListener:
	1.public void windowClosing(WindowEvent e){}
	2.public void windowClosed(WindowEvent e){}
	3.public void windowActivated(WindowEvent e){}
	4.public void windowDeactivated(WindowEvent e){}
	5.public void windowOpened(WindowEvent e){}
	6.public void windowIconified(WindowEvent e){}
	7.public void windowDeiconified(WindowEvent e){}

*/

import java.awt.*;
import java.awt.event.*;

class Frm9 extends Frame implements WindowListener{
	Frm9(){
		super("WindowListener");
		addWindowListener(this);
		setSize(400,400);
		setVisible(true);

	}

	public void windowClosing(WindowEvent e){
		System.exit(0);
	}

	public void windowClosed(WindowEvent e){
		System.out.println("Closed");
	}

	public void windowActivated(WindowEvent e){
		System.out.println("Activated");
	}

	public void windowDeactivated(WindowEvent e){
		System.out.println("Deactivated");
	}

	public void windowOpened(WindowEvent e){
		System.out.println("Opened");
	}

	public void windowIconified(WindowEvent e){
		System.out.println("Iconified");

	}
	public void windowDeiconified(WindowEvent e){
		System.out.println("Deiconified");
		
	}
	public static void main(String[] args) {
		Frm9 f = new Frm9();
	}
}