class Hello1
{


static int countChar(String s,int index,char ch)
{
	int c=0;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)==ch)
          c++;
	}
	return c;
}

static boolean checkPrevChar(String s,int index,char ch)
{
	for(int i=index;i>=0;i--)
	{
		if(s.charAt(i)==ch)
		{
			return true;
		}
	}
	return false;
}

public static void main(String [] args)
{
	String s = "abcabcbb";
	for(int i=0;i<s.length();i++)
	{
		if(checkPrevChar(s,i-1,s.charAt(i))==false)
			 //int c = countChar(s,charAt(i),i);
			System.out.println(s.charAt(i)+"->"+countChar(s,i,s.charAt(i)));
    }
}
}