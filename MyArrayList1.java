class MyArrayList1
{
 public static void main(String[] args) {
		MyArrayList m1 = new MyArrayList(10); 
		m1.add(10); 
		m1.add(20);
		m1.add("hi");
		//m1.add('a');
		//m1.add(5.00);
		MyArrayList m2 = new MyArrayList(m1);
		m2.add(100);
		m2.add(200);
		m1.add(m2);
		//System.out.println(m1);
		System.out.println(m1.getCapacity());
		System.out.println(m1);
	}
}

class MyArrayList
{
	private Object values[];
	private int capacity;
	private int size;
 public MyArrayList()
 {
 	this(5);//this can be passed as argument in the constructor call.
 }
 public MyArrayList(int cap)
	{
		capacity = cap;
		values = new Object[capacity];
		size = -1;
	}
	 public MyArrayList(MyArrayList m)
	 {
		this();
	 	//addAll(m);
	}
	public void add(Object val)
	{
		if(size==capacity-1)
		{
			//System.out.println("no space");
			//return;
			increaseCapacity();
		}
		values[++size] = val;
	}
	public void addAll(MyArrayList mal)
	{
		for(int i=0;i<=mal.size;i++)
		{
			add(mal.get(i));
		}
	}
	public String toString()// to get a string representation of an object
	{
		String s = "";
		for(int i=0;i<=size;i++)
		{
			s = s+", "+values[i];
		}
		return "["+s.substring(2)+"]";
	}
	public Object get(int index)
	{
		try 
		{
			return values[index];
		}
		catch(Exception e)
		{
			return null;
		}
	}
	public int getCapacity()
	{
		return capacity;
	}
	public int getSize()
	{
		return size+1;
	}
	public void increaseCapacity()
	{
		capacity = capacity+5;
		Object val[] = new Object[capacity];
		for(int i=0;i<=size;i++)
		{
			val[i] = values[i];
		}
		values = val;
	}
}