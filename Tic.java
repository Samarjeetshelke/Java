import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.Color;

class Tic extends Frame implements ActionListener{
	JFrame fr;
	JPanel jp,jp2;
	JTextArea jt;
	int p=0;
	JButton q,b1,b2;
	int cnt=0;
	JButton[] j=new JButton[9];

	Tic(){

		super("Tic-Tac-Toe");
		fr = new JFrame();
		jp = new JPanel();
		jp2 = new JPanel();
		b1 = new JButton("Reset");
		b2 = new JButton("Start");

		jp2.add(b2);
		jp2.add(b1);

		jt = new JTextArea("Let's Play..");
		jt.setFont(new Font("Arial",Font.PLAIN,34));
		jt.setColumns(30);
		jt.setEditable(false);
		

		for(int i=0;i<9;i++){
			j[i]=new JButton("");
			jp.add(j[i]);
			j[i].setFont(new Font("Arial",Font.PLAIN,24));
			j[i].addActionListener(this);
			j[i].setForeground(Color.red);
		}
		

		fr.add(jt,BorderLayout.NORTH);
		jp.setLayout(new GridLayout(3,3,3,3));
		fr.add(jp,BorderLayout.CENTER);
		fr.add(jp2,BorderLayout.SOUTH);
		
		fr.setVisible(true);
		fr.setSize(300,400);

	}

	public void actionPerformed(ActionEvent e){
		q = (JButton)e.getSource();

		

		if(p==0){
			cnt++;
			jt.setText("Play O!");
			q.setText("X");
			q.setForeground(Color.red);
			if(cnt>2){
				checkisWin();
				
			}

			
			
			q.setEnabled(false);
			p=1;
		}
		else{
			cnt++;
			jt.setText("Play X!");
			q.setText("O");
			q.setForeground(Color.blue);
			if(cnt>2){
				checkisWin();
				
			}

			
			
				
			q.setEnabled(false);
			p=0;
		}

	}

	public void checkisWin() {
   
    for (int i = 0; i < 3; i++) {
        if (!j[i * 3].getText().isEmpty() && j[i * 3].getText().equals(j[i * 3 + 1].getText()) && j[i * 3 + 1].getText().equals(j[i * 3 + 2].getText())) {
            jt.setText("Player " + j[i * 3].getText() + " wins!");
            j[i * 3].setBackground(Color.GREEN);
            j[i * 3 + 1].setBackground(Color.GREEN);
            j[i * 3 + 2].setBackground(Color.GREEN);
            displaywin(j[i * 3].getText());
            return;
        }
    }

    
    for (int i = 0; i < 3; i++) {
        if (!j[i].getText().isEmpty() && j[i].getText().equals(j[i + 3].getText()) && j[i + 3].getText().equals(j[i + 6].getText())) {
            jt.setText("Player " + j[i].getText() + " wins!");
            j[i].setBackground(Color.GREEN);
            j[i +3].setBackground(Color.GREEN);
            j[i +6].setBackground(Color.GREEN);
            displaywin(j[i].getText());
            return;
        }
    }

    
    if (!j[0].getText().isEmpty() && j[0].getText().equals(j[4].getText()) && j[4].getText().equals(j[8].getText())) {
        jt.setText("Player " + j[0].getText() + " wins!");
        j[0].setBackground(Color.GREEN);
            j[4].setBackground(Color.GREEN);
            j[8].setBackground(Color.GREEN);
        displaywin(j[0].getText());
        return;
    }

    if (!j[2].getText().isEmpty() && j[2].getText().equals(j[4].getText()) && j[4].getText().equals(j[6].getText())) {
        jt.setText("Player " + j[2].getText() + " wins!");
        j[2].setBackground(Color.GREEN);
            j[4].setBackground(Color.GREEN);
            j[6].setBackground(Color.GREEN);
        displaywin(j[2].getText());
        return;
    }

    if (cnt >= 9) {
        jt.setText("It's a Tie!");
    }
}

	public static void main(String[] args) {
		new Tic();
	}

	public void displaywin(String ans){
		for(int i =0;i<9;i++){
			j[i].setEnabled(false);
		}
	}

}