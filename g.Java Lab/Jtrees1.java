import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

class Jtrees1 extends JFrame {

	Jtrees1(){

		super("JTrees");

		
		

		DefaultMutableTreeNode first = new DefaultMutableTreeNode("This Pc");

		DefaultMutableTreeNode a = new DefaultMutableTreeNode("OS(C:)");
		DefaultMutableTreeNode b= new DefaultMutableTreeNode("DATA(D:)");
		DefaultMutableTreeNode c= new DefaultMutableTreeNode("Study(E:)");

		first.add(a);
		first.add(b);
		first.add(c);

		DefaultMutableTreeNode d= new DefaultMutableTreeNode("Programs");
		DefaultMutableTreeNode e= new DefaultMutableTreeNode("XXAMP");
		DefaultMutableTreeNode f = new DefaultMutableTreeNode("User");
		DefaultMutableTreeNode g= new DefaultMutableTreeNode("TURBOC3");
		DefaultMutableTreeNode h= new DefaultMutableTreeNode("APPS");

		a.add(d);
		a.add(e);
		a.add(f);
		a.add(g);
		a.add(h);

		DefaultMutableTreeNode i = new DefaultMutableTreeNode("Songs");
		DefaultMutableTreeNode j= new DefaultMutableTreeNode("Series");
		DefaultMutableTreeNode k= new DefaultMutableTreeNode("Software");

		b.add(i);
		b.add(j);
		b.add(k);


		DefaultMutableTreeNode l = new DefaultMutableTreeNode("LabJava");
		DefaultMutableTreeNode m= new DefaultMutableTreeNode("Java");
		DefaultMutableTreeNode n= new DefaultMutableTreeNode("Notes");

		c.add(l);
		c.add(m);
		c.add(n);

		

		
		JTree t = new JTree(first);
		add(t);
		//ctr.add(t);

		//add(ctr,BorderLayout.CENTER);

		//setLayout(new FlowLayout());
		setSize(400,400);
		setVisible(true);
	}

	public static void main(String[] args) {
		Jtrees1 jt = new Jtrees1();
	}
}