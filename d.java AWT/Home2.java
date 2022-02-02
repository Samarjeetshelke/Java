import java.util.*;
import java.awt.*;
import java.awt.event.*;
//Homework
class Home2 extends Frame implements ActionListener{
	Button b1,b2,b3,b4;
	Home2(String s){
		super(s);
		b1 = new Button("Red Color");
		b2 = new Button("Green Color");
		b3 = new Button("Blue Color");
		b4 = new Button("Ran Color");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		setLayout(null);
		b1.setBounds(20,55,200,200);
		b2.setBounds(20,300,200,200);
		b3.setBounds(255,55,200,200);
		b4.setBounds(255,300,200,200);

		add(b1);add(b2);
		add(b3);add(b4);
		
		setSize(500,500);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e){
			Button b = (Button)e.getSource();
			if(b==b1){
					int r =(int)(Math.random()*255);
					int g =0;
					int bx =0;
					Color cr = new Color(r,g,bx);
					b1.setBackground(cr);
			}
			else if (b==b2) {
					int r =0;
					int g =(int)(Math.random()*255);
					int bx=0;
					Color cr = new Color(r,g,bx);
					b2.setBackground(cr);	
			}
			else if (b==b3) {
					int r =0;
					int g =0;
					int bx =(int)(Math.random()*255);
					Color cr = new Color(r,g,bx);
					b3.setBackground(cr);
			}
			else{
					int r =(int)(Math.random()*255);
					int g =(int)(Math.random()*255);
					int bx =(int)(Math.random()*255);
					Color cr = new Color(r,g,bx);
					b4.setBackground(cr);
			}
					
			
	}

	public static void main(String[] args) {
		Home2 f = new Home2("Color");
		//Home1 g = new Home1("Color1");
	}
}