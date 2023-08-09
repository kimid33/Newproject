class GroupReverse
{

static String revstr(String s,int si,int li)
{
	char ch[] = s.toCharArray();
	while(si<li)
	{
		char c = ch[si];
		ch[si] = ch[li];
		ch[li] = c;
		si++;
		li--;
	}
	return new String(ch);
}
	
static int getLastIndex(int length,int index,int group)
{
	int li=index+group-1;
	if(li>=length)
		return length-1;
	else 
		return li;
}


public static void main(String [] args)
{
	String s = "123456789abcde";
	int g=3;
	for(int i=0;i<s.length();i++)
	{
		int li=getLastIndex(s.length(),i,g);
		s=revstr(s,i,li);
		i=li;
	}
	System.out.println(s);
}
}