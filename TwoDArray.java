class TwoDArray
{
	

public static void main(String [] args)
{
	int a[][] = {{1,2,3,4},{5,6,7,8}};
	/*int a[][] = new int[3][4];
	int a1[] = {1,2,3,4};
	int a2[] ={5,6,7,8}; 
	 a[0] = a1;
	 a[1] = a2;*/
	for(int i=0;i<a.length;i++)
	{
	   for(int j=0;j<a[i].length;j++)
	   {
	     System.out.print(a[i][j]+" ");
	   }
	    System.out.println();
	}
}
}