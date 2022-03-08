import java.awt.*;
import java.awt.event.*;
import java.util.*;

class Lab1 extends Frame implements ActionListener{
	TextField t;
	Label l;
	Button b;

	Lab1(){
		super("Event Handel");
		t = new TextField("**********");
		b = new Button("Click Me!");
		l = new Label("Who is this?");

		b.addActionListener(this);

		add(l);
		add(t);
		add(b);
		
		setLayout(new FlowLayout());

		setSize(450,450);
		setVisible(true);

	}

	public void actionPerformed(ActionEvent e){
		t.setText("HI TYIT");
	}

	public static void main(String[] args) {
		Lab1 v=new Lab1();
	}

}
