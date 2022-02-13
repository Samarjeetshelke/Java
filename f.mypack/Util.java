package mypack;
import javax.swing.*;
public class Util
{
 	public static void display(String msg)
 	{
		JOptionPane.showMessageDialog(null,msg);
	}
 	public static int iInput(String msg)
 	{
		int no=0;
		try
		{
		 no=Integer.parseInt(JOptionPane.showInputDialog(null,msg));
		}
		catch(Exception e){}
		return no;
	}
 
 	public static double dInput(String msg)
 	{
		double no=0.0;
		try
		{
			no=Double.parseDouble(JOptionPane.showInputDialog(null,msg));
		}
		catch(Exception e){}
		return no;
	}
 
 
 	public static String sInput(String msg)
	{
   	String str="";

   	try
 		{
			str=JOptionPane.showInputDialog(null,msg);
	 	}
	 	catch(Exception e){}
	 	return str;
	}


	public static int oInput(String msg,String title,String []option)
	{
		int opt=JOptionPane.showOptionDialog(null,msg,title,JOptionPane.YES_OPTION,JOptionPane.PLAIN_MESSAGE,null,option,0);
		return opt;
	}
}