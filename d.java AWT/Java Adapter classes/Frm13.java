//Study of mouse events
import java.awt.*;
import java.awt.event.*;

class Frm13 extends Frame implements MouseListener ,MouseMotionListener{

	Frm13(){

		super("Adapter class and MouseListener");

		addWindowListener(new WindowAdapter (){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});

		addMouseListener(this);
		addMouseMotionListener(this);
		setSize(400,400);
		setVisible(true);
	}

	public void mouseEntered(MouseEvent e){
		System.out.println("Entered");
	}

	public void mouseExited(MouseEvent e){
		System.out.println("Exited");
	}

	public void mousePressed(MouseEvent e){
		System.out.println("Pressed");
	}

	public void mouseReleased(MouseEvent e){
		System.out.println("Relesed");
	}

	public void mouseClicked(MouseEvent e){
		System.out.println("Clicked");
	}
	public void mouseMoved(MouseEvent e){
		System.out.println("Moved");
	}

	public void mouseDragged(MouseEvent e){
		System.out.println("Dragged");
	}

	public static void main(String[] args) {
		Frm13 a = new Frm13();
	}

}