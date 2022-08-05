public class Cpnverter 
{
	public static void toBinary(int num)
	{
		String res="";
		while(num!=0)
		{
			int rem=num%2;
			res=rem+res;
			num=num/2;
		}
		System.out.println(res);
	}
	public static void main(String[] args) 
	{
		toBinary(45);
		toBinary(19);
		toBinary(24);
	}
}
