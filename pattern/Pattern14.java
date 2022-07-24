public class Pattern14
{
  public static void main(String [] args)
  {
     for(int r=5;r>=1;r--)
     {
        for(int s=5-r;s>=1;s--)
	{
	  System.out.print(" ");	  
	}
	for(int c=1;c<=2*r-1;c++)
	{
	  System.out.print("*");	
	}
	System.out.println();	
     }	
     for(int r=2;r<=5;r++)
     {
        for(int s=5-r;s>=1;s--)
	{
	  System.out.print(" ");	  
	}
	for(int c=1;c<=2*r-1;c++)
	{
	  System.out.print("*");	
	}
	System.out.println();	
     }	
  }
}








