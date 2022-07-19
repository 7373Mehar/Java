import java.util.Scanner;

public class App 
{
	public static void main(String[] args)
	{
		int T,N,X;
		Scanner sc=new Scanner(System.in);
		System.out.println("Number of test cases");
		T=sc.nextInt();
		if(T>=1 && T<=1000)
		{
			for(int c=1;c<=T;c++)
			{
				System.out.println("Number of children");
				N=sc.nextInt();
				System.out.println("Number of candies chef have");
				X=sc.nextInt();
				if(N>=1 && N<=1000 && X>=1 && X<=100)
				{
					if(X>=N)
						System.out.println(0);
					else
					{
						int d=N-X;
						int p=d/4;
						if(d%4!=0)
							p++;
						System.out.println(p);
					}
				}
			}
		}
	}
}
