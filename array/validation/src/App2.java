import java.util.Scanner;
public class App2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter user id:");
		String userid=sc.nextLine();
		System.out.print("Enter password:");
		String password=sc.nextLine();
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







