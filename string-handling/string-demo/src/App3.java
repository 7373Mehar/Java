public class App3 
{
	public static void main(String[] args) 
	{
		char [] username1= {'r','e','h','a','n','9','9','1','9'};
		char [] username2= {'r','E','h','a','n','9','9','1','9'};
		int c=0;
		if(username1.length==username2.length)
		{
			int i=0;
			while(i<username1.length)
			{
				if(username1[i]!=username2[i])
				{
					c=1;
					break;
				}
				i++;
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
