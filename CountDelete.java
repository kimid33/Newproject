public class CountDelete{
	
	static int countChar(String s,char ch)
	{
		int c=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==ch)
				c++;
		}
		 return c;
	}

	 static String deleteChar(String s,int index)
	 {
	 	char ch[] = s.toCharArray();
	 	for(int i=index;i<s.length()-1;i++)
	 	{
	 		ch[i] = ch[i+1];
	 	}

	 	return new String(ch,0,s.length()-1);
	 }

	  public static void main(String[] args)
	  {
	  	String s="hello kimi anjali hi hi";
	  	for(int i=0;i<s.length();i++)
	  	{
	  		if(countChar(s,s.charAt(i))>1)
	  		{
	  			System.out.println(s.charAt(i));
	  		}
	  	}
	  }
}