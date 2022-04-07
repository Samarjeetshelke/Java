import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//04/03
class TicTacToo extends JFrame implements ActionListener
{	
	int count = 0;
	JButton []btn;
	JPanel  ju,jc;
	JTextField jf;
	JLabel jl;
	String ply ="X";
	TicTacToo(){
		super("TicTacToo");

		jf = new JTextField();
		ju = new JPanel();
		jc = new JPanel();
		btn = new JButton[9];
		jl =  new JLabel("Let,s Play... "+ply);

		ju.add(jl);
		add(ju,BorderLayout.NORTH);

		jc.setLayout(new GridLayout(3,3,5,5));

		for (int i = 0;i<9 ;i++ ) {
			btn[i]=new JButton();
			btn[i].addActionListener(this);
			jc.add(btn[i]);
		}
		add(jc,BorderLayout.CENTER);
		setSize(400,400);
		setVisible(true);
	}

	public boolean ttext(String a ,String b ,String c){
		if(a.equals(b) && b.equals(c)){
			return true;
		}
		return false;
	}
	public void actionPerformed(ActionEvent e){
		JButton b = (JButton)e.getSource();

		

		if(b == btn[0]){
			btn[0].setText(ply);
			btn[0].setEnabled(false);
			count++;
			btn[0].setForeground(Color.BLACK);
		}else if(b == btn[1]){
			btn[1].setText(ply);
			btn[1].setEnabled(false);
			count++;
			btn[1].setForeground(Color.BLACK);
		}else if(b == btn[2]){
			btn[2].setText(ply);
			btn[2].setEnabled(false);
			count++;
			btn[2].setForeground(Color.BLACK);
		}else if(b == btn[3]){
			btn[3].setText(ply);
			btn[3].setEnabled(false);
			count++;
			btn[3].setForeground(Color.BLACK);
		}else if(b == btn[4]){
			btn[4].setText(ply);
			btn[4].setEnabled(false);
			count++;
			btn[4].setForeground(Color.BLACK);
		}else if(b == btn[5]){
			btn[5].setText(ply);
			btn[5].setEnabled(false);
			count++;
			btn[5].setForeground(Color.BLACK);
		}else if(b == btn[6]){
			btn[6].setText(ply);
			btn[6].setEnabled(false);
			count++;
			btn[6].setForeground(Color.BLACK);
		}else if(b == btn[7]){
			btn[7].setText(ply);
			btn[7].setEnabled(false);
			count++;
			btn[7].setForeground(Color.BLACK);
		}else {
			btn[8].setText(ply);
			btn[8].setEnabled(false);
			count++;
			btn[8].setForeground(Color.BLACK);
		}
		if(ply == "O"){
			ply = "X";
		}
		else{
			ply ="O";
		}
		if(count > 4){
			if(ttext(btn[0].getText(),btn[1].getText(),btn[2].getText())){
				btn[0].setBackground(Color.GREEN);
				btn[1].setBackground(Color.GREEN);
				btn[2].setBackground(Color.GREEN);
				if(ply == "O"){
					ply = "X";
				}
				else{
					ply ="O";
				}
				jl.setText("You Win....."+ply);
				for(int i = 0;i<9;i++){
					btn[i].setEnabled(false);
				}
		 		return;
			}
		}
		
		jl.setText("Let,s Play... "+ply);
	}
	public static void main(String[] args) {
		new TicTacToo();
	}
}