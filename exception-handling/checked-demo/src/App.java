import java.io.*;
public class App 
{
	public static void main(String[] args) 
	{
		System.out.println("Execution started...");
		try
		{
			FileReader fr=new FileReader("aaa.txt");
			System.out.println("File loaded...");
		}
		catch(FileNotFoundException ex)
		{
			System.out.println(ex);
		}
		System.out.println("Execution stopped...");
	}
}
