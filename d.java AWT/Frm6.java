import java.awt.*;
import java.awt.event.*;
import java.util.*;
import mypack.Util;

class Frm6 extends Frame implements ActionListener{

	Label l1,l2,l3;
	TextField t1,t2,t3;
	Button b1,b2;
	int no,mrk;
	String nm;

	Frm6(String s){
		super(s);

		l1= new Label("Roll No");
		l2= new Label("Name");
		l3= new Label("Marks");

		t1=new TextField();
		t2=new TextField();
		t3=new TextField();

		b1 = new Button("Ok");
		b2  = new Button("Exit");

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
				mrk = Integer.parseInt(t3.getText());
				nm = t2.getText();
			}
			catch(Exception ex){
				
			}
			Util.display("Roll No:"+no+"\nName:"+nm+"\nMark:"+mrk);
		}
	}

	public static void main(String[] args) {
		Frm6 f = new Frm6("Student");
	}
}