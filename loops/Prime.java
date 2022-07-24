public class Prime
{
  public static void main(String [] args)
  {
	int num=21;
	int h=num/2;
	boolean prime=true;
	for(int ctr=2;ctr<=h;ctr++)
	{
	  if(num%ctr==0)
	  {
		System.out.println("Number is not prime");
		prime=false;
		break;
	  }
	}
	if(prime)
	  System.out.println("Number is prime");
  }
}






