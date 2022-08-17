class TimerThread extends Thread
{
  public void run()
  {
    Va.timer=true;
    while(Va.timer)
    {
	Va.sec++;
	Va.timesec.setText("<html><h2>Time &nbsp;&nbsp;:&nbsp;&nbsp;"+Va.sec+"&nbsp;&nbsp;seconds</h2></html>");
	Va.exp(1000);
    } 	
  }
}