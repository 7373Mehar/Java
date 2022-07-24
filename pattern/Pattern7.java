public class Pattern7
{
  public static void main(String [] args)
  {
     for(int r=1;r<=5;r++)
     {
        for(int s=5-r;s>=1;s--)
	{
	  System.out.print("  ");	 
	}
	for(int c=1;c<=r;c++)
	{
	  System.out.print("* ");	
	}
	System.out.println();	
     }	
  }
}








