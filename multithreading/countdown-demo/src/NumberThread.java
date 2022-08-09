public class NumberThread extends Thread 
{
	public void run()
	{
		for(int num=10;num>=1;num--)
		{
			System.out.println(num);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception ex)
			{
				System.out.println(ex);
			}
		}
	}
}
