public class Pattern2
{
  public static void main(String [] args)
  {
     for(int r=1;r<=5;r++)
     {
	char ch='A';
	for(int c=1;c<=r;c++)
	{
	  System.out.print(ch);	
	  ch++; 
	}
	System.out.println();	
     }	
  }
}



