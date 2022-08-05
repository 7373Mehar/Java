public class App2 
{
	public static void main(String[] args) 
	{
		String x="111-222-333-444";
		String y=x.substring(x.lastIndexOf('-')+1);		
		
		System.out.println(y);
		
	}
}
