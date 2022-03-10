import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class  Lab6  extends Frame implements ActionListener{

	JLabel jl;
	JComboBox c;
	JButton jb;

	Lab6(){
		super("Lab5");

		String dis[]={"Select","Sangli","Kolhapur","Miraj","Solapur"};

		jl=new JLabel("Please Select?");
		c=new JComboBox(dis);
		jb=new JButton("Submit");

		jb.addActionListener(this);

		add(c);
		
		add(jb);
		add(jl);

	 	setLayout(new FlowLayout());

		setSize(400,400);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e){

		jl.setText("You select:"+(String)c.getItemAt(c.getSelectedIndex()));

	}
	public static void main(String[] args) {
		Lab6 lb = new Lab6();
	}
	
}