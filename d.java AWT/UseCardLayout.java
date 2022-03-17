//15-3-2022
//use of CardLayout.
import java.awt.*;
import java.awt.event.*;
import mypack.Util;

class Panel1 extends Panel implements ActionListener
{
	Label lno,lnm;
	TextField tno,tnm;
	Button b1,b2;
	Panel1()
	{
		super();
		lno=new Label("No");
		lnm=new Label("Name");
		tno=new TextField(10);
		tnm=new TextField(30);
		b1=new Button("Ok");
		b2=new Button("Clear");
		b1.addActionListener(this);
		b2.addActionListener(this);
		setLayout(new GridLayout(3,2,5,5));
		add(lno);
		add(tno);
		add(lnm);
		add(tnm);
		add(b1);
		add(b2);
		setSize(400,400);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		Button b=(Button)e.getSource();
		if(b==b1)
		{
			String s="Roll no: "+tno.getText()+"\n Name: "+tnm.getText();
			Util.display(s);
		}
		tno.setText("");
		tnm.setText("");
	}
}

class Panel2 extends Panel implements ActionListener
{
	Label city;
	List obj;
	Button b1,b2;
	Panel2()
	{
		super();
		city=new Label("City");
		obj=new List(10,true);//true is for multiselection.
		b1=new Button("Select");
		b2=new Button("Deselect");
		b1.addActionListener(this);
		b2.addActionListener(this);
		obj.add("Miraj");
		obj.add("Sangli");
		obj.add("Karad");
		obj.add("Satara");
		obj.add("Solapur");
		obj.add("Kolhapur");
		obj.add("Pune");
		obj.add("Chiplun");
		obj.add("Ratnagiri");
		obj.add("Pandharpur");
		add(city);
		add(obj);
		add(b1);
		add(b2);
		setSize(400,400);
		setVisible(true);

	}
	public void actionPerformed(ActionEvent e)
	{
		Button b=(Button)e.getSource();
		if(b==b1)
		{
			int i=0,n=obj.getItemCount();
			while(i<n)
			{
              if(obj.isIndexSelected(i))
              	Util.display(obj.getItem(i));
              i++;
			}
		}
		else
		{
			int i=0,n=obj.getItemCount();
			while(i<n)
			{
				if(obj.isIndexSelected(i))
					obj.deselect(i);
				i++;
			}
		}

	}
}

class Panel3 extends Panel implements ActionListener
{
	Label area;
	Checkbox c1,c2,c3,c4,c5;
	Button b1,b2;
	Panel3()
	{
		super();
		area=new Label("Area");
		c1=new Checkbox("East");
		c2=new Checkbox("West");
		c3=new  Checkbox("North");
		c4=new Checkbox("South");
		c5=new Checkbox("Center");
		b1=new Button("Select");
		b2=new Button("Deselect");
		b1.addActionListener(this);
		b2.addActionListener(this);
		add(area);
		add(c1);
		add(c2);
		add(c3);
		add(c4);
		add(c5);
		add(b1);
		add(b2);
		setSize(400,400);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		Button b=(Button)e.getSource();
		if(b==b1)
		{
			String s="Area";
			if(c1.getState())
				s=s+"\n"+c1.getLabel();
			if(c2.getState())
				s=s+"\n"+c2.getLabel();
			if(c3.getState())
				s=s+"\n"+c3.getLabel();
			if(c4.getState())
				s=s+"\n"+c4.getLabel();
			if(c5.getState())
				s=s+"\n"+c5.getLabel();
			
			Util.display(s);

		}
		c1.setState(false);
		c2.setState(false);
		c3.setState(false);
		c4.setState(false);
		c5.setState(false);
	}

}
 public class UseCardLayout extends Frame implements ActionListener
 {
 	Panel main,south;
 	Panel1 p1;
 	Panel2 p2;
 	Panel3 p3;
 	CardLayout cl;
 	Button b1,b2,b3;
 	UseCardLayout()
 	{
 		super("CardLayout");
 		b1=new Button("Student");
 		b2=new Button("city");
 		b3=new Button("Area");
 		b1.addActionListener(this);
 		b2.addActionListener(this);
 		b3.addActionListener(this);

 		south=new Panel();
 		south.add(b1);
 		south.add(b2);
 		south.add(b3);
 		add(south,BorderLayout.SOUTH);

 		main=new Panel();
 		p1=new Panel1();
 		p2=new Panel2();
 		p3=new Panel3();
 		cl=new CardLayout(20,20);
 		main.setLayout(cl);
 		main.add(p1,"student");
 		main.add(p2,"city");
 		main.add(p3,"area");
 		add(main,BorderLayout.CENTER);
 		addWindowListener(new WindowAdapter()
 		{
 			public void windowClosing(WindowEvent e)
 			{
 				System.exit(0);
 			}
 		});
 		setSize(500,500);
 		setVisible(true);

 	}
 	public void actionPerformed(ActionEvent e)
 	{
 		Button b=(Button)e.getSource();
 		if(b==b1)
 			cl.show(main,"student");
 		if(b==b2)
 			cl.show(main,"city");
 		if(b==b3)
 			cl.show(main,"area");
 	}
 	public static void main(String[]args)
 	{
 		UseCardLayout a=new UseCardLayout();
 	}

 }

