import java.util.Scanner;
public class App 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Execution started...");
		System.out.print("Enter first number:");
		int num1=sc.nextInt();
		System.out.print("Enter second number:");
		int num2=sc.nextInt();
		if(num2!=0)
		{
			int res1=num1/num2;
			System.out.println("Result1:"+res1);
		}
		else
			System.out.println("divide by zero is not allowed");
		int res2=num1*num2;
		System.out.println("Result2:"+res2);
		int res3=num1+num2;
		System.out.println("Result3:"+res3);
		int res4=num1-num2;
		System.out.println("Result4:"+res4);
		System.out.println("Execution stopped...");
	}
}
