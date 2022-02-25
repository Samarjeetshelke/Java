import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.awt.image.*;
import javax.imageio.ImageIO;

class MyPanel extends Panel
{

	Image img;

	MyPanel()
	{
		super();
	}

	void setImage(Image i)
	{
		img=i;
		repaint();
	}

	public void paint(Graphics g)
	{
		g.drawImage(img,0,0,this);
	}

}

class DrawImage3 extends Frame implements ActionListener{

	MyPanel pan;
	Button bf,bl,bp,bn;

	Panel ps;
	Image[]img;

	int i;


	DrawImage3(){

		super("Slide Show");

		pan = new MyPanel();

		add(pan,BorderLayout.CENTER);

		bf=new Button("|<");
		bl=new Button(">|");
		bn=new Button(">>");
		bp=new Button("<<");

		bf.addActionListener(this);
		bp.addActionListener(this);
		bn.addActionListener(this);
		bl.addActionListener(this);

		ps = new Panel();

		ps.add(bf);
		ps.add(bp);
		ps.add(bn);
		ps.add(bl);

		add(ps,BorderLayout.SOUTH);

		img=new Image[10];

		for(i=0;i<10;i++){

			try{
				img[i]=ImageIO.read(new File("Image"+i+".jpg"));
			}
			catch (Exception e) {
				
			}

		}

		i=0;

		pan.setImage(img[i]);

		addWindowListener(new WindowAdapter(){

			public void windowClosing(WindowEvent e){
				System.exit(0);
			}

		});

		setSize(400,400);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e){

		Button b =(Button)e.getSource();

		if (b==bf) {
			i=0;	
		}
		if(b==bl){
			i=9;
		}
		if(b==bp){
			if(--i<0){
				i=0;
			}
		}
		if(b==bn){
			if(++i>9){
				i=9;
			}
		}

		pan.setImage(img[i]);

	}

	public static void main(String[] args) {
		DrawImage3 a=new DrawImage3();
	}
}