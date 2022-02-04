import java.awt.*;
import java.awt.event.*;
import java.util.*;
import mypack.Util;

class Frm7 extends Frame implements ActionListener,FocusListener{

	Label l1,l2,l3;
	TextField t1,t2,t3;
	Button b1,b2;
	int no,mrk;
	String nm;

	Frm7(String s){
		super(s);

		l1= new Label("Roll No");
		l2= new Label("Name");
		l3= new Label("Marks");

		t1= new TextField();
		t2= new TextField();
		t3= new TextField();

		t1.addFocusListener(this);		//Adding a focuslistener
		t3.addFocusListener(this);

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
									//Method for ActionListener  REQURIED
		Button b = (Button)e.getSource();

		if(b == b2){
			System.exit(0);
		}
		else {

			try{
				no = Integer.parseInt(t1.getText());
				mrk = Integer.parseInt(t3.getText());
				nm = t2.getText();
			}
			catch(Exception ex){
				
			}

			Util.display("Roll No:"+no+"\nName:"+nm+"\nMark:"+mrk);
		}
	}

	public void focusGained(FocusEvent e){			//Method for FocusListener REQURIED

	}

	public void focusLost(FocusEvent e){			//Method for FocusListerner REQURIED

		TextField t = (TextField)e.getSource();

		if(t==t1){

			try{
				no = Integer.parseInt(t1.getText());
			}
			catch(Exception ex){
				t1.setText("0");
				t1.requestFocus();	//It will not letyou to change the focus
				return;
			}

			if(no <= 0){
				t1.setText("0");
				t1.requestFocus();
				return;
			}
		}
		else{

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
		}
	}

	public static void main(String[] args) {
		Frm7 f = new Frm7("Student");
	}
}

/*
FocusListener:
	it has two method as it interface focusGained(FocusEvent e) and focusLost(focusEvent 6) it must be implemented it doesent matter empty defination
*/
