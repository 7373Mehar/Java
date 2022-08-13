import java.awt.*;
import java.awt.event.*;
class ArrowKeyListener extends KeyAdapter
{
  public void keyPressed(KeyEvent evt)
  {
	int kc=evt.getKeyCode();
 	if(!Va.started && kc==KeyEvent.VK_ENTER)
  	{
	  Va.cthread=new StartThread();Va.cthread.start();	 
	  Va.started=true;
	  Va.hscore.setText("Game Started...");
	  MessagePanel.fetchScore();
	  return; 	
        }
	if(!Va.started)
	  return;
	if(kc==KeyEvent.VK_RIGHT)
	{
	  if(Va.cthread instanceof RightThread || Va.cthread instanceof LeftThread)
	  {
		return;
	  }
	  Va.cthread=new RightThread();
	  Va.cthread.start();
	}
	else if(kc==KeyEvent.VK_DOWN)
	{
	  if(Va.cthread instanceof DownThread || Va.cthread instanceof UpThread || Va.cthread instanceof StartThread)
	  {
		return;
	  }
	  Va.cthread=new DownThread();
	  Va.cthread.start();
	}
	if(kc==KeyEvent.VK_LEFT)
	{
	  if(Va.cthread instanceof RightThread || Va.cthread instanceof LeftThread)
	  {
		return;
	  }
	  Va.cthread=new LeftThread();
	  Va.cthread.start();
	}
	if(kc==KeyEvent.VK_UP)
	{
	  if(Va.cthread instanceof DownThread || Va.cthread instanceof UpThread  || Va.cthread instanceof StartThread)
	  {
		return;
	  }
	  Va.cthread=new UpThread();
	  Va.cthread.start();
	}
  }
}