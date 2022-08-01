public class App 
{
	public static double getAverage(int [] arr)
	{
		int count=0;
		double sum=0;
		for(int n:arr)
		{
			if(n%6==0)
			{
				sum=sum+n;
				count++;
			}
		}
		return sum/count;
	}
	public static void main(String[] args) 
	{
		int [] num={12,36,9,24};
		double res=getAverage(num);
		System.out.println(res);
	}
}
