public class TableTask extends Thread
{
	private int num;
	public TableTask(int num)
	{
		this.num=num;
	}
	public void run()
	{
		for(int ctr=1;ctr<=10;ctr++)
		{
			int ta=num*ctr;
			System.out.println(num+"*"+ctr+"="+ta);
		}
	}
}
