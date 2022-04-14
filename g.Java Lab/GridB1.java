
import javax.swing.*;
import javax.swing.event.*;

class GridB1 extends Frame{

	JLabel l1,l2;
	JTextField jt;
	JTextArea ja;
	JButton jb;
	JPanel p;
	GridBagConstraints c;

	GridB1(){

		l1 = new JLabel("Name");
		l2 = new JLabel("Comment");

		jt = new JTextField();
		ja = new JTextArea();

		jb = new JButton("Submit");

		p = new JPanel();

		p.setLayout(new GridBagLayout());

		c = new GridBagConstraints();

		c.fill = GridBagConstraints.BOTH;
		c.insets = new insets();

		c.gridx = 0;  
  	  	c.gridy = 0;  

  	  	p.add(l1, c);  
		
  	  	add(p);
  	  	
		setVisible(true);
		setSize(400,400);

	}

	public static void main(String[] args) {
		GridB1 h = new GridB1();
	}
}