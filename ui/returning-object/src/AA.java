public class AA 
{
	public void show()
	{
		System.out.println("Show method called..");
	}
}
class BB
{
	public AA getAA()
	{
		return new AA();
	}
}
