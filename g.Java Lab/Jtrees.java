import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

class Jtrees extends JFrame {

	Jtrees(){
		super("JTrees");

		DefaultMutableTreeNode first = new DefaultMutableTreeNode("Samarjeet");

		DefaultMutableTreeNode a = new DefaultMutableTreeNode("Java");
		DefaultMutableTreeNode b= new DefaultMutableTreeNode("Photos");
		DefaultMutableTreeNode c= new DefaultMutableTreeNode("Movies");

		first.add(a);
		first.add(b);
		first.add(c);

		DefaultMutableTreeNode d= new DefaultMutableTreeNode("Hindi");
		DefaultMutableTreeNode e= new DefaultMutableTreeNode("English");

		c.add(d);
		c.add(e);
		JTree t = new JTree(first);
		add(t);
		setLayout(new FlowLayout());
		setSize(400,400);
		setVisible(true);
	}

	public static void main(String[] args) {
		Jtrees jt = new Jtrees();
	}
}