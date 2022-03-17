import java.awt.*;
import java.awt.event.*;



class GridBagLayoutPanel extends Frame {

	Panel p;

	GridBagConstraints c;

	GridBagLayoutPanel(){

		super();

		p=new Panel();

		p.setLayout(new GridBagLayout());

		c = new GridBagConstraints();

		c.fill = GridBagConstraints.BOTH;//will incress on both side
		c.insets=new Insets(5,5,5,5);//for gap around all the element

		c.gridx=0;
		c.gridy=0;

		c.gridwidth=4;//
		c.gridheight = 4;//height of btn1 in units

		c.weightx=1.0;
		c.weighty=1.0;

		p.add(new Button("Btn#1"),c);

		c.gridx=4;
		c.gridy=0;

		c.gridwidth=1;//
		c.gridheight = 1;//height of btn2 in units

		c.weightx=0.0;
		c.weighty=0.0;

		p.add(new Button("Btn#2"),c);

		c.gridx=4;
		c.gridy=1;

		c.gridwidth=1;//
		c.gridheight = 1;//height of btn3 in units

		p.add(new Button("Btn#3"),c);

		c.gridx=4;
		c.gridy=2;

		c.gridwidth=1;//
		c.gridheight = 2;//height of btn4 in units

		p.add(new Button("Btn#4"),c);

		c.gridx=0;
		c.gridy=4;

		c.gridwidth=1;//
		c.gridheight = 1;//height of btn5 in units

		p.add(new Button("Btn#5"),c);

		c.gridx=2;
		c.gridy=4;

		c.gridwidth=1;//
		c.gridheight = 1;//height of btn6 in units

		p.add(new Button("Btn#6"),c);

		c.gridx=3;
		c.gridy=4;

		c.gridwidth=2;//
		c.gridheight = 1;//height of btn7 in units

		p.add(new Button("Btn#7"),c);

		c.gridx=1;
		c.gridy=5;

		c.gridwidth=1;//
		c.gridheight = 1;//height of btn8 in units

		p.add(new Button("Btn#8"),c);

		c.gridx=3;
		c.gridy=5;

		c.gridwidth=1;//
		c.gridheight = 1;//height of btn9 in units

		p.add(new Button("Btn#9"),c);

		add(p,BorderLayout.CENTER);

		addWindowListener(new WindowAdapter(){
			public void WindowClosing(WindowEvent e){
				System.exit(0);
			}
		});

		setSize(600,600);
		setVisible(true);

	}

	public static void main(String[] args) {
		GridBagLayoutPanel vx = new GridBagLayoutPanel();
	}
	
}