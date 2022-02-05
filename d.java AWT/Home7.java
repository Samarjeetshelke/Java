import java.awt.*;
import java.awt.event.*;
import java.util.*;
import mypack.Util;

class Home7 extends Frame implements ActionListener,FocusListener{

	Label l1,l2,l3;
	TextField t1,t2,t3;
	Button b1,b2;
	int no,pr;
	String nm;

	Home7(String s){
		super(s);

		l1= new Label("Book No");
		l2= new Label("Book Name");
		l3= new Label("Price");

		t1= new TextField();
		t2= new TextField();
		t3= new TextField();

		t1.addFocusListener(this);
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

		Button b = (Button)e.getSource();

		if(b == b2){
			System.exit(0);
		}
		else {

			try{
				no = Integer.parseInt(t1.getText());
				pr = Integer.parseInt(t3.getText());
				nm = t2.getText();
			}
			catch(Exception ex){
				
			}

			Util.display("Book No :"+no+"\nBook Name:"+nm+"\nPrice:"+pr);
		}
	}

	public void focusGained(FocusEvent e){

	}

	public void focusLost(FocusEvent e){

		TextField t = (TextField)e.getSource();

		if(t==t1){

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
		}
		else{

			try{
				pr= Integer.parseInt(t3.getText());
			}
			catch (Exception ee) {
				t3.setText("0");
				t3.requestFocus();
				return;
			}

			if(pr <= 0){
				t3.setText("0");
				t3.requestFocus();
				return;
			}
		}
	}

	public static void main(String[] args) {
		Home7 f = new Home7("Book");
	}
}

/*
FocusListener:
	it has two method as it interface focusGained(FocusEvent e) and focusLost(focusEvent 6) it must be implemented it doesent matter empty defination
*/