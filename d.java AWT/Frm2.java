import java.util.*;
import java.awt.*;
import java.awt.event.*;
class Frm2 extends Frame{
	Frm2(String s){
		super(s);
		/*
			int r =(int)(Math.random()*255);
			int g =(int)(Math.random()*255);
			int b =(int)(Math.random()*255);
			setBackground(new Color(r,g,b));
		*/
		setBackground(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String[] args) {
		Frm2 a = new Frm2("Color");
	}
}