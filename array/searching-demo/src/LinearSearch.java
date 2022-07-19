public class LinearSearch 
{
	public static void main(String[] args) 
	{
		int [] num= {1,567,34,89,675,45,12};
		int x=12;
		int m=0;
		for(int i=0;i<num.length;i++)
		{
			if(x==num[i])
			{
				System.out.println("Number found...");
				m=1;
				break;
			}
		}
		if(m==0)
			System.out.println("Number not found...");
	}
}
