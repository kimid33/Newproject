class GenericRoot
{
	

public static int genericR(int n)
{
	int r,sum=0;
	while(true)
	{
	while(n!=0)
	{
		r=n%10;
		sum=sum+r;
		n=n/10;
	}
	if(sum>9)
	{
		n=sum;
		sum=0;
	}
	else 
	{
		break;
	}
}
       return sum;
}
public static void main(String [] args)
{

    int n=8894,t;
    t=genericR(n);
    System.out.println(t);

}
}
