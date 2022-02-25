//24-feb-2022 
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.awt.image.*;
import javax.imageio.ImageIO;
class DrawImage1 extends Frame 
{
	Image img;
	DrawImage1()
	{
		super("Draw Image");
		String str="D:\\java2122\\Image0.jpg";
		try
		{
			img=ImageIO.read(new File(str));
		}
		catch(Exception e){}
		setSize(500,500);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		setVisible(true);
	}
	public void paint(Graphics g)
	{
		g.drawImage(img,10,10,380,380,this);
	}
	public static void main(String[]args)
	{
		DrawImage1 a=new DrawImage1();
	}
}