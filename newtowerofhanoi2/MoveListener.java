import java.awt.event.*;
import javax.swing.*;
class MoveListener implements ActionListener
{
   public void actionPerformed(ActionEvent evt)
   {
	Va.pdisk=(MButton)evt.getSource();
	if(checkDisk())
	{
	  Va.cdisk=Va.pdisk;
	  Va.exp(100);
	  if(Va.sec==0)
	  {
		new TimerThread().start();
	  }
	  new BlinkDisk().start();
	}
   }
   boolean checkDisk()
   {	
	if(Va.cdisk!=null && Va.pdisk==Va.cdisk && Va.blinking)
	  return false;
	Va.sourcelist=Va.list.get(Va.pdisk.tn);
	MButton la=Va.sourcelist.peek();
	if(Va.pdisk!=la)
	{
	  Va.clip2.play();
	  return false;
	}
	if(Va.cdisk!=null && la.tn!=Va.cdisk.tn)
	{
	  System.out.println("other");
	  Va.cdisk.setVisible(true);
	  Va.blinking=false;
	  return true;
	}
	if(!Va.blinking)
	  return true;
	return false;
   } 
}