class DivideStr
{
	

public static void main(String [] args)
{
	String s = "123456789";
	String str[] = new String[2];
	str[0] = s.substring(0,5);
	str[1] = s.substring(5);

	 System.out.println(str[0]);
	 System.out.println(str[1]);
}
}