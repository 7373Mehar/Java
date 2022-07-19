public class Min1
{
  public static void main(String [] args)
  {
	int [] num={10,3,900,3,900,48,67,34,3};
	int j=0;
	for(int i=1;i<num.length;i++)
        {
	  if(num[i]<num[j])
	  {
		j=i;
	  }
        } 
	System.out.println(j);
  }
}














