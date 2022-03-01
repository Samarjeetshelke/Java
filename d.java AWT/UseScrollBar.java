/* Use of Scroll Bar */

import java.awt.*;
import java.awt.event.*;

public class UseScrollBar extends Frame implements ActionListener, FocusListener, AdjustmentListener
{
	Label lr, lg, lb, lclr;
	TextField tr, tg, tb;
	Panel pr, pg, pb, pclr;
	Button bs, bi;
	int r,g,b;
	Color cr;
	Scrollbar sr, sg, sb;
	
	UseScrollBar()
	{
		super("ScrollBar");
		
		lr = new Label("R");
		lg = new Label("G");
		lb = new Label("B");
		lclr = new Label("Color");
		
		sr = new Scrollbar(Scrollbar.VERTICAL, 0, 10, 0, 255);
		sg = new Scrollbar(Scrollbar.VERTICAL, 0, 10, 0, 255);
		sb = new Scrollbar(Scrollbar.VERTICAL, 0, 10, 0, 255);
		
		sr.addAdjustmentListener(this);
		sg.addAdjustmentListener(this);
		sb.addAdjustmentListener(this);
		
		tr = new TextField(5);
		tg = new TextField(5);
		tb = new TextField(5);
		
		tr.addFocusListener(this);
		tg.addFocusListener(this);
		tb.addFocusListener(this);
		
		pr = new Panel();
		pg = new Panel();
		pb = new Panel();
		pclr = new Panel();
		
		bs = new Button("Select");
		bi = new Button("Init");
		
		bs.addActionListener(this);
		bi.addActionListener(this);
		
		setLayout(null);
		lr.setBounds(50,50,50,20);
		sr.setBounds(50,80,50,200);
		tr.setBounds(50,290,50,20);
		pr.setBounds(50,320,50,20);
		
		lg.setBounds(120,50,50,20);
		sg.setBounds(120,80,50,200);
		tg.setBounds(120,290,50,20);
		pg.setBounds(120,320,50,20);
		
		lb.setBounds(190,50,50,20);
		sb.setBounds(190,80,50,200);
		tb.setBounds(190,290,50,20);
		pb.setBounds(190,320,50,20);
		
		lclr.setBounds(260,50,100,20);
		pclr.setBounds(260,80,100,200);
	
		bs.setBounds(260,290,50,20);
		bi.setBounds(260,320,50,20);
		
		add(lr);
		add(lg);
		add(lb);
		add(lclr);
		
		add(sr);
		add(sg);
		add(sb);
		add(pclr);
		
		add(tr);
		add(tg);
		add(tb);
		add(bs);
		
		add(pr);
		add(pg);
		add(pb);
		add(bi);
		
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		
		setSize(410,390);
		setVisible(true);
	}
	
	public void adjustmentValueChanged(AdjustmentEvent e)
	{
		r = sr.getValue();
		g = sg.getValue();
		b = sb.getValue();
		
		tr.setText("+R");
		tg.setText("+G");
		tb.setText("+B");
		
		cr = new Color(r,g,b);
		pclr.setBackground(cr);
		pr.setBackground(new Color(r,0,0));
		pg.setBackground(new Color(0,g,0));
		pb.setBackground(new Color(0,0,b));
	}

	public void focusGained(FocusEvent e){

	}

	public void focusLost(FocusEvent e){
		TextField t = (TextField)e.getSource();

		int val=0;

		try{
			val = Integer.parseInt(t.getText());
		}
		catch (Exception ex) {
			val=100;
			t.setText(""+val);
		}
		if(val<0||val>255){
			t.requestFocus();
			return;
		}

		if(t==tr){
			r=val;
		}
		if(t==tg){
			g=val;
		}
		if(t==tb){
			b=val;
		}
		sr.setValue(r);
		sb.setValue(b);
		sg.setValue(g);

		pr.setBackground(new Color(r,0,0));
		pg.setBackground(new Color(0,g,0));
		pb.setBackground(new Color(0,0,b));

		pclr.setBackground(new Color(r,g,b));

	}

	public void actionPerformed(ActionEvent e){

		Button x = (Button)e.getSource();
		if(x==bs){
			cr=new Color(r,g,b);
		}
		else {
			r=g=b=0;
			tr.setText("0");
			tg.setText("0");
			tb.setText("0");

			sr.setValue(0);
			sg.setValue(0);
			sb.setValue(0);

			pr.setBackground(Color.BLACK);
			pg.setBackground(Color.BLACK);
			pb.setBackground(Color.BLACK);
			pclr.setBackground(Color.BLACK);
		}

	}
	public static void main(String[] args) {
		UseScrollBar uc = new UseScrollBar();
	}
}