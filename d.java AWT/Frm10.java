/*7-2-22*/

import java.awt.*;
import java.awt.event.*;

class Frm10 extends Frame implements ActionListener , FocusListener , WindowListener{

	int v1,v2,res;
	char opr;
	Label l1,l2,l3;
	TextField t1,t2,t3;
	Button ba,bs,bd,bm;
	Panel p1,p2;

	Frm10(){

		super("Mini Calculater");

		l1 = new Label("Value1");
		l2 = new Label("Value2");
		l3 = new Label("Result");

		t1 = new TextField(10);
		t2 = new TextField(10);
		t3 = new TextField(10);

		t3.setEditable(false);
		t1.addFocusListener(this);
		t2.addFocusListener(this);

		p1 = new Panel();

		p1.setLayout(new GridLayout(3,2,5,5));

		p1.add(l1);
		p1.add(t1);
		p1.add(l2);
		p1.add(t2);
		p1.add(l3);
		p1.add(t3);

		add(p1,BorderLayout.CENTER);
		
		ba = new Button("+");
		bm = new Button("*");
		bs = new Button("-");
		bd = new Button("/");

		ba.addActionListener(this);
		bm.addActionListener(this);
		bs.addActionListener(this);
		bd.addActionListener(this);

		p2 = new Panel();
		p2.add(ba);
		p2.add(bs);
		p2.add(bm);
		p2.add(bd);

		add(p2,BorderLayout.CENTER);
		addWindowListener(this);
		setSize(500,500);
		setVisible(true);
	}

	public void windowClosed(WindowEvent e)
		{
			System.out.println("Closed");
		}
	
		public void windowActivated(WindowEvent e)
		{
			System.out.println("Activated");
		}
	
		public void windowDeactivated(WindowEvent e)
		{
			System.out.println("Deactivated");
		}
	
		public void windowOpened(WindowEvent e)
		{
			System.out.println("Opened");
		}
		
		public void windowIconified(WindowEvent e)
		{
			System.out.println("Iconified");
		}
	
		public void windowDeiconified(WindowEvent e)
		{
			System.out.println("Deiconified");
		}

	

	public void focusGained(FocusEvent e){

		TextField t = (TextField)e.getSource();

		if(t==t1){
			ba.setEnabled(false);
			bs.setEnabled(false);
			bm.setEnabled(false);
			bd.setEnabled(false);

		}
	}

	public void focusLost(FocusEvent e){
		TextField t = (TextField)e.getSource();

		if(t==t1){

			try{
				v1=Integer.parseInt(t1.getText());
			}
			catch(Exception ex){
				t1.setText("0");
				t1.requestFocus();
				return;
			}


		}
		else {

			try{
				v2=Integer.parseInt(t2.getText());
			}
			catch(Exception ex){
				t2.setText("0");
				t2.requestFocus();
				return;
			}

			ba.setEnabled(true);
			bs.setEnabled(true);
			bm.setEnabled(true);
			bd.setEnabled(true);

		}
	}
	
	public void actionPerformed(ActionEvent e){

		opr = (e.getActionCommand()).charAt(0);//it will return "+","-","/","*"
												//ActionListener
		
		switch (opr) {

			case '+':res = v1+v2;
					break;

			case '-':res=v1-v2;
					break;

			case '*':res=v1*v2;
					break;

			case '/':res=v1/v2;
					break;
		}
		t3.setText(""+res);
		t1.requestFocus();

	}

	public static void main(String[] args) {
		Frm10 f = new Frm10();
	}
}