import java.awt.*;
import java.awt.event.*;
import mypack.Util;
class UseList extends Frame implements ActionListener 
{
	List obj;
	Label caption;
	Button ba,br,bd,bx;
	UseList()
	{
		super("List");
		caption=new Label("City");
		obj=new List(10,false);
		ba=new Button("ADD");
		br=new Button("REM");
		bd=new Button("DISP");
		bx=new Button("EXIT");

		ba.addActionListener(this);
		br.addActionListener(this);
		bd.addActionListener(this);
		bx.addActionListener(this);

		setLayout(null);

		caption.setBounds(50,50,100,20);
		
		obj.setBounds(50,80,100,95);

		ba.setBounds(170,80,50,20);
		br.setBounds(170,105,50,20);
		bd.setBounds(170,130,50,20);
		bx.setBounds(170,155,50,20);

		add(caption);
		add(obj);
		add(ba);
		add(br);
		add(bd);
		add(bx);
		setSize(270,225);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		Button b=(Button)e.getSource();
		if(b==ba)
			obj.add(Util.sInput("City Name"));
		if(b==br)
		{
			int pos=obj.getSelectedIndex();
			if(pos!=-1)
				obj.remove(pos);
		}
		if(b==bx)
			System.exit(0);
		if(b==bd)
		{
			for(int i=0;i<obj.getItemCount();i++)
				Util.display(obj.getItem(i));
		}
	}
	public static void main(String[] args)
	{
		UseList d=new UseList();
	}
}
//from java2022