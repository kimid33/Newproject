public class Armstrong{
	private int n;
	private int c;
	private int p;
	private int s;

public static int pow(int n,int p){
	int i,s=1;
	for(i=1;i<=p;i++)
	{
		s=s*n;
	}
	return s;
}
public static int countdigit(int n){
	int c=0;
	while(n!=0)
	{
		c++;
		n=n/10;
	}
	return c;
}
public static void main(String [] args){
	int n=153,sum=0,r,t=n,c;
	c=countdigit(n);
	while(n!=0)
	{
		r=n%10;
		sum=sum+pow(r,c);
		n=n/10;
	}
     if(sum==t)
     	System.out.println("Is armstrong no");
     else 
     	System.out.println("is not armstrong no");
}
}