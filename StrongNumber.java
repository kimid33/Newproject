public class StrongNumber{
	private int n;
    private int r;
public static int isFact(int n){
	int fact=1,i;
	for(i=1;i<=n;i++){
		fact=fact*i;
	}
	return fact;
}
public static void main(String [] args){
	int n=145,sum=0,r,t=n;
	while(n!=0)
	{
		r=n%10;
		sum=sum + isFact(r);
		n=n/10;
	}
	if(t==sum)
		System.out.println("this is strong number");
	else 
		System.out.println("this is not strong number");
}
}