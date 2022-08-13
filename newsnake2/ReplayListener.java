import java.awt.*;
import java.awt.event.*;
class ReplayListener implements ActionListener
{
  public void actionPerformed(ActionEvent evt)
  {
	Va.replay.setEnabled(false);
        Va.notborder=true;Va.foodvisible=false;Va.foodeaten=false;
	Va.bfoodeaten=true;Va.bfoodvisible=false;Va.started=false;
 	Va.size=4;Va.mv=17;Va.wh=16;Va.highscore=0;Va.cscore=0;Va.ctr=0;Va.leveli=0;Va.btime=14;
	Va.speed=120;
	Va.score.setText("0");
	Va.level.setText("1");
	Va.foodv.setText("5 Points");
	Va.bfoodv.setText("20 Points");
	Va.hscore.setText("Press ENTER to start");
	for(int i=0;i<Va.base.length;i++)
	{
	  Va.base[i]=null;
	}
	Va.pa.init();
	Va.pa.setLocation();
	Va.main.requestFocus();
  }
}