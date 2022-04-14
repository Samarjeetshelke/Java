import java.awt.*;
import java.awt.event.*;
import java.util.*;

class Lab extends Frame{
	TextField t;
	Label l;
	Button b;

	Lab(){

		super("Lab1");

		t = new TextField();
		b = new Button();
		l = new  Label("Name:");

		l.setBond(10,10,100,100);
		t.setBond(10,110,100,100);
		b.setBond(2000,10,100,100);

		add(l);
		add(t);
		add(b);

		setSize(400,400);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		Lab lb =new Lab();
	}
}