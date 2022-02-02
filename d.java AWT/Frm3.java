import java.util.*;
import java.awt.*;
import java.awt.event.*;

class Frm3 extends Frame implements ActionListener{

	Button b1,b2;

	Frm3(String s){
		super(s);
		b1 = new Button("Color");
		b2 = new Button("Exit");
		b1.addActionListener(this);
		b2.addActionListener(this);
		setLayout(null);
		b1.setBounds(50,200,100,20);
		b2.setBounds(200,200,100,20);
		add(b1);
		add(b2);
		setSize(350,420);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e){
			Button b = (Button)e.getSource();
			if(b == b2){
				System.exit(0);
			}
			else{
					int r =(int)(Math.random()*255);
					int g =(int)(Math.random()*255);
					int bx =(int)(Math.random()*255);
					Color cr = new Color(r,g,bx);
					setBackground(cr);
			}
	}

	public static void main(String[] args) {
		Frm3 f = new Frm3("Color");
	}
}
/*
Homework
get 4 buttons
which should have 2*2 gride system
for red r=val g b ;
*/