class RepeatChar
{
	
static boolean checkChar(char ch[],char c,int index)
{
	for(int i=index;i>=0;i--)
	{
		if(ch[i]==c)
		{
			return false;
		}
	}
	return true;
}

public static void main(String [] args)
{
	char ch[] = {'a','b','c','d','e','e','a','c'};
	for(int i=0;i<ch.length;i++)
	{
		if(checkChar(ch,ch[i],i-1))
		{
			System.out.println(ch[i]);
		}
	}
}
}