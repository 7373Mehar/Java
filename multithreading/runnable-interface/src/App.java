public class App 
{
	public static void main(String[] args) 
	{
		Thread th=new Thread(new Task());
		th.start();
	}
}
