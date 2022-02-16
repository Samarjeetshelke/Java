
import java.awt.*;
import java.awt.event.*;


class Menu1 extends Frame implements ActionListener{

	MenuBar mb;
	Menu m1,m2,m3;
	MenuItem m11,m12,m13;
	MenuItem m21,m22,m23,m24;
	MenuItem m31,m32;

	Menu1(){

		super("Menu");

		m11=new MenuItem("New");
		m12=new MenuItem("Open");
		m13=new MenuItem("Save");

		m11.addActionListener(this);
		m12.addActionListener(this);
		m13.addActionListener(this);

		m1=new Menu("File");

		m1.add(m11);
		m1.add(m12);
		m1.add(m13);

		//File Dropmenu

		m21=new MenuItem("Cut");
		m22=new MenuItem("Copy");
		m23=new MenuItem("Paste");
		m24=new MenuItem("Select");

		m21.addActionListener(this);
		m22.addActionListener(this);
		m23.addActionListener(this);
		m24.addActionListener(this);

		m2=new Menu("Edit");

		m2.add(m21);
		m2.add(m22);
		m2.add(m23);
		m2.add(m24);

		//Edit DropMenu

		m31=new MenuItem("No");
		m32=new MenuItem("Yes");

		//m31.addActionListener(this); no actionPerformed requried

		m32.addActionListener(this);

		m3=new Menu("Exit");

		m3.add(m31);
		m3.add(m32);

		//Exit DropMenu

		mb = new MenuBar();

		mb.add(m1);
		mb.add(m2);
		mb.add(m3);

		setMenuBar(mb);
		setSize(400,400);
		setVisible(true);

	}

	public void actionPerformed(ActionEvent e){

			MenuItem a = (MenuItem)e.getSource();

			if(a==m32){
				System.exit(0);
			}
			else{
				System.out.println(e.getActionCommand());
			}
	}

	public static void main(String[] args) {
			Menu1 a = new Menu1();
	}

}