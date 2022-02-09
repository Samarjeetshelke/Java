/*
Date:5-2-22
*/

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import mypack.Util;

class Frm8 extends Frame implements ActionListener{

	Label l1,l2,l3;
	TextField t1,t2,t3;
	Button b1,b2;
	int no,mrk;
	String nm;

	Frm8(String s){
		super(s);

		l1= new Label("Roll No");
		l2= new Label("Name");
		l3= new Label("Marks");

		t1= new TextField();
		t2= new TextField();
		t3= new TextField();

		b1 = new Button("Ok");
		b2 = new Button("Exit");

		b1.addActionListener(this);
		b2.addActionListener(this);

		setLayout(new GridLayout(4,2,5,5));

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

	public void actionPerformed(ActionEvent e){

		//TextField t = (TextField)e.getSource();
		Button b = (Button)e.getSource();

		if(b==b1){

			try{
				no = Integer.parseInt(t1.getText());
			}
			catch(Exception ex){
				t1.setText("0");
				t1.requestFocus();
				return;
			}

			if(no <= 0){
				t1.setText("0");
				t1.requestFocus();
				return;
			}
	
			try{
				mrk = Integer.parseInt(t3.getText());
			}
			catch (Exception ee) {
				t3.setText("0");
				t3.requestFocus();
				return;
			}

			if(mrk <= 0){
				t3.setText("0");
				t3.requestFocus();
				return;
			}

			nm = t2.getText(); 
			Util.display("Roll No:"+no+"\nName :"+nm+"\nMark :"+mrk);
		}
		else {
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		Frm8 f = new Frm8("Student");
	}
}

/*
FocusListener:
	it has two method as it interface focusGained(FocusEvent e) and focusLost(focusEvent 6) it must be implemented it doesent matter empty defination
*/