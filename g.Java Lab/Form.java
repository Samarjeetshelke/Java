import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;



class Form extends JFrame{

	JTextField t1,t2,t3,t4;
	JLabel l1,l2,l3,l4,l5;
	JRadioButton r1,r2,r3;
	JCheckBox ch1,ch2,ch3,ch4;
	JComboBox c;
	ButtonGroup b;
	Form(){

		super("R Form");

		b = new ButtonGroup();
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		t3 = new JTextField(10);//TextFildes
		t4 = new JTextField(10);

		l1 = new JLabel("Name :");
		l2 = new JLabel("Roll No :");
		l3 = new JLabel("Gender :");//Label
		l4 = new JLabel("Subject :");
		l5 = new JLabel("Year :");

		r1 = new JRadioButton("Male");
		r2 = new JRadioButton("Female");
		r3 = new JRadioButton("Other");//RadioButton For Gender

		ch1 = new JCheckBox("C");
		ch2 = new JCheckBox("C++");
		ch3 = new JCheckBox("Java");//CheckBox
		ch4 = new JCheckBox("Cloud C");

		String[] el = {"Select One","First Year","Second Year","Third Year"};

		c = new JComboBox(el);

		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(r1);
		add(r2);
		add(r3);
		add(l4);
		add(ch1);
		add(ch2);
		add(ch3);
		add(ch4);
		add(l5);
		add(c);

		setLayout(new FlowLayout());
		setSize(400,400);
		setVisible(true);
	}

	public static void main(String[] args) {
		Form f1 = new Form();
	}
}