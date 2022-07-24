public class Fac
{
  public static void main(String [] args)
  {
	for(int temp=1;temp<=5;temp++)
	{
	  int num=temp;
	  for(int ctr=num-1;ctr>=1;ctr--)
	  {
	     num=num*ctr;
	  }
	  System.out.println(temp+"!="+num);
        }
  }
}






