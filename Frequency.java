class Frequency
{
	
static boolean isExistprev(String s,int i,char ch)
{
	String s1 = "";
	if(i>=0)
	{
		s1 = s.substring(0,i+1);
	}
	return s1.indexOf(ch)>=0?true:false;
}

public static int charCount(String s,int index,char ch)
{
	int c=0;
	for(int i=index;i<s.length();i++)
	{
		if(s.charAt(i)==ch)
		{
			c++;
		}
	}
	return c;
}	
public static void main(String [] args)
{
	String s = "hello hello hello placement";
	//int c;
	for(int i=0;i<s.length();i++)
	{
		if(isExistprev(s,i-1,s.charAt(i))==false)
		{
            System.out.println(s.charAt(i)+"->"+charCount(s,i,s.charAt(i)));
		}
	}
	
}
}