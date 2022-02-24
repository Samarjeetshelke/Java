//23-2-2022 draw rectangle with two point method.
import java.awt.*;
import java.awt.event.*;
class Frm17 extends Frame 
{
   int x,y,w,h,flg;
   
   Frm17()
   {
   	super("Mouse Events");
      flg=0;
   	
   	addWindowListener(new WindowAdapter()
   	{
   		public void windowClosing(WindowEvent e)
   		{
   			System.exit(0);
   		}
   	});
   	addMouseListener(new MouseAdapter()
   	{
   		public void mouseClicked(MouseEvent e)
   		{
            if(flg==0)
            {
               x=e.getX();
               y=e.getY();
               flg=1;
            }
            else
            {
               w=e.getX()-x;
               h=e.getY()-y;
               display();
               flg=0;
            }
   			
   		}
   	});
	   setSize(400,400);
	   setVisible(true);
   }
   void display()
   {
   	int a=(int)(Math.random()*255);
      int b=(int)(Math.random()*255);
      int c=(int)(Math.random()*255);
      Graphics g=getGraphics();//this is method or subclass of frame used to graphics or design in frame.
      g.setColor(new Color(a,b,c));
      g.drawRect(x,y,w,h);
   }
   public static void main(String[]args)
   {
   	Frm17 a=new Frm17();
   }
}