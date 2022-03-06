
import java.awt.*;
import java.awt.event.*;
import java.applet.*;


public class App3 extends Applet{

	int x,y;

	public void draw(){
		Graphics g = getGraphics();
		g.setColor(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));//This will generate the random color 
		g.drawOval(x,y,20,20);
	}

	public void init(){
		addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				x=e.getX();
				y=e.getY();		
				draw();
			}
		});
	}

	
	public void paint(Graphics g){

	}
	
}

/*
<applet code="App3" width=400 height=400>
</applet>
*/