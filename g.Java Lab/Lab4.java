import java.awt.*;
import java.awt.event.*;
import java.util.*;

class Lab4 extends Frame implements ActionListener{
	
	Label l;
	Button b;

	Lab4(){

		super("Lab1");

		
		b = new Button("Click Here!");
		l = new  Label("Who is This?");
		add(l);
		add(b);

		setLayout(new FlowLayout());
		b.addActionListener(this);

		setSize(400,400);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		l.setText("Hi TYIT");	
	}

	public static void main(String[] args) {
		Lab4 lb =new Lab4();
	}
}