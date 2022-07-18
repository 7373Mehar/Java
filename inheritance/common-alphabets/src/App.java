public class App 
{
	public static void main(String[] args) 
	{
		char [] x= {'b','m','a','p','r','h','w'};
		char [] y= {'d','p','s','a','w','c','k','q'};
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<y.length;j++)
			{
				if(x[i]==y[j])
				{
					System.out.println(x[i]);
					break;
				}
			}
		}
	}
}
