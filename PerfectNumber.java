public class PerfectNumber{
	private int n;
	private int sum;

/*public static void main(String [] args)
{
	int n=6;
	int sum=0;
	int i;
	for(i=1;i<=n/2;i++)
	{
		if(n%i==0)
		{
			sum=sum+i;
		}
	}
		if(sum==n)
		{
		System.out.println("this is perfect number");
	    }
		else
		{ 
			System.out.println("this is not perfect number");
		}
}*/

public boolean isperfect(int n,int sum)
{
	int i;
	for(i=1;i<=n/2;i++)                          //perfect number
	{
		if(n%i==0)
		{
			sum=sum+i;
		}
	}
	return sum;
}
public static void main(String [] args)
{
	int n=6,sum=0;
	PerfectNumber p = new PerfectNumber();
	p.isperfect(n,sum);
	if(sum==n)
	{
		System.out.println(n+" is perfect number");
	}
	else 
		System.out.println(n+" is not perfect number");
}

}