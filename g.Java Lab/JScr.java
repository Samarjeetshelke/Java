import java.awt.*;
import javax.swing.*;

public class JScr extends JApplet{

	public void start(){
		Container ct = getContentPane();
		String s = "This is text area\n"+"displayed in a scrollpane\n"+"appears with horizontal and\n"+"Vertical scrollbar";

		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;

		JTextArea jt = new JTextArea(s);

		JScrollPane sp = new JScrollPane(jt,v,h);
		ct.add(sp); 
	}
}

/*
	<applet code="JScr" height="200" width="400">
	</applet>
*/