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
class DrawImage2 extends Frame
{
	MyPanel obj;
	Image img;
	DrawImage2()
	{

		super("Draw Image");
		obj=new MyPanel();
		
		String str="E:/java2022/ss.jpg";

		try
		{
			img=ImageIO.read(new File(str));
		}
		catch(Exception e){}

		obj.setImage(img);

		add(obj);

		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});

		setSize(500,500);
		
		setVisible(true);

	}

	public static void main(String[]args)
	{
		DrawImage2 a=new DrawImage2();
	}

}