class SumArrNum
{
	  

static boolean checkIndex(int b[],int index)
{
	for(int i=0;i<b.length;i++)
	{
		if(b[i]==index)
		{
			return false;
		}
	}
	return true;
}
public static void main(String [] args)
{
	int a[] = {1,2,3,4,5,6,7,8,9,5,5,5};
	int b[] = new int[a.length];
	int countB = 0;
	int sum = 10;
	for(int i=0;i<b.length;i++)
	{
		b[0] = -1;
	}
	for(int i=0;i<a.length;i++)
	{
		for(int j=a.length-1;j>i;j--)
		{
			if(a[i]+a[j]==sum && checkIndex(b,i) && checkIndex(b,j))
			{
				b[countB++] = i;
				b[countB++] = j;
				System.out.println(a[i]+"+"+a[j]+"="+sum);
			}
		}
	}
}
}