import java.util.*;
class Samples
{
  int a;
  Samples(int s)
  {
    a=s;
  }
  public boolean equals(Object ob)
  {
    if(ob instanceof Samples)
    {
      Samples s = (Samples)ob;
      return a==s.a;
    }
    return false;
  }
}
class YourArrayList
{

 public static void main(String[] args) {
	MyArrayList m = new MyArrayList();
	m.add(10);
	m.add(20);
	m.add(30);
	m.add(40);
	// m.add(new Samples(10));                           
	// m.add(new Samples(20));
	// m.add(new Samples(30));
	// m.add(new Samples(40));
	System.out.println(m);
	//System.out.println(m.get(2);
	MyArrayList m2 = new MyArrayList(m);
    m2.add(1);
    m2.add(2);
    m2.add(3);
    m.add(m2);
    System.out.println(m);
    //m2.deleteAtanyPos(2);
    //System.out.println(m);

    // m.clearAll();
    // System.out.println(m2);

    // m.update(50,4);
    // m.add(m2);                            //we are calling coz we want to add second arraylist in [] format
    // System.out.println(m);

    // m.clone(m);
    // System.out.println(m);

    // m.toArray(m);
    // System.out.println(m);

    //System.out.println(m.indexOf(new Samples(20)));
    //System.out.println(m.getlastIndex(new Samples(40)));

  }
}
	class MyArrayList
	{
		private Object values[];
		private int capacity;
		private int size;

	public MyArrayList()
	{
		this(5);
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
	public int getCapacity()
	{
		return capacity;
	}
	public int getSize()
	{
		return size+1;
	}
	public void add(Object val)
	{
		if(size==capacity-1)
		{
			// System.out.println("no space");
			// return;
		     increaseCapacity();
		}
		values[++size] = val;
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
	public String toString()
	{
		String s = "";
		for(int i=0;i<=size;i++)
		{
		 s = s+","+values[i];
	    }
          return "["+s.substring(1)+"]";
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
	public void addAll(MyArrayList mal)
	{
		for(int i=0;i<=mal.size;i++)
		{
			add(mal.get(i));
		}
	}
	public void deleteAtanyPos(int index)
    { 
      if(size==-1)
      {
         System.out.println("not found ArrayList");
      }
        size--;
        for(int i=index;i<=size;i++)
        {
          values[i] = values[i+1];
        } 
    }
    public  void clearAll()
    {
      //size=-1;
      System.out.println("cleared");
    }
    public void update(int valu,int index)
    {
      if(size==-1)
      {
         System.out.println("ArrayList not found");
      }
        values[index] = valu;
    }
    public MyArrayList clone(MyArrayList val)        //copy from original array to new array
    {
      MyArrayList arr = new MyArrayList();
       for(int i=0;i<=size;i++)
       {
          arr.add(values[i]);
       }
        return arr;
    }
    public int[] toArray(MyArrayList valu)  //ArrayList toArray() method converts an arraylist into an array and returns it.
    {
       int arr[] = new int[valu.size];
       for(int i=0;i<size;i++)
       {
          arr[i] = (int)values[i];
       }
        return arr;
    }
    public int indexOf(Object val)  //ArrayList indexOf() method returns the position of the specified element in the arraylist.
    {
       for(int i=0;i<=size;i++)
       {
         if(val.equals(values[i]))
         return i;
       }
       return -1;
    }

/*--------------------------------------------------------------------------------------------*/



}