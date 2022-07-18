public class App4 
{
	public static void main(String[] args) 
	{
		char [] x= {'b','m','a','p','r','h','w'};
		char [] y= {'d','p','s','a','w','c','k','q'};
		int sum=0;
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<y.length;j++)
			{
				if(x[i]==y[j])
				{
					sum=sum+x[i];
					break;
				}
			}
		}
		while(true)
		{
			int total=0;
			while(sum!=0)
			{
				int r=sum%10;
				total=total+r;
				sum=sum/10;
			}
			if(total<=9)
			{
				System.out.println(total);
				break;
			}
			sum=total;
		}
	}
}










