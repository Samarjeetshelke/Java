// sub class in same package
package mypack;
import mypack.Account;
import mypack.Util;
import java.io.*; //serializable interface
import mypack.DataIO;
public class NewAccount extends Account implements Serializable,DataIO
{
	int obalance; 
	boolean state;
	public NewAccount()
	{
		super();
		obalance=0;
		state=true;
	}
	public void setData(int no)
	{
		super.setData(no);
		obalance=Util.iInput("Enter Opening Balnce");
		state=true;
	}
	public void display()
	{
	Util.display(toString());
	}
	public int getBalance (){return obalance;}
	public boolean getState(){return state;}
	public String toString()
	{
		String s=super.toString()+"\n Opening balance"+obalance +"\n state: "+state;
			return s;
	}
	public void deleteRecord(){state=false;}
}
