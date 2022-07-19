public class Max
{
  public static void main(String [] args)
  {
	int [] num={10,40,900,30,900,48};
	int max=num[0];
	for(int i=1;i<num.length;i++)
        {
	  if(num[i]>max)
	  {
		max=num[i];
	  }
        } 
	System.out.println(max);
  }
}










