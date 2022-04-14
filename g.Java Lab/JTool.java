import javax.swing.*;
import java.awt.*;

class JTool extends JFrame {

	JToolBar jb;
	JButton b1,b2;
	JComboBox jbx;
	JPanel jl;

	JTool(){

		jb = new JToolBar();

		b1 = new JButton("Open");
		b2 = new JButton("Close");
		jbx = new JComboBox(new String[] { "Select Language","Java", "C#", "C", "C++" }); 

		jl = new JPanel();

		jb.add(b1);
		jb.add(b2);
		jb.add(jbx);

		//jl.add(jb);

		//add(jl);
		add(jb, BorderLayout.NORTH);

		setSize(400,400);
		setVisible(true);

	}
	public static void main(String[] args) {
		JTool jtl = new JTool();
	}

}

//JToolbar and JMenu