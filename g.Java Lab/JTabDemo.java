import java.awt.*;
import javax.swing.*;

class pn1 extends JPanel{
	public pn1(){

		JCheckBox jcb1 = new JCheckBox("Red");
		JCheckBox jcb2 = new JCheckBox("Blue");
		JCheckBox jcb3 = new JCheckBox("Green");
		JCheckBox jcb4 = new JCheckBox("Yellow");

		add(jcb1);
		add(jcb2);
		add(jcb3);
		add(jcb4);

	}
}

class pn2 extends JPanel{
	public pn2(){
		JButton jb1 = new JButton("Chocolate");
		JButton jb2 = new JButton("Vanila");
		JButton jb3 = new JButton("Str");
		JButton jb4 = new JButton("Pineapple");
		add(jb1);
		add(jb2);
		add(jb3);
		add(jb4);
	}
}

class pn3 extends JPanel{
	public pn3(){
		JComboBox jcbb = new  JComboBox();
		jcbb.addItem("Cirle");
		jcbb.addItem("Oval");
		jcbb.addItem("Rectangle");
		jcbb.addItem("Square");
		add(jcbb);
	}
}

public class JTabDemo extends JApplet{
	public void start(){
		Container ct = getContentPane();
		JTabbedPane jtp = new JTabbedPane();

		jtp.addTab("Colors",new pn1());
		jtp.addTab("Flavours",new pn2());
		jtp.addTab("Shapes",new pn3());
		ct.add(jtp);
	}
}
/*
	<applet code="JTabDemo" height="200" width="400">
	</applet>
*/