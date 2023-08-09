class RecuRev
{
	
/*public static String strrev(String s) 
{
	if(s.length()==1)
	{
		return s;
	}
	else 
	{
		return s.charAt(s.length()-1)+""+strrev(s.substring(0,s.length()-1));
	}

}

public static void main(String[] args) 
{
	String s = "hello kimi";
	System.out.println(strrev(s));
}*/

class P
{
	P()
	{
	   System.out.println("hi");
    } 
}
class Temp extends P 
{ 
	int a;
	Temp()
	{
		this(10);
	   System.out.println("hi1");
	}
	Temp(int a)
	{
		this();
		System.out.println("Temp const int:"+a);
	}
}
public static void main(String[] args) 
{
	Temp p1 = new Temp();
	System.out.println(p1);
}
}

