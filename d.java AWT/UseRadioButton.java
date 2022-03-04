import java.awt.*;
import java.awt.event.*;
import mypack.Util;

class UseRadioButton extends Frame implements ActionListener
{
	CheckboxGroup cg1, cg2;
	Button b1, b2;
	Label l1, l2;
	Checkbox c1, c2, c3, c4;
	Checkbox c5, c6, c7, c8;
	
	UseRadioButton()
	{
		super("Radio Button");
		
		l1 = new Label("Year");
		
		cg1 = new CheckboxGroup();
		c1 = new Checkbox("I", cg1, false);
		c2 = new Checkbox("II", cg1, false);
		c3 = new Checkbox("III", cg1, false);
		c4 = new Checkbox("IV", cg1, true);
		
		cg2 = new CheckboxGroup();
		c5 = new Checkbox("Engineering", cg2, false);
		c6 = new Checkbox("BCA", cg2, false);
		c7 = new Checkbox("Commerce", cg2, false);
		c8 = new Checkbox("Arts", cg2, true);
		
		l2 = new Label("Trade");
		
		b1 = new Button("Display");
		b2 = new Button("Exit");
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		setLayout(new FlowLayout());
		
		add(l1);
		add(c1);
		add(c2);
		add(c3);
		add(c4);
		
		add(l2);
		add(c5);
		add(c6);
		add(c7);
		add(c8);
		
		add(b1);
		add(b2);
		
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		
		setSize(400,400);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
		Button b = (Button)e.getSource();
			
		if(b==b2)
			System.exit(0);
		else
		{
			String s = "Year";
			
			Checkbox a = cg1.getSelectedCheckbox();
			s = s + "\n" + a.getLabel();
				
			a = cg2.getSelectedCheckbox();
			s = s + "\n Trade: \n" + a.getLabel();
			Util.display(s);
		}
	}
	
	public static void main(String[] args)
	{
		UseRadioButton a = new UseRadioButton();
	}
}
//from java2022