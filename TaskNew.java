class TaskNew
{
	
/*public boolean isPrime(int n)
{
	int i;                                          //check prime number
	if(n==1)
		return false;
	for(i=2;i<n/2;i++)
	{
		if(n%i==0)
			return false;
	}
	return true;
}

public static void main(String[] args) {
	
	TaskNew obj = new TaskNew();
	if(obj.isPrime(12))
	{
		System.out.println("is prime number");
	}
	else 
		System.out.println("is not prime number");

}*/

/*public static void main(String[] args) {
	int n=7,sum=0;
	for(int i=1;i<=n/2;i++)                               //perfect no
	{
		if(n%i==0)
		{
			sum = sum+i;
		}
	}
	if(sum==n)
		System.out.println("is perfect no");
	else 
		System.out.println("is not perfect no");
}*/


/*static int pow(int n,int p)
{
	int s=1;
	for(int i=1;i<=p;i++)                                  //armstrong no
	{
		s=s*n;
	}
	return s;
}
static int countChar(int n)
{
	int c=0;
	while(n!=0)
	{
		c++;
		n=n/10;
	}
	return c;
}

public static void main(String[] args) {
	int n=154,r,sum=0,t,c;
	c = countChar(n);
	t=n;
	while(n!=0)
	{
		r=n%10;
		sum=sum+pow(r,c);
		n=n/10;
	}
	if(sum==t)
		System.out.println("is armstrong");
	else 
		System.out.println("is not armstrong");
}*/


/*public static void main(String[] args) {
	int n=151,r,t,rev=0;
	t=n;                                        //palindrome
	while(n!=0)
	{
		r=n%10;
		rev=rev*10+r;
		n=n/10;
	}
	if(rev==t)
	    System.out.println("is palindrome");
	else 
		System.out.println("is not palindrome");
}*/

/*public static void main(String[] args) {
	for(int i=1;i<=10;i++)                                //print 1 to 10 no using loop
	{
		System.out.println(i);
	}
}*/

/*public static void main(String[] args) {
	int n=1234,r,t=0;                                  
	while(n!=0)                                      //rev no
	{
		r=n%10;
		t=t*10+r;
		n=n/10;
	}
	System.out.println(t);
}*/

/*public static void main(String[] args) {
	int t,i;
	for(i=1;i<10;i++)                                //n square no.
	{
     
	 System.out.println(i*i+" ");
	}
}*/

/*public static void main(String[] args) {
	 int t,i,sum=0;
	for(i=1;i<10;i++)                                //n square no. sum
	{
		sum = sum+(i*i);
	}
		System.out.println(sum);
     
}*/


/*public static void main(String[] args) { 
	int t,i,sum=0;
	for(i=1;i<10;i++)                                //n cube no.
	{
		System.out.println(i*i*i+" ");
    }
}*/

/*public static void main(String[] args) {
	int t,i,sum=0;
	for(i=1;i<10;i++)                                //n cube no. sum
	{
		sum = sum+(i*i*i);
	}
		System.out.println(sum);
     
}*/


/*public static void main(String[] args) {
	int sum=0;
	for(int i=1;i<=10;i++)                                //sum of natural no using while loop
	{
		sum = sum+i;
	}
		System.out.println(sum);
}*/
    
    /*int i=1,sum=0;
     while(i<=10)
     {
     	sum = sum+i;
     	i++;
     }
     System.out.println(sum);
}*/

/*public static void main(String[] args) {
	int n=1234,r,t=0,sum=0;                                
	while(n!=0)                                     //rev no sum
	{
		r=n%10;
		t=t*10+r;
		sum = sum+r;
		n=n/10;
	}
	System.out.println(t);
	System.out.println(sum);
}*/

/*static boolean isPrime(int n)
{
	int i;
	if(n<2)
		return false;
	for(i=2;i<=n/2;i++)
	{
		if(n%i==0)
		{
			return false;
		}
	}
	return true;
}
public static void main(String[] args) {
	for(int i=1;i<=10;i++)
	{
		if(isPrime(i)==true)
		{
			System.out.println(i+" ");
		}
	}
}*/

static int pow(int n,int p)
{
	int s=1;
	for(int i=1;i<=p;i++)                                  //armstrong no series
	{
		s=s*n;
	}
	return s;
}
static int countDigit(int m)
{
	int c=0;
	while(m!=0)
	{
		c++;
		m=m/10;
	}
	return c;
}
static boolean checkArm(int n)
{
	int r,sum=0,t,c;
	c=countDigit(n);
	/*if(countDigit(n)==1)
		return false;*/
	t=n;
	while(n!=0)
	{
		r=n%10;
		sum=sum+pow(r,c);
		n=n/10;
	}
	if(sum==t)
	{
		return true;
	}
     return false;
}

public static void main(String[] args) {
	int i;
	for(i=1;i<=10000;i++)
	{
		if(checkArm(i)==true)
		{
			System.out.print(i+" ");
		}
	}

}
}
