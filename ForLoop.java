class ForLoop
{
	

public static void main(String [] args)
{
	/*int a[] = new int[5];
	a[0] = 10;
	a[1] = 20;
	a[2] = 30;
	a[3] = 40;
	a[4] = 50;
	for(int i=0;i<a.length;i++)
	{
	  System.out.println(a[i]);
	}*/

	int a[] = {2,3,4,5,6,7,8,9,11};
	for(int i=1;i<a.length;i++)
	{
		if(a[i]%2!=0)
			System.out.println(a[i]);
	}
}
}