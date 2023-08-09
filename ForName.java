class ForName
{
	

/*public static void main(String[] args)throws Exception {
	Class c = Class.forName("B");
	Object obj = c.newInstance();
	System.out.println(obj);
}
}

class A
{
	static{
		System.out.println("static A");
	}
}

class B
{
	static{
		System.out.println("static B");
	}
	public void show()
	{
		System.out.println("show B");
	}
}

class C
{
	static{
		System.out.println("static C");
	}
	public void show()
	{
		System.out.println("show C");
	}*/



public static void main(String[] args)throws Exception {
	Class c = Class.forName(args[0]);
	Object obj = c.newInstance();
	if(obj instanceOf A)
	{
		A ob = (A)obj;
		ob.show();
	}

	else if(obj instanceOf B)
	{
		B ob = (B)obj;
		ob.show();
	}

	else if(obj instanceOf C)
	{
		C ob = (C)obj;
		ob.show();
	}
}
}