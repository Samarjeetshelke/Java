import java.util.*;
import java.awt.*;
import java.awt.event.*;

class Home4 extends Frame implements ActionListener{

	 
	 	Button b1=new Button("Red");
		Button b2=new Button("Green"); 
		Button b3=new Button("Blue"); 
		Button b4=new Button("Random");

		Panel p1=new Panel();
		Panel p2=new Panel(); 
		Panel p3=new Panel(); 
		Panel p4=new Panel();

	Home4(String s){
		super(s);
		p1.setBackground(Color.red);
		p2.setBackground(Color.green);
		p3.setBackground(Color.blue);  

        p1.setBounds(0,40,200,200);
        p2.setBounds(300,40,200,200); 
        p3.setBounds(0,340,200,200); 
        p4.setBounds(300,340,200,200);    
		    
        b1.setBounds(50,100,80,30);     
        b2.setBounds(100,100,80,30);    
        b3.setBounds(100,100,80,30);   
        b4.setBounds(100,100,80,30);   
      
        p1.add(b1);
        p2.add(b2);  
        p3.add(b3);
        p4.add(b4);

        b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);

		add(p1);
		add(p2);
		add(p3);
		add(p4);

		setLayout(null);
		setSize(520,550);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e){
			Button b = (Button)e.getSource();
			if(b==b1){
					int r =(int)(Math.random()*255);
					int g =0;
					int bx =0;
					Color cr = new Color(r,g,bx);
					p1.setBackground(cr);
			}
			else if (b==b2) {
					int r =0;
					int g =(int)(Math.random()*255);
					int bx=0;
					Color cr = new Color(r,g,bx);
					p2.setBackground(cr);	
			}
			else if (b==b3) {
					int r =0;
					int g =0;
					int bx =(int)(Math.random()*255);
					Color cr = new Color(r,g,bx);
					p3.setBackground(cr);
			}
			else{
					int r =(int)(Math.random()*255);
					int g =(int)(Math.random()*255);
					int bx =(int)(Math.random()*255);
					Color cr = new Color(r,g,bx);
					p4.setBackground(cr);
			}				
	}

	public static void main(String[] args) {
		Home4 a = new Home4("Color");
	}
}