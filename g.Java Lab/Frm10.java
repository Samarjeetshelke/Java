
import java.util.*;
import javax.swing.*;
import java.awt.*;

class Frm10 {

	JFrame f;
	JButton b1,b2,b3,b4,b5;
	JTextField t;

	Frm10(){

		f= new JFrame();

		b1=new JButton("SOUTH");
		b2=new JButton("NORTH");
		b3=new JButton("EAST");
		b4=new JButton("WEST");
		b5=new JButton("CENTER");

		b1.setBackground(Color.red);
		b2.setBackground(Color.green);
		b3.setBackground(Color.yellow);
		b4.setBackground(Color.blue);
		//b5.setBackground(Color.);

		f.setLayout(new BorderLayout(5,5));

		f.add(b1,BorderLayout.SOUTH);
		f.add(b2,BorderLayout.NORTH);
		f.add(b3,BorderLayout.EAST);
		f.add(b4,BorderLayout.WEST);
		f.add(b5,BorderLayout.CENTER);


		
		f.setVisible(true);
		f.setSize(400,400);
	}

	public static void main(String[] args) {
		Frm10 fr = new Frm10();
	}
}