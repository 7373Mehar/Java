import java.util.*;
import javax.swing.*;
import java.applet.*;
class Va
{
  static MainClass main;
  static int []hbarx={10,210,410};
  static int []diskw={164,148,132,116,100,84,68,52};
  static int []disky={330,310,290};
  static int []vbarx={92,292,492};
  static int []diskx={98,298,498};
  static Stack <MButton>t1list=new Stack<MButton>();
  static Stack <MButton>t2list=new Stack<MButton>();
  static Stack <MButton>t3list=new Stack<MButton>();
  static ArrayList <Stack<MButton>>list=new ArrayList<Stack<MButton>>();
  static int ox,oy,tn,dn,nom=0,nod=3,sec=0;
  static boolean blinking=false,pblinking=false,timer=false;
  static MButton cdisk,pdisk;
  static MLabel cstack; 
  static Stack <MButton>sourcelist,destlist;
  static JLabel nomd=new JLabel("<html><h2>Number of moves:0</h2></html>");	
  static JLabel timesec=new JLabel("<html><h2>Time &nbsp;&nbsp;:&nbsp;&nbsp;0&nbsp;&nbsp;seconds</h2></html>");	
  static JLabel nomr=new JLabel("<html><h2 style='font-size:17'>(Solving this puzzle requires atleast 7 moves)</h3></html>");	
  static JLabel cong=new JLabel();
  static JComboBox <Integer>cb=new JComboBox<>();
  static JButton bt=new JButton("New Game");
  static MButton [] disks=new MButton[8];
  static MLabel [] vbar=new MLabel[3];
  static AudioClip clip1,clip2;	
  static void exp(int t)
  {
    try{
	Thread.sleep(t);
    }catch(Exception ex){}	
  }
}