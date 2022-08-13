import java.awt.*;
import javax.swing.*;
import java.applet.*;
class Va
{
  static MainClass main;	
  static JButton replay=new JButton("Replay");
  static FieldPanel pa;
  static boolean notborder=true,foodvisible=false,foodeaten=false,bfoodeaten=true,
  bfoodvisible=false,started=false;
  static int size=4,mv=13,wh=12,highscore,cscore=0,ctr=0,leveli=0,btime=14;
  static Point [] base=new Point[150];
  static MyThread cthread;
  static long speed=120;
  static Point food=new Point(0,0);
  static Point bfood=new Point(0,0);
  static Point head=new Point(0,0);
  static AudioClip clipdie,clipeat1,clipeat2,clipeat;
  static JLabel score=new JLabel("0");
  static JLabel level=new JLabel("1");
  static JLabel foodv=new JLabel("5 Points");
  static JLabel bfoodv=new JLabel("20 Points");
  static JLabel hscore=new JLabel("Press ENTER to start");
  static int [] speedv={120,110,100,92,85,78,70,64,60,57,54,50};
  static int [] sinc={5,6,7,8,9,10,11,12,13,14,15,16};
  static int [] bsinc={20,22,25,29,34,40,47,55,64,74,85,97};
  static int [] scv={100,200,310,420,550,690,850,1010,1170,1340,1520,1720};
  static void pause()
  {
    try{
	Thread.sleep(speed);
    }catch(Exception ex){}
  }
  static void pause(int t)
  {
    try{
	Thread.sleep(t);
    }catch(Exception ex){}
  }
  static void intt()
  {
      for(Thread t:Thread.getAllStackTraces().keySet())
      {
	if(t.getState()==Thread.State.TIMED_WAITING)
	{
	  try{
		t.interrupt();
	  }catch(Exception ex){System.out.println(ex);} 	
	}
      }
  }
}