package mypack;
/*import mypack.DataIO;
import mypack.Util;*/
import mypack.DataIO;
import mypack.Util;
import java.io.*;

public class Account implements DataIO,Serializable
{
	int no;
	String nm;
	public Account()
	{
		no=0;
		nm=new String();
		
	}
	public String toString()
	{
		String s="Account No: "+no+"\nName: "+nm;
		return s;
	}
	public void display()
	{
		Util.display(toString());
	}
	public void setData(int n)
	{
		no=n;
		nm=Util.sInput("Name: ");
	}
	
	public int getNo(){return no;}
	public String getName(){return nm;}
}