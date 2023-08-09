class FirstLast
{

static int getfirstIndex(String s,char ch)
{
	//int i;
	for(int i=0;i<=s.length();i++)
	{
		if(ch==s.charAt(i))
			return i;
	}
	return -1;
}

static int getlastIndex(String s,char ch)
{
	for(int i=s.length()-1;i>=0;i--)
	{
		if(ch==s.charAt(i))
			return i;
	}
	return -1;

}
	
public static void main(String [] args)
{
	int i;
	int t;
	char ch = 'i';
	String s = "hello this is indore indore";
	t = getfirstIndex(s,ch);
	if(t==-1)
	{
		System.out.println("not found");
	}
	else 
	{
		System.out.println(ch+" is found at "+ (t+1) +" position");
	}
	t=getlastIndex(s,ch);
	if(t==-1)
	{
		System.out.println("not found");
	}
	else 
	{
		System.out.println(ch+" is found at "+(t+1)+" position");
	}
}
}