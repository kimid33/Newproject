class Fibonacci
{

	
public static void main(String [] args)
{
	int a=0;
	int b=1,next;
	String s=" ";
	System.out.print(a+" ");
	System.out.print(b+" ");
	for(int i=2;i<=10;i++)
	{
		next=a+b;
		System.out.print(next+" ");
		a=b;
		b=next;
	}
	
}
}