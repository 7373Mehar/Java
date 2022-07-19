public class Array3
{
  public static void main(String [] args)
  {
	int [] num={10,40,90,30,80,48};
	int total=num[0];
	for(int i=1;i<num.length;i++)
        {
	  total=total+num[i];
        } 
	double avg=(double)total/num.length;
	System.out.println(avg);
  }
}










