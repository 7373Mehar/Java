class LeftThread extends MyThread
{
    public void run()
    {
	Va.intt();
	while(li!=-1)
	{
	  if(this!=Va.cthread)
	    li--;
	  if(fi!=0)
	     fi--;
	  for(int i=li;i>=fi;i--)
	  {
    	    Va.base[i].x--;
	    Va.pa.setLocation();
	  }
	  Va.pause();
	}
    }	
}