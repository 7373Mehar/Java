public class EE
{
  public static void main(String [] args)
  {
    int num1=6,num2=8;
    int sn=num1<num2?num1:num2;
    for(int c=sn;sn>=1;c--)
    {
	if(num1%c==0 && num2%c==0)
	{
	  System.out.println(c);
	  break;
	}
    }		 	 
  }
}










