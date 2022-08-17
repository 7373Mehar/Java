class BlinkDisk extends Thread
{
   public void run()
   {
	Va.blinking=true;
	boolean blink=false;
	while(Va.blinking)
	{
	  Va.cdisk.setVisible(blink=!blink);
	  Va.exp(200);
	}
   }
 }  
