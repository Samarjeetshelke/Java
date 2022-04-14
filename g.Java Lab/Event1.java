import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

class Event1 extends Frame implements ActionListener{

	JLabel j1;
	JButton jb;

	Event1(){

		j1 = new JLabel("    ");	

		jb = new JButton("Click Me");

		jb.addActionListener(this);

		add(j1);
		add(jb);

		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,400);

	}

	public void actionPerformed(ActionEvent e){
		j1.setText("Welcome to java!");
	}

	public static void main(String[] args) {
		Event1 e1 = new Event1();
	}

}