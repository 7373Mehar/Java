public class Min
{
  public static void main(String [] args)
  {
	int [] num={10,3,900,3,900,48,67,34,3};
	int min=num[0];
	for(int i=1;i<num.length;i++)
        {
	  if(num[i]<min)
	  {
		min=num[i];
	  }
        } 
	System.out.println(min);
  }
}














