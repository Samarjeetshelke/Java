//texteditor
//8mar
import java.io.*;
import mypack.Util;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Editor extends Frame implements ActionListener, TextListener
{
	TextArea ta;
	Button bn,bo,bs,bx;
	Panel ps;
	boolean flg;
	FileDialog fd;
	String str;
	File f;
	Editor()
	{
		super("Editor");

		ta=new TextArea("",15,100,TextArea.SCROLLBARS_BOTH);
		ta.addTextListener(this);

		add(ta,BorderLayout.CENTER);

		bn=new Button("New");
		bo=new Button("Open");
		bs=new Button("Save");
		bx=new Button("Exit");

		bo.addActionListener(this);
		bn.addActionListener(this);
		bs.addActionListener(this);
		bx.addActionListener(this);

		ps=new Panel();

		ps.add(bn);
		ps.add(bo);
		ps.add(bs);
		ps.add(bx);
		
		add(ps,BorderLayout.SOUTH);
		setSize(600,500);
		flg=false;
		setVisible(true);
		
		
	}
	
	public void textValueChanged(TextEvent e)
	{
		flg=true;
		
	}
	public void actionPerformed(ActionEvent e)
	{
		Button b=(Button)e.getSource();
		if(b==bn)
		{
			ta.setText("");
			flg=false;
		}
		if(b==bx)
		{
			if(flg==true)
			{
				if(JOptionPane.showConfirmDialog(null,"Save?")==JOptionPane.YES_OPTION)
					save();
			}
			System.exit(0);
			
		}
		if(b==bo)
			open();
		if(b==bs)
			save();
	}
	public void save()
	{
		str=ta.getText();
		char[]ch=new char[str.length()];
		ch=str.toCharArray();//conversion of string to char.
		int i=0,n=ch.length;
		try
		{
			fd=new FileDialog((Frame)null,"Save",FileDialog.SAVE);
			fd.setVisible(true);
			
		}
		catch(Exception e){}
		f=new File (fd.getDirectory()+fd.getFile());
		FileWriter fw=null;
		try
		{
			fw=new FileWriter(f);
			while(i<n)
			{
				fw.write(ch[i++]);
			}
			fw.close();
			flg=false;
			
		}
		catch(Exception e){}
		
	}
	
	public void open()
	{
		try{
			fd=new FileDialog((Frame)null,"open",FileDialog.LOAD);
			fd.setVisible(true);
			
		}
		catch(Exception e){}
		str=fd.getDirectory()+fd.getFile();
		FileReader fr=null;
		String s="";int val=0;
		try{
			fr=new FileReader(str);
			while(true)
			{
				val=fr.read();
				if(val==-1)
					break;
				s=s+(char)val;
			}
			fr.close();
		}
		catch(Exception e){}
		ta.setText(s);
		
	}
	
	public static void main(String[]args)
	{
		Editor a=new Editor();
	}
	
	
	
}

