public class CountDigit{
	/*private int count;
	private int n;

public static int countNumberDigit(int n){
	int i,count=0;
	while(n!=0)
	{
		count++;
		n=n/10;
	}
	return count;
}
public static void main(String [] args){
	CountDigit count=new CountDigit();
	System.out.println(count.countNumberDigit(1234));
}*/


public static void main(String[] args) {
	String s = "hello this is kimi";
	int count=0;
	for(int i=0;i<s.length();i++)
	{
	   count++;
	}
	System.out.println(count);
}
}

