import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class  Lab3  extends Frame implements ActionListener,WindowListener{

	Button b;
	Lab3(){
		super("Lab");
		addWindowListener()

		b = new Button("Change");

		b.addActionListener(this);

		add(b);
		setLayout(new FlowLayout());

		setSize(400,400);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e){
		setBackground(new Color((int)(Math.random()*250),(int)(Math.random()*250),(int)(Math.random()*250)));
	}
	public static void main(String[] args) {
		Lab3 lb = new Lab3();
	}
	
}