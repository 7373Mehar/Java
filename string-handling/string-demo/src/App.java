public class App 
{
	public static void main(String[] args) 
	{
		char [] username1= {'r','e','h','a','n','9','9','1','9','8'};
		char [] username2= {'r','e','h','a','n','9','9','1','8'};
		int c=0;
		if(username1.length==username2.length)
		{
			for(int i=0;i<username1.length;i++)
			{
				if(username1[i]!=username2[i])
				{
					c=1;
					break;
				}
			}
		}
		else
			c=1;
		if(c==0)
			System.out.println("Both are equals");
		else
			System.out.println("Both are not equals");
	}
}
