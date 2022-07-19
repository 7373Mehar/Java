public class App2 
{
	public static void main(String[] args) 
	{
		int [] num= {156,47,34,817,453,21};
		for(int i=0;i<num.length;i++)
		{
			int x=num[i];
			while(x!=0)
			{
				int r=x%10;
				if(r==1)
				{
					System.out.println(num[i]);
					break;
				}
				x=x/10;
			}
		}
	}
}



