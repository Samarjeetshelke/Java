import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

class Event2 extends Frame implements ItemListener{

	JLabel j1,j2;
	JCheckBox c1,c2,c3,c4,c5;
	String s="Your Selected Languages are:";

	Event2(){
		j1 = new JLabel("Select Your Languages:");
		j2 = new JLabel();

		c1 = new JCheckBox("Marathi");
		c2 = new JCheckBox("Sanskrit");
		c3 = new JCheckBox("English");
		c4 = new JCheckBox("Hindi");
		c5 = new JCheckBox("Spanish");
	
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		c4.addItemListener(this);
		c5.addItemListener(this);

		add(j1);
		add(c1);
		add(c2);
		add(c3);
		add(c4);
		add(c5);
		add(j2);	

		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,400);

	}

	public void itemStateChanged(ItemEvent e) {  
		JCheckBox jbx = (JCheckBox)e.getSource();



		if(jbx==c1){
			s = s+"  Marithi";
			//j2.setText("Marithi");
		}
		if(jbx==c2){
			s = s+"  Sanskrit";
		}
		if(jbx==c3){
			s = s+"  English";
		}
		if(jbx==c4){
			s = s+"  Hindi";
		}
		if(jbx==c5){
			s = s+"  Spanish";
		}

		j2.setText(s);
	}

	public static void main(String[] args) {
		Event2 e1 = new Event2();
	}

}