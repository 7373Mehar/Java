import java.awt.event.*;
import javax.swing.*;
class NewGameListener implements ActionListener
{
   public void actionPerformed(ActionEvent evt)
   {
	Va.blinking=false;
	ResetDisks.reset();
   }
}