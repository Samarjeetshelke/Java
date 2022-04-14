import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

class Jtable extends JFrame {

	Jtable(){
		String head[] = {"Id","Name","Percentage","Grade"};

		String row[][] = {{"1","Samarjeet","91%","A+"},{"2","Sushant","95%","A+"},{"3","Sarvesh","98%","A+"},{"4","Manish","94%","A+"},{"5","Ashwin","97%","A+"},{"6","Harish","70%","B"},{"7","Riya","50%","C"},{"8","Steve","84%","B+"},{"9","Tony Stark","99%","A+"},{"10","Sia","60%","C"}};

		JTable jt = new JTable(row,head);	
	
		JScrollPane js = new JScrollPane(jt);
		add(js);
		//setLayout();
		setSize(400,400);
		setVisible(true);
	}

	public static void main(String[] args) {
		Jtable x = new Jtable();
	}

}