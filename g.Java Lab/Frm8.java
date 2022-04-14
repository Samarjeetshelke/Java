
import java.util.*;
import javax.swing.*;
import java.awt.*;

class Frm8 {

	JFrame f;
	JButton b;
	JTextField t;

	Frm8(){

		f= new JFrame();
		b=new JButton("Submit");
		t=new JTextField();

		
		f.add(t);
		t.setText("Hello There");
		f.add(b);
		f.setLayout(new FlowLayout());
		
		f.setVisible(true);
		f.setSize(400,400);
	}

	public static void main(String[] args) {
		Frm8 fr = new Frm8();
	}
}