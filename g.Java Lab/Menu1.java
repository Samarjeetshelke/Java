//13 March
//Samarjeet Shelke
//Creating a  Menu

import java.awt.*;
import java.awt.event.*;

class Menu1 extends Frame implements ActionListener {

	MenuBar mb;
	Menu m1,m2,m3,m4;
	MenuItem i1,i2,i3,i4,i5;

	Menu1(){

		super("Menu");

		mb = new MenuBar();

		m1 = new Menu("File");
		m2 = new Menu("Edit");
		m3 = new Menu("View");
		m4 = new Menu("Help");

		i1 = new MenuItem("Copy");
		i2 = new MenuItem("Paste");
		i3 = new MenuItem("New");
		i4 = new MenuItem("Open");
		i5 = new MenuItem("Exit");

		i1.addActionListener(this);
		i2.addActionListener(this);
		i3.addActionListener(this);
		i4.addActionListener(this);
		i5.addActionListener(this);

		m1.add(i3);
		m1.add(i4);
		m1.add(i5);

		m2.add(i1);
		m2.add(i2);

		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		mb.add(m4);

		setMenuBar(mb);//setMenuBar() is used to add The Menubar to the frame we cant use add();

		setSize(400,300);
		setVisible(true);
	}
	     

	public void actionPerformed(ActionEvent e){
		MenuItem b = (MenuItem)e.getSource();

		if(b==i1){
			System.out.println("Copy"); 	
		}
		else if (b==i2) {
			System.out.println("Paste");
		}
		else if(b==i3){
			System.out.println("New");
			new Menu1();
		}
		else if (b==i4) {
			System.out.println("Open");
		}
		else{
			System.out.println("Closing");
			//System.exit(0); 
			dispose();
		}

	 
	}
	

	public static void main(String[] args) {
		Menu1 m = new Menu1();
	}
}