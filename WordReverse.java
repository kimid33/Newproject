class WordReverse
{
	//private int s;
	
static String revstr(String s,int fi,int li)
{
	char str[]=s.toCharArray();
	char c;
	while(fi<li)
	{
		c=str[fi];
		str[fi]=str[li];
		str[li]=c;
	    fi++;
	    li--;
    }
    
     //System.out.println(str);
    //return " ";
    return new String(str);
}

static int getLastIndex(String s,int index)
{
	int i;
	for(i=index;i<s.length();i++)
	{
		if(s.charAt(i)==' ')
		{
			return i-1;
		}
	}
	 return s.length()-1;
}
 public static void main(String [] args)
 {
 	int i;
	String s="hello this is kimi";
	//System.out.println(s.length());
	System.out.println(s);
	s=revstr(s,0,s.length()-1);
	System.out.println(s);
	for(i=0;i<s.length();i++)
	{
		int li=getLastIndex(s,i);
		s=revstr(s,i,li);
		i=li+1;
    }
    System.out.println(s);
 }
}