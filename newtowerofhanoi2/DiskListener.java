import java.awt.event.*;
import javax.swing.*;
class DiskListener implements ItemListener
{
   public void itemStateChanged(ItemEvent evt)
   {
      if(evt.getStateChange()==ItemEvent.SELECTED)
      { 	
	ResetDisks.reset();
      } 	
   }
}