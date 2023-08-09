class Palindrome
{
	

public static void main(String [] args)
{
	String s = "nayan";
	int f=0,si=0,li=s.length()-1;
	while(si<li)
	{
		if(s.charAt(si)!=s.charAt(li))
		{
			f=1;
			System.out.println("is not Palindrome");
			break;
		}
		si++;
		li--;
	}
	if(f==0)
		System.out.println("is palindrome");
}
}