class WordCount
{
	public static void main(String[] args) {
		String s = "hello this is indore";
		int word = 1;
		s = s.trim();
		for(int i=1;i<s.length();i++)
		{
			if(s.charAt(i-1)== ' ' && s.charAt(i)!= ' ')
				word++;
		}
		System.out.println(word);
	}
}