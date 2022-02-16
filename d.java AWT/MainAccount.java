import mypack.NewAccount;
import mypack.AccountDisplay;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import mypack.Util;
import java.io.*;

class MainAccount extends Frame implements FocusListener,ActionListener,WindowListener{

	Panel p1,p2;
	AccountDisplay dlg;
	Label l1,l2,l3;
	TextField t1,t2,t3;
	Button ba,bm,bd,bdisp;
	LinkedList<NewAccount>ls;
	NewAccount ref;
	int no ,oamt;
	String nm;
	boolean state;

	MainAccount(){

		super("Account");

		l1=new Label("A/C No");
		l2=new Label("Name");
		l3=new Label("OPn Balance");

		t1=new TextField(10);
		t2=new TextField(30);
		t3=new TextField(10);

		t1.addFocusListener(this);
		t2.addFocusListener(this);

		p1=new Panel();

		p1.setLayout(new GridLayout(3,2,5,5));

		p1.add(l1);
		p1.add(t1);
		p1.add(l2);
		p1.add(t2);
		p1.add(l3);
		p1.add(t3);

		add(p1,BorderLayout.CENTER);

		ba=new Button("Add");
		bm=new Button("Mod");
		bd=new Button("Del");
		bdisp=new Button("Disp");

		ba.addActionListener(this);
		bm.addActionListener(this);
		bd.addActionListener(this);
		bdisp.addActionListener(this);

		p2 = new Panel();
		p2.add(ba);
		p2.add(bm);
		p2.add(bd);
		p2.add(bdisp);

		add(p2,BorderLayout.SOUTH);

		addWindowListener(this);

		ls=new LinkedList<NewAccount>();
		

		setSize(500,400);
		setVisible(true);



	}

		public void windowClosing(WindowEvent e){
				//setVisible(false);
				close();
				System.exit(0);
		}

		public void windowClosed(WindowEvent e){
		
		}

		public void windowActivated(WindowEvent e){
				
		}

		public void windowDeactivated(WindowEvent e){
		
		}

		public void windowOpened(WindowEvent e){
				open();
		}

		public void windowIconified(WindowEvent e){
		
		}

		public void windowDeiconified(WindowEvent e){
			
		}

		
		void open(){

			FileInputStream fis= null;
			ObjectInputStream ois=null;

			try{

				fis=new FileInputStream("acc.dat");
				ois=new ObjectInputStream(fis);
				ls=(LinkedList<NewAccount>)ois.readObject();
				ois.close();
				fis.close();

			}
			catch(Exception ex){

				if(ls==null){
					ls=new LinkedList<NewAccount>();
				}

			}
		}

		void close(){

			FileOutputStream fos=null;
			ObjectOutputStream oos=null;

			try{

				fos=new FileOutputStream("acc.dat");
				oos=new ObjectOutputStream(fos);
				oos.writeObject(ls);
				oos.close();
				fos.close();
			}
			catch(Exception ex){

			}
		}

		

		public void focusGained(FocusEvent e){

			TextField t = (TextField)e.getSource();

			if(t==t1){
				ba.setEnabled(false);
				bm.setEnabled(false);
				bd.setEnabled(false);
			}
		}

		public void focusLost(FocusEvent e){

			TextField t = (TextField)e.getSource();

			if(t==t1){

				try{

					no=Integer.parseInt(t1.getText());

				}
				catch(Exception ex){

					t1.setText("0");
					t1.requestFocus();
					return;

				}

				int i=0,n=ls.size();

				while(i<n){

					ref=(NewAccount)ls.get(i);

					if(ref.getNo()==no){
						break;
					}
					i++;

				}

				if(i==n){						//record not found

					ba.setEnabled(true);
					bm.setEnabled(false);
					bd.setEnabled(false);
					t2.setText(null);
					t3.setText("100");
				}
				else{

					if(ref.getState()==false){   //record found but deleted

						t1.setText("0");
						t1.requestFocus();
						return ;

					}

					ba.setEnabled(false);
					bm.setEnabled(true);
					bd.setEnabled(true);

					t2.setText(ref.getName());
					t3.setText(""+ref.getBalance());

				}
			}
			else{

				try{
					oamt = Integer.parseInt(t3.getText());
				}
				catch(Exception ex){
					t3.setText("0");
					t3.requestFocus();
					return;
				}
				if(oamt<100){
					t3.setText("100");
					t3.requestFocus();
					return ;
				}

			}
		}


		public void actionPerformed(ActionEvent e){              //ActionListener

			Button b = (Button)e.getSource();

			if(b==bdisp){
				dlg=new AccountDisplay(this,"Display",true,ls);
				dlg.setVisible(true);
			}
			else{

				nm=t2.getText();

                try{
                	oamt=Integer.parseInt(t3.getText());//New Correction
                }
                catch(Exception ex){

                }

				if(b==ba){

					ref=new NewAccount();
					ref.no=no;
					ref.nm=nm;
					ref.obalance=oamt;
					ref.state=true;
					ls.add(ref);

				}
				if(b==bm){

					ref.nm=nm;
					ref.obalance=oamt;

				}
				if(b==bd){
					ref.state=false;
				}
			}
		}

		public static void main(String[] args) {				//main

				MainAccount mn=new MainAccount();
		}	
	

}