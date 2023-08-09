class ForN
{
	

public static void main(String[] args)throws Exception {
	Class c = Class.forName("B");  //CNFE
	Object obj = c.newInstance(); //IE
	System.out.println(obj);
	ob.show();
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
	}
}
/*public static void main(String[] args)throws Exception {
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
}*/