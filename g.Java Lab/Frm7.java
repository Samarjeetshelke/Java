import java.awt.*;
import java.awt.event.*;
import java.util.*;

class Frm7 extends Frame {

	Label l1,l2,l3;
	TextField t1,t2,t3;
	Button b1,b2;

	Frm7(String s){
		super(s);

		l1= new Label("Roll No");
		l2= new Label("Name");
		l3= new Label("Marks");

		t1= new TextField();
		t2= new TextField();
		t3= new TextField();


		b1 = new Button("Ok");
		b2 = new Button("Exit");

		setLayout(new GridLayout(4,2,5,5));
		//setLayout(null);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(b1);
		add(b2);

		setSize(400,400);
		setVisible(true);
	}

	
	public static void main(String[] args) {
		Frm7 f = new Frm7("Student");
	}
}

