public class LinearSearch2 
{
	public static void main(String[] args) 
	{
		String [] namelist= {"Amit","Rahul","Imran","David","Jasveer","Neha","Kapil"};
		String str="rahul";
		int m=0;
		for(int i=0;i<namelist.length;i++)
		{
			//if(str.equalsIgnoreCase(namelist[i]))
			if(str.equals(namelist[i]))
			{
				System.out.println("Name found...");
				m=1;
				break;
			}
		}
		if(m==0)
			System.out.println("Name not found...");
	}
}
