import java.awt.*;
import java.awt.event.*;
class Calculator extends Frame implements ActionListener
{
	int v1,v2,res,flg;

	char ch,opr;

	String s,t;

	TextField t1;

	Button []btn;

	Panel pc,tc;
	String allt=" ";
	
	
	Calculator()
	{

		super("Calculator");

		addWindowListener(new WindowAdapter() {    //For closing event
            public void windowClosing (WindowEvent e) {    
                System.exit(0);   
            }    
        });   

		flg = 0;

		t1=new TextField(10);
		
		//why the textbox size is not adjesting

		t1.setEditable(false);
		
		tc = new Panel();
		tc.add(t1);

		//tc.setSize(400,100);
		
		t1.setColumns(36);
		add(tc,BorderLayout.NORTH);

		String[]str=new String[]{"1","2","3","+","4","5","6","-","7","8","9","*","C","0","=","/"}; 

		btn=new Button[16];

		pc=new Panel();

		pc.setLayout(new GridLayout(4,4,5,5));

		for(int i=0;i<16;i++)
		{

			btn[i]=new Button(str[i]);

			btn[i].addActionListener(this);

			pc.add(btn[i]);

		}

		add(pc,BorderLayout.CENTER);

		s=new String();
		t=new String();

		setSize(400,300);

		setVisible(true);
	}

	public void actionPerformed(ActionEvent e){
		//Button b = (Button)e.getSource();

		ch=(e.getActionCommand().charAt(0));//it will get commond + ,- ,* ,%
		allt+=ch;

		if(ch == 'C'){

			s="";
			t="";
			allt="";
			flg=0;
			t1.setText("");//Clear
			return;
		}

		if(ch=='='){
			if(flg==1){
				try{
					v2=Integer.parseInt(s);
					comp(v1,v2,opr);
					t1.setText(""+res);//Result
					s="";
					t="";
					allt="";
					flg=0;
				}
				catch(Exception ex){}//
			}
			return;
		}

		if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
			if(flg==0){
				try{
					v1=Integer.parseInt(s);
					flg=1;
					s="";
					t="";
					t1.setText(allt);
					opr=ch;
				}
				catch(Exception ex){

				}
			}								//if + - * %
			else{
				try{
					v2=Integer.parseInt(s);
					comp(v1,v2,opr);
					v1=res;
					//t1.setText(""+v1);
					t1.setText(allt);
					s="";
					t="";
					opr=ch;
				}
				catch(Exception ex){}
			}
			return;
		}
		s=s+ch;
		//t1.setText(s);
		t1.setText(allt);
	}

	public void comp(int a,int b,char opr){

		switch (opr) {
			case '+': res=a+b; break;

			case '-': res=a-b; break;

			case '*': res=a*b; break;

			case '/': res=a/b; break;
		}

		t1.setText(""+res);
	}

	public static void main(String[] args) {
		Calculator cc= new Calculator();
	}
	
}