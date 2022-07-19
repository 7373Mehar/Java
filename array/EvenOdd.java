public class EvenOdd
{
  public static void main(String [] args)
  {
	int [] num={13,5,17,5,9,8,12,5,17};
	int count=0;
	for(int i=0;i<num.length;i++)
        {
	  if(num[i]%2==0)
	  {
		count++;
	  }
        } 
	System.out.println("Total evens:"+count);
   System.out.println("Total odds:"+(num.length-count));
  }
}

















