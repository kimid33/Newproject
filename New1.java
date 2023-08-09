class New1
{
	

public static void main(String [] args)
{
	int n = 15;
	for(int i=10;i>=0;i--)
	{
		try 
		{
			System.out.println(n/i);
		}
		catch(Exception e)
		{
			//System.out.println("Something went wrong?");
		}
	}
	System.out.println("Success");
}
}