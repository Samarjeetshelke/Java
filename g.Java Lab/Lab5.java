import javax.swing.event.*;
import java.awt.*;
import javax.swing.*;

class  Lab5  extends Frame implements ListSelectionListener{

	
	JLabel l;
	JList jl;

	Lab5(){
		super("Lab5");

		String dis[]={"Sangli","Kolhapur","Miraj","Solapur"};

		jl=new JList(dis);

		l=new JLabel("Please select any city : ");

		jl.addListSelectionListener(this);

		add(jl);
		add(l);

		setLayout(new FlowLayout());

		setSize(400,400);
		setVisible(true);
	}

	public void valueChanged(ListSelectionEvent e)
    {
        
        l.setText((String)jl.getSelectedValue());
         
    }
	public static void main(String[] args) {
		Lab5 lb = new Lab5();
	}
	
}