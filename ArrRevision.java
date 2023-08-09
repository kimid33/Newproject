class ArrRevision
{
	/*public static void main(String[] args) {
		int a[] = {1,2,3,4};                            //merge two array
		int b[] = {5,6,7,8};
		int c[] = new int[a.length+b.length];
		int k=0;
		for(int i=0;i<a.length;i++,k++)
		{
			c[k] = a[i];
		}
		for(int i=0;i<b.length;i++,k++)
		{
			c[k] = b[i];
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
	}*/

	/*------------------------------------------------------------------------------------------------------*/

	/*public static void main(String[] args) {
		int a[] = {2,3,5,7,6,9,8,15};                    //find max no of given array
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
		  if(a[i]>max)
		  {
		  	max=a[i];
		  }
		}
			System.out.println(max);
	}
	/*--------------------------------------------------------------------------------------------------------*/

	/*public static void main(String[] args) {
		int a[] = {2,3,5,7,6,9,8,15};
		int max=a[0];                                    // find min no of given array
		//int i;
		for(int i=0;i<a.length;i++)
		{
		  if(a[i]<max)
		  {
		  	max=a[i];
		  }
		}
			System.out.println(max);
	}*/
	/*--------------------------------------------------------------------------------------------------------*/

	/*public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9,11}; 
		//int d = a[3];                                    //delete one element from given array
		int b[] = new int[a.length];
		for(int i=5;i<a.length-1;i++)
		{
				a[i] = a[i+1];
		}
		for(int i=0;i<b.length-1;i++)
		{
		  System.out.print(a[i]+" ");
		}
	}*/

	/*-----------------------------------------------------------------------------------------------------------*/

    /*public static boolean checkArr(int a[],int j,int index)
    {
    	for(int i=index;i>=0;i--)                               //remove duplicate element
    	{
    		if(a[i]==j) 
    		  return false;
    	}
    	return true;
    }
	public static void main(String[] args) {
		int a[] = {2,2,5,6,6,7,8,9};
		int j;
		for(int i=0;i<a.length;i++)
		{
			if(checkArr(a,a[i],i-1))
			{

			   System.out.println(a[i]+"");
		    }
		}

	}*/

	/*-----------------------------------------------------------------------------------------------------------*/

	/*public static void main(String[] args) {
		int a[] = {1,2,4,5,6,7,8,9};
		int size = a.length-1;                        //insert an element desired or specific position in an array
		int c = 3;
		for(int i=size;i>=2;i--)
		{
			a[i] = a[i-1];
		}
		size++;
		a[2] = c;
		for(int j=0;j<size;j++)
		System.out.print(a[j]+" ");
	}*/

	/*---------------------------------------------------------------------------------------------------------*/

	/public static void main(String[] args) {
		int a[] = {2,4,3,5,7,6,8,9,11};
		int count = 0;                                //count total no of even and odd elements in an array
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				count++;
			}
		}
		  System.out.println(count+" ");

	    for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				c++;
			}
		}
		System.out.println(c+" ");
	}*/

	/*-------------------------------------------------------------------------------------------------------------*/

	/*public static void main(String[] args) {
		int a[] = {1,-2,3,-4,-5,6,7,-8};
		int count = 0;
		for(int i=0;i<a.length;i++)                       //count the total no of negative elements
		{
			if(a[i]<0)
			{
				count++;
			}
		}
		System.out.println(count+" ");
	}*/

    /*public static void main(String[] args) {
    	int a[] = {1,2,3,4,5,6,7};                       //copy all aray element from an array to another array
    	int b[] = new int[a.length];
    	//b=a;
    	//b[0]++;
    	for(int i=0;i<b.length;i++)
    	{
    		b[i] = a[i];
    		System.out.println(b[i]+" ");
    	}
    }*/


    public static void main(String[] args) {
    	int a[] = {2,3,6,9,7,8,11,10,12,5};
    	int b = a[0];
    	for(int i=0;i<a.length;i++,b++)
    	{
    		if(b>=)
    	}
    }
}