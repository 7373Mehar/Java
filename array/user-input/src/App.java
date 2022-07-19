import java.util.Scanner;
public class App 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any number:");
		int num=sc.nextInt();
		int sq=num*num;
		System.out.println("Square of "+num+" is "+sq);
	}
}
