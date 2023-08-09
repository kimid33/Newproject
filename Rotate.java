class Rotate
{

static void rotateRight(int []a)
{
	int t = a[a.length-1];
	for(int i=a.length-1;i>0;i--)
	{
		a[i] = a[i-1];
	}
	a[0] = t;
}
static void rotateLeft(int []a)
{
	int t = a[0];
	for(int i=0;i<a.length-1;i++)
	{
		a[i] = a[i+1];
	}
	a[a.length-1] = t;
}
	
public static void main(String [] args)
{
	int []a = {10,11,20,15,8};
	rotateLeft(a);
	for(int i:a)
		System.out.print(i+" ");
	//System.out.println("\n");
	rotateRight(a);
	for(int i:a)
	    System.out.println(i+" ");
}
}