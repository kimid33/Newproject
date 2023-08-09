class CatArr
{
	
static void copyArray(int a[],int []b)
{
	for(int i=0;i<b.length;i++)
	{
		a[i] = b[i];
	}
}
static void show(int a[])
{
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
}
static int[] concatArray(int a[],int[]b)
{
	int n[] = new int[a.length+b.length];
	copyArray(n,a);
	int j=0;
	for(int i=a.length;i<n.length;i++)
	{
		n[i] = b[j++];
	}
	show(n);
	return n;
}

public static void main(String [] args)
{
	int a[] = {1,2,3,4,5,6,0,0};
	int b[] = {6,7,8,9};
	//copyArray(a,b);
	concatArray(a,b);
}
}