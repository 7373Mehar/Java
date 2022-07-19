public class Frequency
{
  public static void main(String [] args)
  {
	int [] num={13,5,17,5,9,8,12,5,17};
	int x=19;
	int count=0;
	for(int i=0;i<num.length;i++)
        {
	  if(x==num[i])
	  {
		count++;
	  }
        } 
	System.out.println(count);
  }
}

















