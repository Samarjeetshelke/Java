import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

class Lab2 extends Frame implements ActionListener{
	JTextField t;
	JLabel l;
	JButton b;

	Lab2(){
		super("Event Handel");
		t = new JTextField("**********");
		b = new JButton("Click Me!");
		l = new JLabel("Who is this?");

		b.addActionListener(this);
		t.setSize(50,100);
		add(l);
		add(t);
		add(b);
		setLayout(new FlowLayout());

		setSize(450,450);
		setVisible(true);

	}

	public void actionPerformed(ActionEvent e){
		t.setText("Hi TYIT");
	}

	public static void main(String[] args) {
		Lab2 v = new Lab2();
	}

}
