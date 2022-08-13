import java.awt.Color;
class BonusFoodTimer extends Thread
{
  public void run()
  { 
    int x=Va.btime;	 
    Va.hscore.setForeground(Color.red);	
    for(int c=14;c>=1;c--)
    {
	Va.hscore.setText("Eat bonus point food in "+c+" seconds");
	if(Va.bfoodeaten)
	  break;
	Va.pause(1000);
    }	   
    Va.bfoodvisible=false;
    Va.bfoodeaten=true;
    Va.hscore.setForeground(Color.blue);
    Va.hscore.setText("Highest Score:"+Va.highscore);
  }
}