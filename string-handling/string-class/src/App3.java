public class App3 
{
	public static void main(String[] args) 
	{
		String x="111-222-333-444";
		
		String y=x.substring(0,x.indexOf('-'));
		String z=x.substring(x.lastIndexOf('-')+1);		
		
		System.out.println(y+"-"+z);
		
	}
}
