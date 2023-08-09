public class Kimi{
/*	//private int a;
	//private int b;
	private int sum;

public int additionNumber(int a,int b)
{
	sum = a+b;
	return sum;
}
public static void main(String [] args)
{
	Kimi adn=new Kimi();
	System.out.println(adn.additionNumber(10,20));
}
}*/

/*public static void main(String [] args)
{
	int x=5,y=8,z=10;
	System.out.println("hello " +x+y+z);
}*/

/*boolean isprime(int n)
{
	int i;
	for(i=2;i<n/2;i++)
	{
		if(n%i==0)
			return false;
	}
	 return true;
}

public static void main(String [] args)
{
	Kimi pr = new Kimi();
	int n = 15;
	boolean b = pr.isprime(n);
	if(b)
		System.out.println(n+ " is prime no");
	else 
		System.out.println(n+ " is not prime no");
}*/

boolean isprime(int n)
{
	int i;
	if (n<2)
		return false;                       //prime series
	for(i=2;i<=n/2;i++)
	{
		if(n%i==0)
		{
			return false;
		}
	}
	  return true;
}
public static void main(String [] args)
{
	Kimi t = new Kimi();
	int i,n;
	for(i=1;i<=20;i++)
	{
        if(t.isprime(i)==true)
        {
          System.out.println(i);
        }
	}
}
}


