import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class App2 extends Applet{

	int x,y;
	public void init(){
		addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				x=e.getX();
				y=e.getY();
				repaint();//This method will repaint all the applet and then call the paint() method
			}
		});
	}


	public void paint(Graphics g){

		g.drawOval(x,y,20,20);
		//g.fillOval(30,30,20,20);

	}
	
}

/*
<applet code="App2" width=400 height=400>
</applet>
*/