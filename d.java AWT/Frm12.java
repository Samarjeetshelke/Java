import java.awt.*;
import java.awt.event.*;

class Frm12 extends Frame{

	Frm12(){

		super("Adapter class");

		addWindowListener(new WindowAdapter (){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		setSize(400,400);
		setVisible(true);
	}

	public static void main(String[] args) {
		Frm12 a = new Frm12();
	}
}
