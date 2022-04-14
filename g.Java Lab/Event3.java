import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

class Event3 extends Frame implements ActionListener{

	JLabel j1,j2;
	JButton jb1,jb2,jb3;

	Event3(){

		j1 = new JLabel("Select Your Operation:");
		j2 = new JLabel();
		
		jb1 = new JButton("Select");
		jb2 = new JButton("Reset");
		jb3 = new JButton("Ok");

		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);

		add(j1);
		add(jb1);
		add(jb2);
		add(jb3);
		add(j2);

		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,400);

	}

	public void actionPerformed(ActionEvent e){
		JButton jb = (JButton)e.getSource();
		if(jb==jb1){
			j2.setText(jb1.getText());
		}
		else if(jb==jb2){
			j2.setText(jb2.getText());
		}
		else {
			j2.setText(jb3.getText());
		}
	}

	public static void main(String[] args) {
		Event3 e1 = new Event3();
	}

}