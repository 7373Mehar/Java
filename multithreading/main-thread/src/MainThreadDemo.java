class MyThread extends Thread
{
	public void run()
	{
		System.out.println("A");
		System.out.println("B");
		System.out.println("C");
		System.out.println("D");
	}
}
public class MainThreadDemo 
{
	public static void main(String[] args) 
	{
		MyThread th=new MyThread();
		System.out.println(th.getName());
		System.out.println(Thread.currentThread().getName());
		th.start();
		System.out.println("P");
		System.out.println("Q");
		System.out.println("R");
		System.out.println("S");
	}
}
