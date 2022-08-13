class StartThread extends MyThread
{
    public void run()
    {
	fi=0;
	while(li!=-1)
	{
	  if(this!=Va.cthread)
	    li--;
	  for(int i=li;i>=fi;i--)
	  {
	    java.awt.Point p=Va.base[i];
	    p.y--;
	    Va.pa.setLocation();
	  }
	  Va.pause();
	}
    }	
}
