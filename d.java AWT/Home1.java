import java.util.*;
import java.awt.*;
import java.awt.event.*;
//Homework
class Home1 extends Frame implements ActionListener{
	Button b1,b2,b3,b4;
	Home1(String s){
		super(s);
		b1 = new Button("Red Color");
		b2 = new Button("Green Color");
		b3 = new Button("Blue Color");
		b4 = new Button("Ran Color");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		setLayout(new GridLayout(2, 2, 25, 25));
		/*b1.setBounds(50,200,100,20);
		b2.setBounds(200,200,100,20);*/

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
		Home1 f = new Home1("Color");
		//Home1 g = new Home1("Color1");
	}
}