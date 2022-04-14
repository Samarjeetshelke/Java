import java.awt.*;
import javax.swing.*;

public class JScr1 extends JApplet{

	public void start(){
		Container ct = getContentPane();
		String s = "This is text area\n"+"displayed in a scrollpane\n"+"appears with horizontal and\n"+"Vertical scrollbar";

		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;

		JTextArea jt = new JTextArea(s);

		JScrollPane sp = new JScrollPane(jt,v,h);
		ct.add(sp); 
	}
}

/*
	<applet code="JScr1" height="200" width="400">
	</applet>
*/