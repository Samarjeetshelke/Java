import javax.swing.*;
import java.awt.*;
import  java.awt.event.*;


class GridBag extends JFrame {

	JPanel p;
	GridBagConstraints c;

	GridBag(){
		super("Samarjeet Shelke");

		p=new JPanel();

		p.setLayout(new GridBagLayout());

		c = new GridBagConstraints();

		c.fill = GridBagConstraints.BOTH;//will incress on both side
		c.insets=new Insets(5,5,5,5);//for gap around all the element

	c.gridx = 0;  
    c.gridy = 0;  
    p.add(new Button("Button One"), c);  
    c.gridx = 1;  
    c.gridy = 0;  
    p.add(new Button("Button two"), c);  
    c.fill = GridBagConstraints.HORIZONTAL;  
    c.ipady = 20;  
    c.gridx = 0;  
    c.gridy = 1;  
    p.add(new Button("Button Three"), c);  
    c.gridx = 1;  
    c.gridy = 1;  
    p.add(new Button("Button Four"), c);  
    c.gridx = 0;  
    c.gridy = 2;  
    c.fill = GridBagConstraints.HORIZONTAL;  
    c.gridwidth = 2;  
    p.add(new Button("Button Five"), c);  


		add(p,BorderLayout.CENTER);

		addWindowListener(new WindowAdapter(){
			public void WindowClosing(WindowEvent e){
				System.exit(0);
			}
		});

		setSize(400,400);
		setVisible(true);

	}
	public static void main(String[] args) {
		GridBag jtl = new GridBag();
	}

}

//JToolbar and JMenu