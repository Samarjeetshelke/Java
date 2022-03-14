import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class NewFile1 extends Frame implements ActionListener
{
    private Desktop desktop;
    MenuItem a,b,c,d;
    String FileX()
    {
        String filename = JOptionPane.showInputDialog("Enter File name : ");
        String path1 = "E:/LabJava/"+filename+".txt";
        return path1;
    }

    Menu m2;

    NewFile1(){
        super("Menu");
        desktop=Desktop.getDesktop();
        MenuBar mb=new MenuBar();
        Menu m1=new Menu("File");
        m2=new Menu("Edit");
        c=new MenuItem("Edit file");
        d=new MenuItem("Delete");
        Menu m3=new Menu("About");
        a=new MenuItem("New");
        b=new MenuItem("Open");
        setMenuBar(mb);  
         mb.add(m1);
        mb.add(m2);
        mb.add(m3);

        m1.add(a);
        m1.add(b);
        m1.add(d);
        m2.add(c);
        a.addActionListener(this);
        b.addActionListener(this);
        c.addActionListener(this);
        d.addActionListener(this);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent w)
            {
                System.exit(0);
            }
        });
        setVisible(true);
        setLayout(null);
        setSize(300,300);
    }
    public void actionPerformed(ActionEvent e)
    {

        String path=FileX();
        File file=new File(path);
        if(a==e.getSource()){
        try {
           
            boolean flag = file.createNewFile();
             desktop.open(new File(path));
if (flag) {
System.out.println("file is created");
} else {
System.out.println("file is already present....");
}
} catch (IOException e1) {
e1.printStackTrace();
}
}
else if(b==e.getSource() || c==e.getSource())
{
try{
 
File file1=new File(path);
if (file1.exists())
           desktop.open(new File(path));
        else
            System.out.println("File Does not Exists");


}
catch(Exception er){
}
}
else if(d==e.getSource()){
try{

        if (file.delete()) {
            System.out.println("File deleted successfully");
        }
        else {
            System.out.println("Failed to delete the file");
        }
}
catch(Exception er){
}

}
}
 public static void main(String args[])
 {
 new NewFile1();
 }
}
