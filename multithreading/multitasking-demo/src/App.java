public class App 
{
	public static void main(String[] args) 
	{
		//creating 4 thread;
		TableTask th1=new TableTask(13);
		TableTask th2=new TableTask(7);
		TableTask th3=new TableTask(19);
		TableTask th4=new TableTask(16);
		//Starting all threads
		th1.start();
		th2.start();
		th3.start();
		th4.start();
	}
}
