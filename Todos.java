import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class Todos extends Frame implements ActionListener{
	
	static JButton jb1,jb2,jre,jst;
	static int totc=0;
	JPanel jp1;
	static JCheckBox[] todo;
	static JPanel jp2,jp3;
	static JTextField jt1;
	JLabel jl ;
	static Vector<String> vc = new Vector<String>();
	static Scanner sc = new Scanner(System.in);

	Todos(){
		
		super("To-Do-List");

		Color mycolor = new Color(3, 244, 252);

		jp1 = new JPanel();
		jp2 = new JPanel();
		jp3 = new JPanel();
		jb1 = new JButton("AddTask");
		jt1 = new JTextField("",16);
		jl = new JLabel("Tow");
		jre = new JButton("Refresh");
		jst = new JButton("States");


		jb1.addActionListener(this);
		jre.addActionListener(this);
		jst.addActionListener(this);

		jp1.add(jt1);
		jp1.add(jb1);
		jp3.add(jre);
		jp3.add(jst);

		jp2.setBackground(mycolor);

		add(jp1,BorderLayout.NORTH);
		add(jp2,BorderLayout.CENTER);
		add(jp3,BorderLayout.SOUTH);
		//setLayout();
		setVisible(true);
		setSize(300,300);

	}

	public static void completetodo(){
		totc=0;
		for(int i=0;i<vc.size();i++){

			if(todo[i].isSelected()){
				totc++;
				i--;
			}	

		}
	}
	public static void refreshtodo(){

		for(int i=0;i<vc.size();i++){

			if(todo[i].isSelected()){
				todo[i].setSelected(false);
				vc.remove(i);
				i--;
			}	

		}
	}
	public static void addtodo(){

		todo = new JCheckBox[vc.size()];

		jt1.setText("");
		jp2.removeAll();

		for(int i =0;i<vc.size();i++){

			todo[i]= new JCheckBox(vc.get(i));
			todo[i].setVerticalAlignment(JCheckBox.CENTER);
			todo[i].setFont(new Font("Arial",Font.PLAIN,20));
			jp2.add(todo[i]);

		}

		jp2.setLayout(new BoxLayout(jp2,BoxLayout.Y_AXIS));
		jp2.revalidate();
        jp2.repaint();
	}



	public void actionPerformed(ActionEvent e){

		JButton j = (JButton)e.getSource();

		if(j==jre){

				System.out.println("its jreeee");
				refreshtodo();

		}
		else if(j==jst){

			completetodo();

			 JOptionPane.showMessageDialog(this,"Total: "+vc.size()+"   Completed: "+totc+"  Success Rate: "+( totc>0?((totc/vc.size())*100):0)); 
			 System.out.println("jstat"); 
		}
		else{
			vc.add(jt1.getText());	
		}	
			display();	
			addtodo();
		
	}
	public static void display(){

		for (int i =0;i<vc.size() ;i++ ) {

			System.out.println(vc.get(i));

		}
	}
	public static void main(String[] args) {

		Todos t = new Todos();
		
	}
}
