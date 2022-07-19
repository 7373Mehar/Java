public class App2 
{
	public static void main(String[] args) 
	{
		int [] num= {20,60,10,56,38,123,54};
		int i=0,j=num.length-1;
		while(i<=j)
		{
			int temp=num[i];
			num[i]=num[j];
			num[j]=temp;
			i++;j--;
		}
	}
}
