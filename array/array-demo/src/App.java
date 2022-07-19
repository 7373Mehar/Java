public class App 
{
	public static void main(String[] args) 
	{
		int [] num= {11,678,34,789,345,9};
		for(int i=0;i<num.length;i++)
		{
			if(num[i]>9 && num[i]<100)
			{
				System.out.println(num[i]);
			}
		}
	}
}
