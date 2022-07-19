public class App 
{
	public static void main(String[] args) 
	{
		String userid="ADmin";
		String password="Cetpa";
		if(userid.equalsIgnoreCase("admin") && password.equals("cetpa"))
		{
			System.out.println("Valid user");
		}
		else
		{
			System.out.println("Invalid user");
		}
	}
}







