class BlinkMessage extends Thread
{
   public void run()
   {
	boolean blink=false;
	for(int c=0;c<30;c++)
	{
	  Va.cong.setVisible(blink=!blink);
	  Va.exp(200);
	}
	Va.cong.setVisible(true);
   }
 }  
