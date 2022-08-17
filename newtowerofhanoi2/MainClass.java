import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.applet.*;
class MainClass extends JFrame
{
  JPanel pa=new JPanel();
  JLabel [] hbar=new JLabel[3];
  boolean valid=false,drag=false;
  MoveListener listener1=new MoveListener();
  TowerListener listener2=new TowerListener();
  JLabel ins1=new JLabel("<html><h1><u>Towers of Hanoi</u></h1></html>");	
  JLabel ins2=new JLabel("<html><h3 style='color:blue;font-size:17'>Move the entire stack of disks from tower 1 to tower 3.You can move only one disk at a time.No disk may be placed on the top of smaller disk.</h3></html>");	
  JLabel ins3=new JLabel("<html><h2 style='font-size:17'>Number of disks:</h3></html>");	
  public MainClass()
  {
	super("Tower of Hanoi");
	Va.main=this;
	setSize(620,700);
	setLocationRelativeTo(null);
	setResizable(false);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLayout(null);
	addDisks();
	addBars();
	Va.list.add(Va.t1list);
	Va.list.add(Va.t2list);
	Va.list.add(Va.t3list);
	addIns();
	ImageIcon img=new ImageIcon(getClass().getResource("images/icon.png"));
	setIconImage(img.getImage());
	Va.clip1=Applet.newAudioClip(getClass().getResource("sounds/s3.wav"));
	Va.clip2=Applet.newAudioClip(getClass().getResource("sounds/s4.wav"));
	setVisible(true); 
  }
  void addBars()
  {
     Border bg=BorderFactory.createLineBorder(new Color(100,200,50),15);
     Border bb=BorderFactory.createLineBorder(Color.black,15);
     for(int i=0;i<3;i++)
     {
	hbar[i]=new JLabel();
	hbar[i].setBorder(bg);
        hbar[i].setBounds(Va.hbarx[i],350,180,16);			
	Va.vbar[i]=new MLabel(i);
	//Va.vbar[i].setBorderPainted(false);
        Va.vbar[i].setBounds(Va.vbarx[i],120,16,230);
	Va.vbar[i].setBorder(bb);
	add(Va.vbar[i]);
	Va.vbar[i].addMouseListener(listener2);
     }
     add(hbar[0]);add(hbar[1]);add(hbar[2]);			
  } 
  void addDisks()
  {
     Border blue=BorderFactory.createLineBorder(Color.blue,20,true);
     for(int i=0;i<8;i++)
     {  		
	Va.disks[i]=new MButton(0,i,-1);
	//Va.disks[i].setBorderPainted(false);
	Va.disks[i].setBorder(blue);
	Va.disks[i].addActionListener(listener1);
	add(Va.disks[i]);
     } 	
     int s=8-Va.nod;	
     int y=350; 	
     for(int i=s;i<8;i++)
     {
	int x=98-Va.diskw[i]/2;
	Va.t1list.push(Va.disks[i]);
	Va.disks[i].setBounds(x,y-=20,Va.diskw[i],20);
     }	
  } 
  void addIns()
  {
	ins1.setBounds(200,10,300,30);
	add(ins1);
	ins2.setBounds(10,45,600,60);
	add(ins2);
	JLabel []lt=new JLabel[3];
	int x=65;
	for(int i=0;i<3;i++)
	{
	  lt[i]=new JLabel("<html><h2 style='color:red'>Tower "+(i+1)+"</h2></html>");
	  lt[i].setBounds(x,360,100,30);
	  add(lt[i]);
	  x+=200;
	}
	Va.nomd.setBounds(220,400,220,30);
	add(Va.nomd);
	Va.cong.setBounds(80,450,500,30);
	add(Va.cong);
	Va.cong.setVisible(false);
	Va.timesec.setBounds(220,450,400,30);
	Va.timesec.setForeground(Color.blue);
	add(Va.timesec);
	ins3.setBounds(140,500,140,30);
	add(ins3);
	Va.nomr.setBounds(130,550,400,30);
	add(Va.nomr);
	for(int i=3;i<9;i++)
  	{
	  Va.cb.addItem(i);
	}
	Va.cb.setBounds(280,500,50,30);
	Va.cb.setFont(new Font("arial",0,20));
	add(Va.cb);
	Va.cb.addItemListener(new DiskListener());
	Va.bt.setBounds(340,500,120,30);
	Va.bt.addActionListener(new NewGameListener());
	add(Va.bt);

  } 
  public static void main(String args[])
  { 
	JFrame.setDefaultLookAndFeelDecorated(true);
	new MainClass();
  }
}