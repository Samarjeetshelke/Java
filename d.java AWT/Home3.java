import java.util.*;
import java.awt.*;
import java.awt.event.*;
class Home3 extends Frame{
	Home3(String s){
		super(s);
		Frame f1 ,f2,f3,f4;
		f1 = new Frame();
		f2 = new Frame();
		f3 = new Frame();
		f4 = new Frame();
		setLayout(new GridLayout(2, 2, 100, 100));

		f1.setBackground(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
		//f1.setSize(500,500);
		f1.setBounds(10,10,100,100);
		f1.setVisible(true);
		f2.setBackground(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
		//f2.setSize(500,500);
		f2.setVisible(true);
		f3.setBackground(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
		//f3.setSize(500,500);
		f3.setVisible(true);
		f4.setBackground(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
		//f4.setSize(500,500);
		f4.setVisible(true);
		//setBackground(Color.red);
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String[] args) {
		Home3 a = new Home3("Color");
	}
}