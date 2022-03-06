
import java.awt.*;
import java.awt.event.*;
import java.applet.*;


public class App4 extends Applet{

	int x,y;
	Image img;

	public void init(){
		addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				x=e.getX();
				y=e.getY();		
				repaint();
			}
		});

		img = getImage(getDocumentBase(),"Image0.jpg");

	}

	
	public void paint(Graphics g){
		g.drawImage(img,20,20,200,200,this);
	}
	
}

/*
<applet code="App4" width=400 height=400>
</applet>
*/